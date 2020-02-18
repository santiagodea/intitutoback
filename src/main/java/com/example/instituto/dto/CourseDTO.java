package com.example.instituto.dto;

import com.example.instituto.model.Course;

public class CourseDTO {

	// ATRIBUTOS
	private Long id;
	private String name;
	private String level;
	private String shift;
	private String teacher;
	private Integer hour;

	public CourseDTO() {
		super();
	}

	public CourseDTO(String name, String level, String shift, String teacher, Integer hour) {
		super();
		this.name = name;
		this.level = level;
		this.shift = shift;
		this.teacher = teacher;
		this.hour = hour;
	}

	public CourseDTO(Course course) {
		this(course.getName(), course.getLevel(), course.getShift(), course.getTeacher(), course.getStartTime());
		this.id = course.getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

}
