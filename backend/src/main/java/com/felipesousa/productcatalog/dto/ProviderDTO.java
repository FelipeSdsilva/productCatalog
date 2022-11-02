package com.felipesousa.productcatalog.dto;

import java.io.Serializable;

import com.felipesousa.productcatalog.entities.Provider;

public class ProviderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String corpName;
	private String fantName;
	private String socialRegister;
	private String cnpj;
	private String email;
	private Integer tell;
	private String corpContactName;
	private Integer numberOfLocalizate;
	private String complements;

	public ProviderDTO() {
	}

	public ProviderDTO(Long id, String corpName, String fantName, String socialRegister, String cnpj, String email,
			Integer tell, String corpContactName, Integer numberOfLocalizate, String complements) {
		this.id = id;
		this.corpName = corpName;
		this.fantName = fantName;
		this.socialRegister = socialRegister;
		this.cnpj = cnpj;
		this.email = email;
		this.tell = tell;
		this.corpContactName = corpContactName;
		this.numberOfLocalizate = numberOfLocalizate;
		this.complements = complements;
	}

	public ProviderDTO(Provider entity) {
		id = entity.getId();
		corpName = entity.getCorpName();
		fantName = entity.getFantName();
		socialRegister = entity.getSocialRegister();
		cnpj = entity.getCnpj();
		email = entity.getEmail();
		tell = entity.getTell();
		corpContactName = entity.getCorpContactName();
		numberOfLocalizate = entity.getNumberOfLocalizate();
		complements = entity.getComplements();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getFantName() {
		return fantName;
	}

	public void setFantName(String fantName) {
		this.fantName = fantName;
	}

	public String getSocialRegister() {
		return socialRegister;
	}

	public void setSocialRegister(String socialRegister) {
		this.socialRegister = socialRegister;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTell() {
		return tell;
	}

	public void setTell(Integer tell) {
		this.tell = tell;
	}

	public String getCorpContactName() {
		return corpContactName;
	}

	public void setCorpContactName(String corpContactName) {
		this.corpContactName = corpContactName;
	}

	public Integer getNumberOfLocalizate() {
		return numberOfLocalizate;
	}

	public void setNumberOfLocalizate(Integer numberOfLocalizate) {
		this.numberOfLocalizate = numberOfLocalizate;
	}

	public String getComplements() {
		return complements;
	}

	public void setComplements(String complements) {
		this.complements = complements;
	}

}
