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
	private static BookingDAO bookDao = new BookingDAOImpl();
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
    	do {
    		System.out.println("1. Add Customer");
    		System.out.println("2. Add Vehicle");
    		System.out.println("3. Add Cab Driver");
    		System.out.println("4. Add City Location");
    		System.out.println("5. Add Booking");
    		System.out.println("6. Display All Bookings");
    		System.out.println("Select Your Option: ");
    		int option = Integer.parseInt(sc.nextLine());
    		
    		if (option == 1) {
    			System.out.println("Enter Cutomer Details: ");
    			String line = sc.nextLine();
    			Customer customer = Customer.parseCustomer(line);
    			custDao.addCustomer(customer);
    		} else if (option == 2) {
    			System.out.println("Enter Vehicle Details: ");
    			String line = sc.nextLine();
    			Vehicle vehicle = Vehicle.parseVehicle(line);
    			vehDao.addVehicle(vehicle);
    		} else if (option == 3) {
    			System.out.println("Enter Cab Driver Details: ");
    			String line = sc.nextLine();
    			CabDriver driver = CabDriver.parseCabDriver(line);
    			cabDao.addCabDriver(driver);
    		} else if (option == 4) {
    			System.out.println("Enter City Location Details: ");
    			String line = sc.nextLine();
    			CityLocation cityLocation = CityLocation.parseCityLocation(line);
    			cityDao.addCityLocation(cityLocation);
    		} else if (option == 5) {
    			System.out.println("Enter Booking Details: ");
    			String line = sc.nextLine();
    			Booking booking = Booking.parseBooking(line);
    			bookDao.addBooking(booking);
    		} else if (option == 6) {
    			bookDao.displayAllBookings();
    		} else {
    			break;
    		}
    	} while(true);
    	
    }
}