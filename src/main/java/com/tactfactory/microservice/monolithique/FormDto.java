package com.tactfactory.microservice.monolithique;

import java.math.BigDecimal;

public class FormDto {

	private String from;
	private String to;
	private BigDecimal amount;
	private BigDecimal totalCalculatedAmount;
	
	
	
	public String getFrom() {
	return from;
	}
	public void setFrom(String from) {
	this.from = from;
	}
	public String getTo() {
	return to;
	}
	public void setTo(String to) {
	this.to = to;
	}
	public BigDecimal getAmount() {
	return amount;
	}
	public void setAmount(BigDecimal amount) {
	this.amount = amount;
	}
	public BigDecimal getTotalCalculatedAmount() {
	return this.totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
	this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public FormDto() {
	}
	// creating constructor
	public FormDto(String from, String to, BigDecimal amount, BigDecimal totalCalculatedAmount) {
	super();
	this.from = from;
	this.to = to;
	this.totalCalculatedAmount = totalCalculatedAmount;
	}
	@Override
	public String toString() {
	return String.format("Convert %s %s give %s %s", this.amount, this.from,
	this.totalCalculatedAmount, this.to);
	}
	
}
