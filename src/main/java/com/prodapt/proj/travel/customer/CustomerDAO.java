package com.prodapt.proj.travel.customer;

public interface CustomerDAO {
	
	public boolean addCustomer(Customer cust);
	
	public Customer findCustomer(int id);
	
	public void displayAllCustomer();

}
