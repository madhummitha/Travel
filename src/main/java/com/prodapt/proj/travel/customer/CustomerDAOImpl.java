package com.prodapt.proj.travel.customer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDAOImpl implements CustomerDAO {
	private static List<Customer> customers;
	
	public CustomerDAOImpl() {
		customers = new ArrayList<>();
		try (InputStream is = new FileInputStream("src/main/resources/customers.txt");
				Scanner sc = new Scanner(is);){			
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				Customer c = Customer.parseCustomer(line);
				customers.add(c);
			}
			sc.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
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