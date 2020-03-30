package com.eomaxl.spring.payment.service.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eomaxl.spring.payment.service.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{
	
	Payment findByOrderId(int orderId);

}
