package com.prodapt.proj.travel.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityLocationDAOImpl implements CityLocationDAO {
	private static List<CityLocation> cityLocations;

	public CityLocationDAOImpl() {
		cityLocations = new ArrayList<>();
		try (InputStream is = new FileInputStream("src/main/resources/locations.txt");
				Scanner sc = new Scanner(is);) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				CityLocation cl = CityLocation.parseCityLocation(line);
				cityLocations.add(cl);
			}
			sc.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
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
