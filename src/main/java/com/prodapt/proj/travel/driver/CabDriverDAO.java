package com.prodapt.proj.travel.driver;

public interface CabDriverDAO {
	
	public boolean addCabDriver(CabDriver driver);
	
	public CabDriver findCabDriver(int id);
	
	public void displayAllCabDrivers();

}
