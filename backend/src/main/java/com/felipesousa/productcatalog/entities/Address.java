package com.felipesousa.productcatalog.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tb_address")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	private String streetName;
	private String district;
	private String city;
	private String state;

	@Id
	private String cep;

	@ManyToOne
	@JoinColumn(name = "provider_id")
	private Provider provider;

	public Address() {
	}

	public Address(String streetName, String district, String city, String state, String cep ) {
		this.streetName = streetName;
		this.district = district;
		this.city = city;
		this.state = state;
		this.cep = cep;
		
	}

	public Address(String streetName, String district, String city, String state, String cep, Provider provider) {
		this(streetName,district,city,state,cep);
		this.provider = provider;
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

	@Override
	public int hashCode() {
		return Objects.hash(cep);
	}

	/*
	 * public Provider getProvider() { return provider; }
	 * 
	 * public void setProvider(Provider provider) { this.provider = provider; }
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(cep, other.cep);
	}

}
