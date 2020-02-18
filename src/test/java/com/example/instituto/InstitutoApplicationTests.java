package com.example.instituto;

import java.time.LocalDate;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.util.Assert;

import com.example.instituto.model.Course;
import com.example.instituto.model.Mark;
import com.example.instituto.model.Payment;
import com.example.instituto.model.Student;
import com.example.instituto.model.StudentCourse;
import com.example.instituto.service.CourseService;
import com.example.instituto.service.MarkService;
import com.example.instituto.service.PaymentService;
import com.example.instituto.service.StudentCourseService;
import com.example.instituto.service.StudentService;

//@RunWith(SpringRunner.class)
@SpringBootTest(classes = InstitutoApplication.class)
@TestPropertySource(locations = "classpath:test.properties")
//@ContextConfiguration (locations = "classpath*:/spring/applicationContext*.xml")
public class InstitutoApplicationTests {

	@Autowired
	private CourseService courseService;

	@Autowired
	private MarkService markService;

	@Autowired
	private PaymentService paymentService;

	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentCourseService studentCourseService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testA() {

		// LocalDate hoy = LocalDate.now();

		// Course cursoA = new Course("Pre-Kinder", "1", "Tomorrow", "jose", 10);
		// Course cursoB = new Course("Kinder", "1", "Tomorrow", "maria", 11);
		// Course cursoC = new Course("Kinder", "2", "Tomorrow", "luis", 15);
		// Course cursoD = new Course("Kinds", "1", "Tomorrow", "ana", 19);
		// Course cursoE = new Course("Kinds", "2", "Tomorrow", "ana", 19);
		// Course cursoF = new Course("Kinds", "3", "Tomorrow", "ana", 19);
		// Course cursoG = new Course("Kinds", "1", "Tomorrow", "ana", 19);
		// Course cursoH = new Course("Teens", "1", "Afternoon", "ana", 19);
		// Course cursoI = new Course("Teens", "2", "Afternoon", "ana", 19);
		// Course cursoJ = new Course("Teens", "3", "Afternoon", "ana", 19);
		// Course cursoK = new Course("Teens", "4", "Afternoon", "ana", 19);

		// cursoA = this.courseService.create(cursoA);
		// Assert.notNull(cursoA.getId());
		// cursoB = this.courseService.create(cursoB);
		// Assert.notNull(cursoB.getId());
		// cursoC = this.courseService.create(cursoC);
		// Assert.notNull(cursoC.getId());
		// cursoD = this.courseService.create(cursoD);
		// Assert.notNull(cursoD.getId());
		// cursoE = this.courseService.create(cursoD);
		// Assert.notNull(cursoE.getId());
		// cursoF = this.courseService.create(cursoE);
		// Assert.notNull(cursoF.getId());
		// cursoG = this.courseService.create(cursoG);
		// Assert.notNull(cursoG.getId());
		// cursoH = this.courseService.create(cursoH);
		// Assert.notNull(cursoH.getId());
		// cursoI = this.courseService.create(cursoI);
		// Assert.notNull(cursoI.getId());
		// cursoJ = this.courseService.create(cursoJ);
		// Assert.notNull(cursoJ.getId());
		// cursoK = this.courseService.create(cursoK);
		// Assert.notNull(cursoK.getId());

		// Student estudiante1 = new Student(123, "java", "juan", "juan@java.com", "2243", "2241");
		// Student estudiante2 = new Student(1234, "phiton", "marta", "marta@phiton.com", "2243", "2241");
		// Student estudiante3 = new Student(12345, "scala", "roberto", "roberto@scala.com", "2243", "2241");
		// Student estudiante4 = new Student(123456, "ruby", "alberto", "alberto@ruby.com", "2243", "2241");
		// Student estudiante5 = new Student(1234567, "php", "domingo", "domingo@php.com", "2243", "2241");

		// estudiante1 = this.studentService.create(estudiante1);
		// Assert.notNull(estudiante1.getId());
		// estudiante2 = this.studentService.create(estudiante2);
		// Assert.notNull(estudiante2.getId());
		// estudiante3 = this.studentService.create(estudiante3);
		// Assert.notNull(estudiante3.getId());
		// estudiante4 = this.studentService.create(estudiante4);
		// Assert.notNull(estudiante4.getId());
		// estudiante5 = this.studentService.create(estudiante5);
		// Assert.notNull(estudiante5.getId());

		// StudentCourse sc1 = new StudentCourse(2019, estudiante1, cursoA);
		// StudentCourse sc2 = new StudentCourse(2019, estudiante2, cursoA);
		// StudentCourse sc3 = new StudentCourse(2019, estudiante3, cursoB);
		// StudentCourse sc4 = new StudentCourse(2019, estudiante4, cursoB);
		// StudentCourse sc5 = new StudentCourse(2019, estudiante5, cursoB);

		// sc1 = this.studentCourseService.create(sc1);
		// Assert.notNull(sc1.getId());
		// sc2 = this.studentCourseService.create(sc2);
		// Assert.notNull(sc2.getId());
		// sc3 = this.studentCourseService.create(sc3);
		// Assert.notNull(sc3.getId());
		// sc4 = this.studentCourseService.create(sc4);
		// Assert.notNull(sc4.getId());
		// sc5 = this.studentCourseService.create(sc5);
		// Assert.notNull(sc5.getId());

		// Mark marka1 = new Mark(10, 1, hoy, sc1);
		// Mark marka12 = new Mark(9, 2, hoy, sc1);
		// Mark marka13 = new Mark(9.5, 3, hoy, sc1);
		// Mark marka2 = new Mark(5, 1, hoy, sc2);

		// marka1 = this.markService.create(marka1);
		// Assert.notNull(marka1.getId());
		// marka12 = this.markService.create(marka12);
		// Assert.notNull(marka12.getId());
		// marka13 = this.markService.create(marka13);
		// Assert.notNull(marka13.getId());
		// marka2 = this.markService.create(marka2);
		// Assert.notNull(marka2.getId());

		// Payment pago1 = new Payment("January", 300.00, hoy, estudiante1);
		// Payment pago2 = new Payment("February", 300.00, hoy, estudiante1);
		// Payment pago3 = new Payment("March", 400.00, hoy, estudiante1);
		// Payment pago4 = new Payment("April", 400.00, hoy, estudiante1);
		// Payment pago11 = new Payment("January", 300.00, hoy, estudiante2);
		// Payment pago12 = new Payment("February", 300.00, hoy, estudiante2);
		// Payment pago13 = new Payment("March", 400.00, hoy, estudiante2);

		// pago1 = this.paymentService.create(pago1);
		// Assert.notNull(pago1.getId());
		// pago2 = this.paymentService.create(pago2);
		// Assert.notNull(pago2.getId());
		// pago3 = this.paymentService.create(pago3);
		// Assert.notNull(pago3.getId());
		// pago4 = this.paymentService.create(pago4);
		// Assert.notNull(pago4.getId());
		// pago11 = this.paymentService.create(pago11);
		// Assert.notNull(pago11.getId());
		// pago12 = this.paymentService.create(pago12);
		// Assert.notNull(pago12.getId());
		// pago13 = this.paymentService.create(pago13);
		// Assert.notNull(pago13.getId());

	}
}
