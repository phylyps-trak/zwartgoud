package com.michielsbeans.koffie.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brander {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String brander;
	private String branderStad;
	
//	@OneToMany(mappedBy = "brander")
//	private List<Zakkie> koffies;
	
	public String getBrander() {
		return brander;
	}
	public void setBrander(String brander) {
		this.brander = brander;
	}
	public String getBranderStad() {
		return branderStad;
	}
	public void setBranderStad(String branderStad) {
		this.branderStad = branderStad;
	}
}
