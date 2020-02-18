package com.example.instituto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.instituto.dto.PaymentByStudentDTO;
import com.example.instituto.dto.PaymentDTO;
import com.example.instituto.model.Payment;
import com.example.instituto.model.Student;
import com.example.instituto.repository.PaymentRepository;
import com.example.instituto.repository.StudentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	// ATRIBUTOS
	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public Payment create(Payment payment) {
		Student student = this.studentRepository.findById(payment.getStudent().getId()).orElse(null);
		Payment payment1 = new Payment(payment.getMonth(), payment.getAmount(), payment.getDate_payment(), student);
		paymentRepository.save(payment1);
		return payment1;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PaymentDTO create(PaymentDTO paymentDTO) {
		Student student = this.studentRepository.findById(paymentDTO.getIdStudent()).orElse(null);
		Payment payment = new Payment(paymentDTO.getMonth(), paymentDTO.getAmount(), paymentDTO.getDate_payment(),
				student);
		this.paymentRepository.save(payment);
		return new PaymentDTO(payment);
	}

	@Override
	public PaymentDTO findById(Long idPayment) {
		Payment payment = this.paymentRepository.findById(idPayment).orElse(null);
		PaymentDTO paymentDto = null;
		if (payment != null) {
			paymentDto = new PaymentDTO(payment);
		}
		return paymentDto;
	}

	@Override
	public List<PaymentDTO> findAll() {
		List<Payment> payments = (List<Payment>) this.paymentRepository.findAll();
		List<PaymentDTO> paymentsDTO = new ArrayList<PaymentDTO>();
		payments.stream().filter(p -> p.getDate_deleted() == null).forEach(pay -> paymentsDTO.add(new PaymentDTO(pay)));
		return paymentsDTO;
	}

	@Override
	public PaymentDTO update(PaymentDTO paymentDTO) {
		Payment payment = this.paymentRepository.findById(paymentDTO.getId()).get();
		Student student = this.studentRepository.findById(paymentDTO.getIdStudent()).orElse(null);
		payment.setAmount(paymentDTO.getAmount());
		payment.setDate_payment(paymentDTO.getDate_payment());
		payment.setMonth(paymentDTO.getMonth());
		payment.setStudent(student);

		payment = this.paymentRepository.save(payment);
		return paymentDTO;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PaymentDTO deleteById(PaymentDTO paymentDTO) {
		Payment payment = this.paymentRepository.findById(paymentDTO.getId()).get();
		Student student = this.studentRepository.findById(paymentDTO.getIdStudent()).orElse(null);
		payment.setAmount(paymentDTO.getAmount());
		payment.setDate_payment(paymentDTO.getDate_payment());
		payment.setMonth(paymentDTO.getMonth());
		payment.setStudent(student);
		payment.setDate_deleted(paymentDTO.getDate_deleted());

		payment = this.paymentRepository.save(payment);
		return paymentDTO;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PaymentByStudentDTO paymentsByStudent(Long idStudent) {
		Student student = this.studentRepository.findById(idStudent).orElse(null);
		;
		List<Payment> listPayment = this.paymentRepository.findByIdStudent(idStudent);

		listPayment = listPayment.stream().filter(p -> p.getDate_deleted() == null).collect(Collectors.toList());

		PaymentByStudentDTO paymentsByStudentDTO = new PaymentByStudentDTO(student, listPayment);
		return paymentsByStudentDTO;
	}
}