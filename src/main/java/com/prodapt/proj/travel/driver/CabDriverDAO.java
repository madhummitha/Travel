package com.prodapt.proj.travel.driver;

public interface CabDriverDAO {
	
	public boolean addCabDriver(CabDriver cd);
	
	public CabDriver findCabDriver(int id);
	
	public void displayAllCabDrivers();

}
