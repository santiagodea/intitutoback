package com.example.instituto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.instituto.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {		// Le indico el tipo de dato y la primary key
}
