package com.prodapt.proj.travel.util;

import com.prodapt.proj.travel.vehicle.Vehicle;

public class CityLocationDAOImpl implements CityLocationDAO {
	private static CityLocation[] cityLocations;
	private static int lastIndex;

	public CityLocationDAOImpl(int size) {
		cityLocations = new CityLocation[size];
		lastIndex = -1;
	}

	@Override
	public boolean addCityLocation(CityLocation cityLocation) {
		boolean result = false;
		if (lastIndex + 1 > cityLocations.length) {
			result = false;
		} else {
			lastIndex++;
			cityLocations[lastIndex] = cityLocation;
		}
		return result;
	}

	@Override
	public CityLocation findCityLocation(String city1, String city2) {
		CityLocation v = null;
		for (CityLocation x : cityLocations) {
			if (x.getCity1().equals(city1) && x.getCity2().equals(city2)) {
				v = x;
			} else if (x.getCity1().equals(city1) && x.getCity2().equals(city2)) {
				v = x;
			}
		}
		return v;
	}

	@Override
	public void displayAllCityLocation() {
		for (CityLocation v : cityLocations) {
			System.out.println(v);
		}
	}
}
