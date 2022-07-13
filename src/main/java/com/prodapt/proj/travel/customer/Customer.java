package com.prodapt.proj.travel.customer;

public class Customer {
	private int id;
	private String userName;
	private String city;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Customer() {}
	
	public Customer(int id, String userName, String city) {
		super();
		this.id = id;
		this.userName = userName;
		this.city = city;
	}
	
	public static Customer parseCustomer(String line) {
		Customer c= null;
		String[] v = line.split(",");
		int id = Integer.parseInt(v[0]);
		String userName = v[1];
		String city = v[2];
		c = new Customer(id, userName, city);
		return c;
	}
	
	public String toString() {
		return id+" "+userName+" "+city;
	}
}
