package com.myatis;

public class Customer{
	
	private int customer_id;
	private int customer_password;
	private String customer_name;
	private String customer_address;
	private String customer_type;
	
	public Customer(int customer_id, int customer_password, String customer_name, String customer_address,
			String customer_type) {
		super();
		this.customer_id = customer_id;
		this.customer_password = customer_password;
		this.customer_name = customer_name;
		this.customer_address = customer_address;
		this.customer_type = customer_type;
	}
	public String getCustomer_type() {
		return customer_type;
	}
	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public int getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(int customer_password) {
		this.customer_password = customer_password;
	}
	
	

}
