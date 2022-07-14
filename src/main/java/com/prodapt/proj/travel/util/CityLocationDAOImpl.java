package com.prodapt.proj.travel.util;

import java.util.ArrayList;
import java.util.List;

public class CityLocationDAOImpl implements CityLocationDAO {
	private static List<CityLocation> cityLocations;

	public CityLocationDAOImpl() {
		cityLocations = new ArrayList<>();
	}

	@Override
	public boolean addCityLocation(CityLocation cityLocation) {
		return cityLocations.add(cityLocation);
	}

	@Override
	public CityLocation findCityLocation(String city1, String city2) {
		CityLocation v = null;
		for (CityLocation x : cityLocations) {
			if (x.getCity1().equals(city1) && x.getCity2().equals(city2)) {
				v = x;
				break;
			} else if (x.getCity1().equals(city1) && x.getCity2().equals(city2)) {
				v = x;
				break;
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
