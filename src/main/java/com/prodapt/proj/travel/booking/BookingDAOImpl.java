package com.prodapt.proj.travel.booking;

import java.util.ArrayList;
import java.util.List;

import com.prodapt.proj.travel.customer.Customer;
import com.prodapt.proj.travel.customer.CustomerDAO;
import com.prodapt.proj.travel.customer.CustomerDAOImpl;
import com.prodapt.proj.travel.driver.CabDriver;
import com.prodapt.proj.travel.driver.CabDriverDAO;
import com.prodapt.proj.travel.driver.CabDriverDAOImpl;
import com.prodapt.proj.travel.util.CityLocationDAO;
import com.prodapt.proj.travel.vehicle.Vehicle;
import com.prodapt.proj.travel.vehicle.VehicleDAO;
import com.prodapt.proj.travel.vehicle.VehicleDAOImpl;

public class BookingDAOImpl implements BookingDAO {
	private static List<Booking> bookings;
	private static VehicleDAO vehDao;
	private static CabDriverDAO cabDao;
	private static CityLocationDAO cityDao;
	private static CustomerDAO custDao;

	

	public BookingDAOImpl(VehicleDAO vehDao, CabDriverDAO cabDao, CityLocationDAO cityDao, CustomerDAO custDao) {
		// TODO Auto-generated constructor stub
		bookings = new ArrayList<>();
		this.vehDao = vehDao;
		this.cabDao = cabDao;
		this.cityDao = cityDao;
		this.custDao = custDao;
	}

	@Override
	public boolean addBooking(Booking booking) {
		return bookings.add(booking);
	}

	@Override
	public Booking findBooking(int bookingNo) {
		Booking b = null;
		for (Booking x : bookings) {
			if (x.getBookingNo() == bookingNo) {
				b = x;
			}
		}
		return b;
	}

	@Override
	public void displayAllBookings() {
		for (Booking b : bookings) {
			b.CalculateFare();
			System.out.println(b);
		}
	}
	
	public static Booking parseBooking(String line) {
		Booking b = null;
		String[] v = line.split(",");
		int bookingNo = Integer.parseInt(v[0].trim());
		String pickupFrom = v[1];
		String dropAt = v[2];
		Customer customer = custDao.findCustomer(Integer.parseInt(v[3].trim()));
		Vehicle vehicle = vehDao.findVehicle(v[4].trim());
		CabDriver driver = cabDao.findCabDriver(Integer.parseInt(v[5].trim()));
		
		b = new Booking(bookingNo, pickupFrom, dropAt, customer, vehicle, driver);
		return b;
	}

}
