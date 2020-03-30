package com.eomaxl.spring.payment.service.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eomaxl.spring.payment.service.api.entity.Payment;
import com.eomaxl.spring.payment.service.api.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repository;
	
	public Payment doPayment(Payment payment)
	{
		payment.setTransactionId(UUID.randomUUID().toString());
		payment.setPaymentStatus(paymentProcessing());
		return repository.save(payment);
	}
	
	public String paymentProcessing()
	{
		//should be a third party payment gateway
		return new Random().nextBoolean()?"success":"false";
	}

	public Payment findPaymentHistoryByOrderId(int orderId) {
		return repository.findByOrderId(orderId);
		
	}

}
