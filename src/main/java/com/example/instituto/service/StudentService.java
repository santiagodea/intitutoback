package com.example.instituto.service;

import java.util.List;

import com.example.instituto.dto.StudentDTO;
import com.example.instituto.model.Student;

public interface StudentService {
	public StudentDTO create(StudentDTO studentDTO);
	
	public Student create(Student student);

	public StudentDTO findById(Long idStudent);

	public List<StudentDTO> findAll();

	public StudentDTO update(StudentDTO studentDTO);

	public void delete(Long idStudent);



}
