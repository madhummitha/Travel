package com.prodapt.proj.travel.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
	private static List<Customer> customers;
	
	public CustomerDAOImpl() {
		customers = new ArrayList<>();
	}
	
	@Override
	public boolean addCustomer(Customer cust) {
		return customers.add(cust);
	}
	
	@Override
	public Customer findCustomer(int id) {
		Customer c = null;
		for(Customer x: customers) {
			if(x.getId() == id) {
				c = x;
				break;
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