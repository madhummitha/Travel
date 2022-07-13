package com.prodapt.proj.travel.vehicle;

public class Vehicle {
	private String vehicleNo;
	private String vehicleModel;
	private String vehicleType;
	private String vehicleColor;
	
	public String getVehicleNo() {
		return vehicleNo;
	}
	
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	
	public String getVehicleModel() {
		return vehicleModel;
	}
	
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public String getVehicleColor() {
		return vehicleColor;
	}
	
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public Vehicle() {}
	
	public Vehicle(String vehicleNo, String vehicleModel, String vehicleType, String vehicleColor) {
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleModel = vehicleModel;
		this.vehicleType = vehicleType;
		this.vehicleColor = vehicleColor;
	}
	
	public static Vehicle parseVehicle(String line) {
		Vehicle v = null;
		String[] s = line.split(",");
		String vehicleNo = s[0];
		String vehicleModel = s[1];
		String vehicleType = s[2];
		String vehicleColor = s[3];
		v = new Vehicle(vehicleNo, vehicleModel, vehicleType, vehicleColor);
		return v;
	}
	
	public String toString() {
		return vehicleNo+" "+vehicleModel+" "+vehicleType+" "+vehicleColor;
	}
	
}
