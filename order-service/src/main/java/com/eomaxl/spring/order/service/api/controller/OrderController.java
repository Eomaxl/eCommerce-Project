package com.eomaxl.spring.order.service.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eomaxl.spring.order.service.api.common.Payment;
import com.eomaxl.spring.order.service.api.common.TransactionRequest;
import com.eomaxl.spring.order.service.api.common.TransactionResponse;
import com.eomaxl.spring.order.service.api.entity.Order;
import com.eomaxl.spring.order.service.api.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController 
{
	@Autowired
	private OrderService service;
	
	@PostMapping("/bookOrders")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request)
	{ 
		
	
		return service.saveOrder(request);
		
		//do a rest call to payment and pass the order id
	}
}
