package com.michielsbeans.koffie.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Zakkie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String brander;
	//private String naam;
	private String producent;
	//private String regio;
	private String land;
	//private String type;
	//private String varieteiten;
	//private String hoogte;
	private String proces;
	//private int oogstjaar;
	//private String notes;
	private int score;
	//private String review;
	//private double prijs;
	//private String via;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrander() {
		return brander;
	}
	public void setBrander(String brander) {
		this.brander = brander;
	}
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
//	@ManyToOne
//	private Brander brander;

	


}
