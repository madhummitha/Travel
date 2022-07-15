package com.prodapt.proj.travel.vehicle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleDAOImpl implements VehicleDAO {
	private static List<Vehicle> vehicles;

	public VehicleDAOImpl() {
		vehicles = new ArrayList<>();
		try (InputStream is = new FileInputStream("src/main/resources/vehicles.txt");
				Scanner sc = new Scanner(is);) {
			while (sc.hasNextLine()) {
			String line = sc.nextLine();
			Vehicle v = Vehicle.parseVehicle(line);
			vehicles.add(v);
			}
			sc.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
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
