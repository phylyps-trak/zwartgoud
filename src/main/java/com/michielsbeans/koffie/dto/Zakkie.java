package com.michielsbeans.koffie.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Zakkie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String land;
	private String producent;
	private String proces;
	//private String naam;
	//private String regio;
	//private String type;
	//private String varieteiten;
	//private String hoogte;
	//private int oogstjaar;
	//private String notes;
	//private String review;
	//private double prijs;
	//private String via;
	
	//private Brander brander;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
//	public Brander getBrander() {
//		return brander;
//	}
//	public void setBrander(Brander brander) {
//		this.brander = brander;
//	}
	public String getProducent() {
		return producent;
	}
	public void setProducent(String producent) {
		this.producent = producent;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getProces() {
		return proces;
	}
	public void setProces(String proces) {
		this.proces = proces;
	}
}
