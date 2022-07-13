package com.prodapt.proj.travel.vehicle;

public class VehicleDAOImpl implements VehicleDAO{
	private static Vehicle[] vehicles;
	private static int lastIndex;
	
	public VehicleDAOImpl(int size) {
		vehicles = new Vehicle[size];
		lastIndex = -1;
	}

	@Override
	public boolean addVehicle(Vehicle vehicle) {
		boolean result = false;
		if (lastIndex + 1 > vehicles.length) {
			result = false;
		} else {
			lastIndex++;
			vehicles[lastIndex] = vehicle;
		}
		return result;
	}

	@Override
	public Vehicle findVehicle(String vehicleNo) {
		Vehicle v = null;
		for (Vehicle x: vehicles) {
			if (x.getVehicleNo() == vehicleNo) {
				v = x;
			}
		}
		return v;
	}

	@Override
	public void displayAllVehicles() {
		for (Vehicle v: vehicles) {
			System.out.println(v);
		}
	}
}
