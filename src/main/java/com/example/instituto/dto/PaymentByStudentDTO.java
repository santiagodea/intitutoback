package com.example.instituto.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.example.instituto.model.Payment;
import com.example.instituto.model.Student;

public class PaymentByStudentDTO {

	private StudentDTO studentDTO;
	private List<PaymentDTO> paymentListDTO;

	public PaymentByStudentDTO() {
		super();
	}

	public PaymentByStudentDTO(Student student, List<Payment> listPayment) {
		super();
		this.studentDTO = new StudentDTO(student);
		this.paymentListDTO = this.convertToDTO(listPayment);
	}
	
	private List<PaymentDTO> convertToDTO(List<Payment> listPayment) {
		List<PaymentDTO> listDTOs = listPayment.stream().map(s -> new PaymentDTO(s)).collect(Collectors.toList());
		return listDTOs;
	}

	public StudentDTO getStudentDTO() {
		return studentDTO;
	}

	public void setStudentDTO(StudentDTO studentDTO) {
		this.studentDTO = studentDTO;
	}

	public List<PaymentDTO> getPaymentListDTO() {
		return paymentListDTO;
	}

	public void setPaymentListDTO(List<PaymentDTO> paymentListDTO) {
		this.paymentListDTO = paymentListDTO;
	}

}
