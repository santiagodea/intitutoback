package com.example.instituto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.instituto.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {		// Le indico el tipo de dato y la primary key
}