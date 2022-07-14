package com.prodapt.proj.travel.booking;

import java.util.ArrayList;
import java.util.List;

public class BookingDAOImpl implements BookingDAO {
	private static List<Booking> bookings;

	public BookingDAOImpl() {
		bookings = new ArrayList<>();
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
			System.out.println(b);
		}
	}

}
