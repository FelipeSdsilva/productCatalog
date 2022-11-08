package com.felipesousa.productcatalog.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "tb_product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String barcode;
	private Integer qtdInStok;
	private Double price;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDate dateValidity;

	@ManyToMany
	@JoinTable(name = "tb_product_category", 
	joinColumns = @JoinColumn(name = "product_id"),
	inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<Category> categories = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "tb_product_provider", 
	joinColumns = @JoinColumn(name = "product_id"), 
	inverseJoinColumns = @JoinColumn(name = "provider_id"))
	private Set<Provider> providers = new HashSet<>();

	public Product() {
	}

	public Product(Long id, String name, String barcode, Integer qtdInStok, Double price, LocalDate dateValidity) {
		super();
		this.id = id;
		this.name = name;
		this.barcode = barcode;
		this.qtdInStok = qtdInStok;
		this.price = price;
		this.dateValidity = dateValidity;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public Set<Provider> getProviders() {
		return providers;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

}
