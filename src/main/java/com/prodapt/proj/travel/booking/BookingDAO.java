package com.prodapt.proj.travel.booking;

public interface BookingDAO {

	public boolean addBooking(Booking booking);

	public Booking findBooking(int bookingNo);

	public void displayAllBookings();
}
