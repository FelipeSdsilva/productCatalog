package com.felipesousa.productcatalog.dto;

import java.io.Serializable;

import com.felipesousa.productcatalog.entities.Address;

public class AddressDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String streetName;
	private String district;
	private String city;
	private String state;
	private String cep;

	private Long provideId;

	public AddressDTO() {
	}

	public AddressDTO(Long id, String streetName, String district, String city, String state, String cep,
			Long provideId) {
		super();
		this.id = id;
		this.streetName = streetName;
		this.district = district;
		this.city = city;
		this.state = state;
		this.cep = cep;
		this.provideId = provideId;
	}

	public AddressDTO(Address entity) {

		id = entity.getId();
		streetName = entity.getState();
		district = entity.getDistrict();
		city = entity.getCity();
		state = entity.getState();
		cep = entity.getCep();
		provideId = entity.getProvider().getId();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getProvideId() {
		return provideId;
	}

	public void setProvideId(Long provideId) {
		this.provideId = provideId;
	}

}
