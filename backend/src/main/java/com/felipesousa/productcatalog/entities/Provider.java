package com.felipesousa.productcatalog.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tb_provider")
public class Provider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String corpName;
	private String fantName;
	private String SocialRegister;
	private String cnpj;
	private String email;
	private Integer tell;
	private String corpContactName;
	private Integer numberOfLocalizate;
	private String complements;

	public Provider() {
	}

	public Provider(Long id, String corpName, String fantName, String socialRegister, String cnpj, String email,
			Integer tell, String corpContactName, Integer numberOfLocalizate, String complements) {
		this.id = id;
		this.corpName = corpName;
		this.fantName = fantName;
		this.SocialRegister = socialRegister;
		this.cnpj = cnpj;
		this.email = email;
		this.tell = tell;
		this.corpContactName = corpContactName;
		this.numberOfLocalizate = numberOfLocalizate;
		this.complements = complements;
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
		return SocialRegister;
	}

	public void setSocialRegister(String socialRegister) {
		SocialRegister = socialRegister;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provider other = (Provider) obj;
		return Objects.equals(id, other.id);
	}

}
