package com.example.instituto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.instituto.dto.MarkDTO;
import com.example.instituto.dto.MarksBySCDTO;
import com.example.instituto.dto.NewMarkDTO;
import com.example.instituto.dto.ScidDTO;
import com.example.instituto.model.Mark;
import com.example.instituto.model.StudentCourse;
import com.example.instituto.repository.MarkRepository;
import com.example.instituto.repository.StudentCourseRepository;

@Service
public class MarkServiceImpl implements MarkService {


	// ATRIBUTOS
	@Autowired
	private MarkRepository markRepository;

	@Autowired
	private StudentCourseRepository scRepository;

	@Override
	@Transactional(rollbackFor =  Exception.class)
	public Mark create(Mark mark) {
		StudentCourse st = this.scRepository.findById(mark.getStudentCourse().getId()).orElse(null);
		Mark mark1 = new Mark(mark.getCalification(), mark.getUnit(), mark.getDate(), st);
		markRepository.save(mark1);
		return mark1;
	}

	@Override
	@Transactional(rollbackFor =  Exception.class)
	public MarkDTO create(MarkDTO markDTO) {
		StudentCourse st = this.scRepository.findById(markDTO.getIdStudentCourse()).orElse(null);
		Mark mark = new Mark(markDTO.getCalification(), markDTO.getUnit(), markDTO.getDate(), st);
		this.markRepository.save(mark);
		return new MarkDTO(mark);
	}

	@Override
	public MarkDTO findById(Long idMark) {
		Mark mark = this.markRepository.findById(idMark).orElse(null);
		MarkDTO markDto = null;
		if (mark != null) {
			markDto = new MarkDTO(mark);
		}
		return markDto;
	}

	@Override
	public List<MarkDTO> findAll() {
		List<Mark> marks = (List<Mark>) this.markRepository.findAll();
		List<MarkDTO> marksDTO = new ArrayList<MarkDTO>();
		marks.stream().filter(m -> m.getDate_deleted() == null).forEach(mark -> marksDTO.add(new MarkDTO(mark)));
		return marksDTO;
	}

	@Override
	@Transactional(rollbackFor =  Exception.class)
	public MarkDTO update(MarkDTO markDTO) {
		Mark mark = this.markRepository.findById(markDTO.getId()).get();
		mark.setCalification(markDTO.getCalification());
		mark.setDate(markDTO.getDate());
		mark.setUnit(markDTO.getUnit());
		StudentCourse st = this.scRepository.findById(markDTO.getIdStudentCourse()).orElse(null);
		mark.setStudentCourse(st);
		mark = this.markRepository.save(mark);
		return markDTO;
	}

	@Override
	@Transactional(rollbackFor =  Exception.class)
	public MarkDTO deleteById(MarkDTO markDTO) {
		Mark mark = this.markRepository.findById(markDTO.getId()).orElse(null);
		mark.setCalification(markDTO.getCalification());
		mark.setDate(markDTO.getDate());
		mark.setUnit(markDTO.getUnit());
		StudentCourse st = this.scRepository.findById(markDTO.getIdStudentCourse()).orElse(null);
		mark.setStudentCourse(st);
		mark.setDate_deleted(markDTO.getDate_deleted());
		mark = this.markRepository.save(mark);
		return markDTO;
	}
	
	@Override
	@Transactional(rollbackFor =  Exception.class)
	public MarksBySCDTO marksBySC(ScidDTO scidDTO) {
		StudentCourse sc = this.scRepository.findByIdCourseAndStudent(scidDTO.getIdStudent(), scidDTO.getIdCourse());
		List<Mark> listMarks = this.markRepository.findByIdSC(sc.getId()).stream().filter(m -> m.getDate_deleted() == null).collect(Collectors.toList());

		MarksBySCDTO marksbyDTO = new MarksBySCDTO(sc, listMarks);
		return marksbyDTO;
	}
	
	@Override
	@Transactional(rollbackFor =  Exception.class)
	public MarksBySCDTO marksByIdsSC(Long IdC, Long IdS) {
		StudentCourse sc = this.scRepository.findByIdCourseAndStudent(IdC, IdS);
		List<Mark> listMarks = this.markRepository.findByIdSC(sc.getId()).stream().filter(m -> m.getDate_deleted() == null).collect(Collectors.toList());

		MarksBySCDTO marksbyDTO = new MarksBySCDTO(sc, listMarks);
		return marksbyDTO;
	}
	
	@Override
	@Transactional(rollbackFor =  Exception.class)
	public Mark addMark(NewMarkDTO newMarkDTO) {
		StudentCourse sc = this.scRepository.findByIdCourseAndStudent( newMarkDTO.getIdCourse(), newMarkDTO.getIdStudent());
		Mark mark1 = new Mark(newMarkDTO.getMark(), newMarkDTO.getUnit(), newMarkDTO.getDate(), sc);
		System.out.println("STUDENT COURSE A GUARDAR" + sc);
		markRepository.save(mark1);	
		return mark1;
	}
}