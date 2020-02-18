package com.example.instituto.service;

import java.util.List;

import com.example.instituto.dto.CourseDTO;
import com.example.instituto.model.Course;

public interface CourseService {

	public CourseDTO create(CourseDTO courseDTO);
	
	public Course create(Course course);

	public CourseDTO findById(Long idCourse);

	public List<CourseDTO> findAll();

	public CourseDTO update(CourseDTO courseDTO);

	public void delete(Long idCourse);

}
