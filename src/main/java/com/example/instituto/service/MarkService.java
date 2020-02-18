package com.example.instituto.service;

import java.util.List;

import com.example.instituto.dto.MarkDTO;
import com.example.instituto.dto.MarksBySCDTO;
import com.example.instituto.dto.NewMarkDTO;
import com.example.instituto.dto.ScidDTO;
import com.example.instituto.model.Mark;

public interface MarkService {
	public MarkDTO create(MarkDTO markDTO);
	
	public Mark create(Mark mark);

	public MarkDTO findById(Long idMark);

	public List<MarkDTO> findAll();

	public MarkDTO update(MarkDTO markDTO);

	public MarksBySCDTO marksBySC(ScidDTO scidDTO);

	public Mark addMark(NewMarkDTO newMarkDTO);

	MarkDTO deleteById(MarkDTO markDTO);

	MarksBySCDTO marksByIdsSC(Long IdC, Long IdS);

	
}
