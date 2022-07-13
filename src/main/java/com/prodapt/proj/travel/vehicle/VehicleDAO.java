package com.prodapt.proj.travel.vehicle;

public interface VehicleDAO {
	
	public boolean addVehicle(Vehicle vehicle);
	
	public Vehicle findVehicle(String vehicleNo);
	
	public void displayAllVehicles();
}
