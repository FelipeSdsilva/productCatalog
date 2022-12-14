package com.felipesousa.productcatalog.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.felipesousa.productcatalog.entities.Category;
import com.felipesousa.productcatalog.entities.Product;
import com.felipesousa.productcatalog.entities.Provider;

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String barcode;
	private Integer qtdInStok;
	private Double price;
	private LocalDate dateValidity;

	private Set<CategoryDTO> categories = new HashSet<>();

	private Set<ProviderDTO> providers = new HashSet<>();

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

	public ProductDTO(Product entity, Set<Category> categories, Set<Provider> providers) {
		this(entity);
		categories.forEach(cate -> this.categories.add(new CategoryDTO(cate)));
		providers.forEach(provi -> this.providers.add(new ProviderDTO(provi)));

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

	public Set<CategoryDTO> getCategories() {
		return categories;
	}

	public Set<ProviderDTO> getProviders() {
		return providers;
	}
}
