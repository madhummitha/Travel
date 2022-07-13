package com.prodapt.proj.travel.driver;

public class CabDriverDAOImpl implements CabDriverDAO{
	private static CabDriver[] cabDrivers;
	private static int lastIndex;
	
	public CabDriverDAOImpl(int size) {
		cabDrivers = new CabDriver[size];
		lastIndex = -1;
	}

	@Override
	public boolean addCabDriver(CabDriver driver) {
		boolean result = false;
		if (lastIndex + 1 > cabDrivers.length) {
			result = false; 
		} else {
			lastIndex++;
			cabDrivers[lastIndex] = driver;
		}
		return result;
	}

	@Override
	public CabDriver findCabDriver(int id) {
		CabDriver c = null;
		for (CabDriver d: cabDrivers) {
			if (d.getId() == id) {
				c = d;
			}
		}
		return c;
	}

	@Override
	public void displayAllCabDrivers() {
		for (CabDriver c: cabDrivers) {
			System.out.println(c);
		}
	}
}
