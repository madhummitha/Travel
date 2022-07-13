package com.prodapt.proj.travel.util;

import com.prodapt.proj.travel.vehicle.Vehicle;

public interface CityLocationDAO {
	
	public boolean addCityLocation(CityLocation cityLocaiton);
	
	public CityLocation findCityLocation(String city1, String city2);
	
	public void displayAllCityLocation();

}
