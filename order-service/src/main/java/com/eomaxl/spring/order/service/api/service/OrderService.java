package com.eomaxl.spring.order.service.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eomaxl.spring.order.service.api.common.Payment;
import com.eomaxl.spring.order.service.api.common.TransactionRequest;
import com.eomaxl.spring.order.service.api.common.TransactionResponse;
import com.eomaxl.spring.order.service.api.entity.Order;
import com.eomaxl.spring.order.service.api.repository.OrderRepository;

@Service
public class OrderService 
{
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private OrderRepository repository;
	
	public TransactionResponse saveOrder(TransactionRequest request)
	{	String response = "";
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		
		//rest call
		Payment paymentResponse= restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		 
		response = paymentResponse.getPaymentStatus().equals("success")?"payment processing successful":"there is a failure";
		repository.save(order);
		return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
	}
}
