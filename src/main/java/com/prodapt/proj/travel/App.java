package com.prodapt.proj.travel;

import java.util.Scanner;

import com.prodapt.proj.travel.booking.Booking;
import com.prodapt.proj.travel.booking.BookingDAO;
import com.prodapt.proj.travel.booking.BookingDAOImpl;
import com.prodapt.proj.travel.customer.Customer;
import com.prodapt.proj.travel.customer.CustomerDAO;
import com.prodapt.proj.travel.customer.CustomerDAOImpl;
import com.prodapt.proj.travel.driver.CabDriver;
import com.prodapt.proj.travel.driver.CabDriverDAO;
import com.prodapt.proj.travel.driver.CabDriverDAOImpl;
import com.prodapt.proj.travel.util.CityLocation;
import com.prodapt.proj.travel.util.CityLocationDAO;
import com.prodapt.proj.travel.util.CityLocationDAOImpl;
import com.prodapt.proj.travel.vehicle.Vehicle;
import com.prodapt.proj.travel.vehicle.VehicleDAO;
import com.prodapt.proj.travel.vehicle.VehicleDAOImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private static CustomerDAO custDao = new CustomerDAOImpl();
	private static VehicleDAO vehDao = new VehicleDAOImpl();
	private static CabDriverDAO cabDao = new CabDriverDAOImpl();
	private static CityLocationDAO cityDao = new CityLocationDAOImpl();
	private static BookingDAO bookDao = new BookingDAOImpl(vehDao, cabDao,cityDao,custDao);
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
    	do {
    		System.out.println("1. Add Booking");
    		System.out.println("2. List All Bookings");
    		System.out.println("3. Select Option");

    		int option = Integer.parseInt(sc.nextLine());
    		
    		if (option == 1) {
    			System.out.println("Enter Booking Details: ");
    			String line = sc.nextLine();
    			Booking booking = BookingDAOImpl.parseBooking(line);
    			bookDao.addBooking(booking);
    		} else if (option == 2) {
    			bookDao.displayAllBookings();
    		} else {
    			break;
    		}
    	} while(true);
    	
    }
}