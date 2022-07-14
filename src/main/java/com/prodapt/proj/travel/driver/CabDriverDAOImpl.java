package com.prodapt.proj.travel.driver;

import java.util.ArrayList;
import java.util.List;

public class CabDriverDAOImpl implements CabDriverDAO{
	private static List<CabDriver> drivers;
	
	public CabDriverDAOImpl() {
		drivers = new ArrayList<>();
	}

	@Override
	public boolean addCabDriver(CabDriver cd) {
		return drivers.add(cd);
	}

	@Override
	public CabDriver findCabDriver(int id) {
		CabDriver c = null;
		for (CabDriver d: drivers) {
			if (d.getId() == id) {
				c = d;
				break;
			}
		}
		return c;
	}

	@Override
	public void displayAllCabDrivers() {
		for (CabDriver c: drivers) {
			System.out.println(c);
		}
	}
}
