package com.prodapt.proj.travel.util;

public interface CityLocationDAO {
	
	public boolean addCityLocation(CityLocation cityLocaiton);
	
	public CityLocation findCityLocation(String city1, String city2);
	
	public void displayAllCityLocation();

}
