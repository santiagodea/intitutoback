package com.example.instituto.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.example.instituto.model.Mark;
import com.example.instituto.model.StudentCourse;

public class MarksBySCDTO {

	// ATRIBUTOS
	private StudentCourseDTO scDTO;
	private List<MarkDTO> marksListDTO;

	public MarksBySCDTO() {
		super();
	}

	public MarksBySCDTO(StudentCourse sc, List<Mark> listMarks) {
		super();
		this.scDTO = new StudentCourseDTO(sc);
		this.marksListDTO = this.convertToDTO(listMarks);
	}

	private List<MarkDTO> convertToDTO(List<Mark> listMark) {
		List<MarkDTO> listDTOs = listMark.stream().map(s -> new MarkDTO(s)).collect(Collectors.toList());
		return listDTOs;
	}

	public StudentCourseDTO getScDTO() {
		return scDTO;
	}

	public void setScDTO(StudentCourseDTO scDTO) {
		this.scDTO = scDTO;
	}

	public List<MarkDTO> getMarksListDTO() {
		return marksListDTO;
	}

	public void setMarksListDTO(List<MarkDTO> marksListDTO) {
		this.marksListDTO = marksListDTO;
	}
	
}
