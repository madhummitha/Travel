package com.prodapt.proj.travel.customer;

public class CustomerDAOImpl implements CustomerDAO {
	private static Customer[] customers;
	private static int lastIndex;
	
	public CustomerDAOImpl(int size) {
		customers = new Customer[size];
		lastIndex = -1;
	}
	
	@Override
	public boolean addCustomer(Customer cust) {
		boolean result = false;
		if (lastIndex + 1 > customers.length) {
			result = false;
		} else {
			lastIndex++;
			customers[lastIndex] = cust;
		}
		return result;
	}
	
	@Override
	public Customer findCustomer(int id) {
		Customer c = null;
		for(Customer x: customers) {
			if(x.getId() == id) {
				c = x;
			}
		}
		return c;
	}
	
	@Override
	public void displayAllCustomer() {
		for (Customer x: customers) {
			System.out.println(x);
		}		
	}
}