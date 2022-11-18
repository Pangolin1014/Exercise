package com.myatis;

public class User {
	

	private int id;
	
	private int password;
	
	private int age;
	
	private String sex;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getPassword() {
		return password;
	}




	public void setPassword(int password) {
		this.password = password;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}




	public User(int id,int password,int age,String sex) {
		this.id=id;
		this.password=password;
		this.age=age;
		this.sex=sex;
	}
	
	
	

}
