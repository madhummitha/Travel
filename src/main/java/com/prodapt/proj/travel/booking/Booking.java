package com.prodapt.proj.travel.booking;

import com.prodapt.proj.travel.customer.Customer;
import com.prodapt.proj.travel.driver.CabDriver;
import com.prodapt.proj.travel.util.CityLocation;
import com.prodapt.proj.travel.vehicle.Vehicle;

public class Booking {
	private int bookingNo;
	private String pickupFrom;
	private String dropAt;
	private Customer customer;
	private Vehicle vehicle;
	private CabDriver driver;
	private double fare;

	public int getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}

	public String getPickupFrom() {
		return pickupFrom;
	}

	public void setPickupFrom(String pickupFrom) {
		this.pickupFrom = pickupFrom;
	}

	public String getDropAt() {
		return dropAt;
	}

	public void setDropAt(String dropAt) {
		this.dropAt = dropAt;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public CabDriver getDriver() {
		return driver;
	}

	public void setDriver(CabDriver driver) {
		this.driver = driver;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Booking() {
	}

	public Booking(int bookingNo, String pickupFrom, String dropAt, Customer customer, Vehicle vehicle,
			CabDriver driver) {
		super();
		this.bookingNo = bookingNo;
		this.pickupFrom = pickupFrom;
		this.dropAt = dropAt;
		this.customer = customer;
		this.vehicle = vehicle;
		this.driver = driver;
	}
	
	public static Booking parseBooking(String line) {
		Booking b = null;
		String[] v = line.split(",");
		int bookingNo = Integer.parseInt(v[0]);
		String pickupFrom = v[1];
		String dropAt = v[2];
		
		b = new Booking(bookingNo, pickupFrom, dropAt,);
		return b;
	}
	
	public String toString() {
		return bookingNo+" "+pickupFrom+" "+dropAt+" "+customer+" "+vehicle+" "+driver+" "+fare;
	}
}
