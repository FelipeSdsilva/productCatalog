package com.felipesousa.productcatalog.dto;

import java.io.Serializable;

import com.felipesousa.productcatalog.entities.Address;

public class AddressDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String streetName;
	private String district;
	private String city;
	private String state;
	private String cep;

	public AddressDTO() {
	}

	public AddressDTO(String streetName, String district, String city, String state, String cep) {
		this.streetName = streetName;
		this.district = district;
		this.city = city;
		this.state = state;
		this.cep = cep;
	}

	public AddressDTO(Address entity) {
		streetName = entity.getState();
		district = entity.getDistrict();
		city = entity.getCity();
		state = entity.getState();
		cep = entity.getCep();
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
