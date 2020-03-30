package com.eomaxl.spring.order.service.api.common;

import com.eomaxl.spring.order.service.api.entity.Order;

public class TransactionResponse 
{
	private Order order;
	private int amount;
	private String transactionId;
	private String message;
	public TransactionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionResponse(Order order, int amount, String transactionId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
		this.message = message;
	}
	
	
	
}
