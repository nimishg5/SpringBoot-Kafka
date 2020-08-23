package com.example.springbootkafkaproducer.model;

public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}
	
	private String name;
	private long salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
