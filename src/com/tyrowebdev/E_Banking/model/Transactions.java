package com.tyrowebdev.E_Banking.model;

import java.math.BigDecimal;

public class Transactions {

	private String ac;
	private String from;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	private String type;
	private Double amount;
	private Double balance;
	private String date_time;
		
	
	
	public Transactions(Double balance2) {
		super();
		this.balance = balance2;
	}
	public Transactions(String ac, String from, String type, Double amount, Double balance, String date_time) {
		super();
		this.ac = ac;
		this.from = from;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.date_time = date_time;
	}
	
	

	public Transactions(String ac, String from, String type, Double amount, Double balance) {
		super();
		this.ac = ac;
		this.from = from;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	
	
}
