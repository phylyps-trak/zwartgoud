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
	
	private String naam;
	private String producent;
	private String regio;
	private String land;
	private String type;
	private String varieteiten;
	private String hoogte;
	private String proces;
	private int oogstjaar;
	private String notes;
	private int score;
	private String review;
	private double prijs;
	private String via;
	
	
	
	@ManyToOne
	private Brander brander;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getProducent() {
		return producent;
	}
	public void setProducent(String producent) {
		this.producent = producent;
	}
	public String getRegio() {
		return regio;
	}
	public void setRegio(String regio) {
		this.regio = regio;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVarieteiten() {
		return varieteiten;
	}
	public void setVarieteiten(String varieteiten) {
		this.varieteiten = varieteiten;
	}
	public String getHoogte() {
		return hoogte;
	}
	public void setHoogte(String hoogte) {
		this.hoogte = hoogte;
	}
	public String getProces() {
		return proces;
	}
	public void setProces(String proces) {
		this.proces = proces;
	}
	public int getOogstjaar() {
		return oogstjaar;
	}
	public void setOogstjaar(int oogstjaar) {
		this.oogstjaar = oogstjaar;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public double getPrijs() {
		return prijs;
	}
	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	


}
