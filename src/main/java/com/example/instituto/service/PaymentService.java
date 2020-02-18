package com.example.instituto.service;

import java.util.List;

import com.example.instituto.dto.PaymentByStudentDTO;
import com.example.instituto.dto.PaymentDTO;
import com.example.instituto.model.Payment;

public interface PaymentService {
	public PaymentDTO create(PaymentDTO paymentDTO);
	
	public Payment create (Payment payment);

	public PaymentDTO findById(Long idPayment);

	public List<PaymentDTO> findAll();

	public PaymentDTO update(PaymentDTO paymentDTO);

	PaymentByStudentDTO paymentsByStudent(Long idStudent);

	PaymentDTO deleteById(PaymentDTO paymentDTO);
}
