package com.example.instituto.service;

import java.util.List;

import com.example.instituto.dto.CourseWithStudentsDTO;
import com.example.instituto.dto.ScidDTO;
import com.example.instituto.dto.StudentCourseDTO;
import com.example.instituto.model.StudentCourse;

public interface StudentCourseService {
	
	public StudentCourse create(StudentCourse studentCourse);
	
	public StudentCourseDTO create(StudentCourseDTO studentCourseDTO);

	public StudentCourseDTO findById(Long idStudentCourse);

	public List<StudentCourseDTO> findAll();

	public StudentCourseDTO update(StudentCourseDTO studentCourseDTO);

	public void delete(Long idStudentCourse);

	public CourseWithStudentsDTO findByIdWithStudents(Long idCourse);

	public ScidDTO deleteById(ScidDTO scidDTO);

}
