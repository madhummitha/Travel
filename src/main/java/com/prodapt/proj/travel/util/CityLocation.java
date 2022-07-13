package com.prodapt.proj.travel.util;

import com.prodapt.proj.travel.vehicle.Vehicle;

public class CityLocation {
	private String city1;
	private String city2;
	private int distance;
	
	public String getCity1() {
		return city1;
	}
	
	public void setCity1(String city1) {
		this.city1 = city1;
	}
	
	public String getCity2() {
		return city2;
	}
	
	public void setCity2(String city2) {
		this.city2 = city2;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}

	public CityLocation() {}
	
	public CityLocation(String city1, String city2, int distance) {
		super();
		this.city1 = city1;
		this.city2 = city2;
		this.distance = distance;
	}

	public static CityLocation parseCityLocation(String line) {
		CityLocation c = null;
		String[] v = line.split(",");
		String city1 = v[0];
		String city2 = v[1];
		int distance = Integer.parseInt(v[2]);
		c = new CityLocation(city1, city2, distance);
		return c;
	}
	
	public String toString() {
		return city1+" "+city2+" "+distance;
	}
	
}
