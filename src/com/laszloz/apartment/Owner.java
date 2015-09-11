package com.laszloz.apartment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner {

	@Id
	@Column(name="id")
	private int ID;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@OneToMany
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public List<Apartment> getApartmentList() {
		return apartmentList;
	}

	public void setApartmentList(List<Apartment> apartmentList) {
		this.apartmentList = apartmentList;
	}

}
