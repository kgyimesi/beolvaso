package com.laszloz.apartment;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class House {

	@Id
	@Column(name = "id")
	private int ID;
	
	@OneToOne()
	@Column(name = "manager")
	private Manager manager;

	@OneToMany
	private List<Apartment> apartmentList = new ArrayList<Apartment>();
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

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
