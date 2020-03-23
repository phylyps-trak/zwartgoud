package com.michielsbeans.koffie.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brander {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String branderNaam;
	private String branderStad;
	
//	@OneToMany(mappedBy = "brander")
//	private List<Zakkie> koffies;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getBranderNaam() {
		return branderNaam;
	}
	public void setBranderNaams(String branderNaam) {
		this.branderNaam = branderNaam;
	}
	public String getBranderStad() {
		return branderStad;
	}
	public void setBranderStad(String branderStad) {
		this.branderStad = branderStad;
	}
}
