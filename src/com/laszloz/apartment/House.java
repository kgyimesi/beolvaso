package com.laszloz.apartment;

import java.util.ArrayList;
import java.util.List;

public class House {

	private int ID;
	private List<Apartment> apartmentList = new ArrayList<Apartment>();

	public void addAppartment(Apartment apartment) {
		apartmentList.add(apartment);
	}

	public Apartment getApartment(int id) {
		for (Apartment apartment : apartmentList) {
			if (id == apartment.getID())
				return apartment;
		}
		
		return null;
	}

	public List<Apartment> getApartmentList() {
		return apartmentList;
	}

	public void setApartmentList(List<Apartment> apartmentList) {
		this.apartmentList = apartmentList;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}
