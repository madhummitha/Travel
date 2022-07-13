package com.prodapt.proj.travel.driver;

import com.prodapt.proj.travel.customer.Customer;

public class CabDriver {
	private int id;
	private String driverName;
	private String gender;
	private int age;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public CabDriver() {}
	
	public CabDriver(int id, String driverName, String gender, int age) {
		super();
		this.id = id;
		this.driverName = driverName;
		this.gender = gender;
		this.age = age;
	}
	
	public static CabDriver parseCabDriver(String line) {
		CabDriver c= null;
		String[] v = line.split(",");
		int id = Integer.parseInt(v[0]);
		String driverName = v[1];
		String gender = v[2];
		int age = Integer.parseInt(v[3]);
		c = new CabDriver(id, driverName, gender, age);
		return c;
	}
	
	public String toString() {
		return id+" "+driverName+" "+gender+" "+age;
	}
	
}
