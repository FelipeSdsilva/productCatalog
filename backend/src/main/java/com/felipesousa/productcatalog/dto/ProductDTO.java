package com.felipesousa.productcatalog.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.felipesousa.productcatalog.entities.Product;

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String barcode;
	private Integer qtdInStok;
	private Double price;
	private LocalDate dateValidity;

	public ProductDTO() {
	}

	public ProductDTO(Long id, String name, String barcode, Integer qtdInStok, Double price, LocalDate dateValidity) {
		this.id = id;
		this.name = name;
		this.barcode = barcode;
		this.qtdInStok = qtdInStok;
		this.price = price;
		this.dateValidity = dateValidity;
	}

	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		barcode = entity.getBarcode();
		qtdInStok = entity.getQtdInStok();
		price = entity.getPrice();
		dateValidity = entity.getDateValidity();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Integer getQtdInStok() {
		return qtdInStok;
	}

	public void setQtdInStok(Integer qtdInStok) {
		this.qtdInStok = qtdInStok;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getDateValidity() {
		return dateValidity;
	}

	public void setDateValidity(LocalDate dateValidity) {
		this.dateValidity = dateValidity;
	}
}
