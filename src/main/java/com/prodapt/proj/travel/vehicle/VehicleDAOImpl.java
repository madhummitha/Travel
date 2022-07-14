package com.prodapt.proj.travel.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleDAOImpl implements VehicleDAO {
	private static List<Vehicle> vehicles;

	public VehicleDAOImpl() {
		vehicles = new ArrayList<>();
	}

	@Override
	public boolean addVehicle(Vehicle vehicle) {
		return vehicles.add(vehicle);
	}

	@Override
	public Vehicle findVehicle(String vehicleNo) {
		Vehicle v = null;
		for (Vehicle x : vehicles) {
			if (x.getVehicleNo().equals(vehicleNo)) {
				v = x;
			}
		}
		return v;
	}

	@Override
	public void displayAllVehicles() {
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}
	}
}
