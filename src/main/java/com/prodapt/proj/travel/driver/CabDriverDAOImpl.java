package com.prodapt.proj.travel.driver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CabDriverDAOImpl implements CabDriverDAO{
	private static List<CabDriver> drivers;
	
	public CabDriverDAOImpl() {
		drivers = new ArrayList<>();
		try (InputStream is = new FileInputStream("src/main/resources/cabDriver.txt");
				Scanner sc = new Scanner(is);) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				CabDriver cd = CabDriver.parseCabDriver(line);
				drivers.add(cd);
			}
			sc.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
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
