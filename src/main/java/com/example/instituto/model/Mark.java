package com.example.instituto.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name = "Mark")
@Table(name = "mark")
public class Mark {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "nativoDeBaseDeDatos")
	@GenericGenerator(name = "nativoDeBaseDeDatos", strategy = "native")
	private Long id;
	
	@Type(type = "double")
	private double calification;
	
	@Column(length = 255, nullable = false)
	@Type(type = "integer")
	private Integer unit; //es la "unidad" que se evalua por la cuals e le pone la nota unidad 1/unidad 2/etc, tema1/tema2/tema3, o una referencia...
	
	@Column(nullable = false)
	private LocalDate date;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "studentCourseId")
	private StudentCourse studentCourse;
	
	private LocalDate date_deleted;

	//CONSTRUCTORES
	public Mark() {
		super();
	}
	
	public Mark(double c, Integer unit, LocalDate date, StudentCourse studentCourse) {
		super();
		this.calification = c;
		this.unit = unit;
		this.date = date;
		this.studentCourse = studentCourse;
		this.date_deleted = null;
	}

	//HASHCODE AND EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Mark))
			return false;
		Mark other = (Mark) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	//SETTERS AND GETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getCalification() {
		return calification;
	}

	public void setCalification(double calification) {
		this.calification = calification;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public StudentCourse getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(StudentCourse studentCourse) {
		this.studentCourse = studentCourse;
	}

	public LocalDate getDate_deleted() {
		return date_deleted;
	}

	public void setDate_deleted(LocalDate date_deleted) {
		this.date_deleted = date_deleted;
	}
	
}
