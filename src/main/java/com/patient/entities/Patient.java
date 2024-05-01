package com.patient.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Patient implements Serializable{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	//pour autoincrement
	private long id;
	private String nom;
    private String phone;
    private String email;
    private String adresse;
    private String genre;
    private Date dateNaissance;
    //getter et setter
    
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", nom=" + nom + ", phone=" + phone + ", email=" + email + ", adresse=" + adresse
				+ ", genre=" + genre + ", dateNaissance=" + dateNaissance + "]";
	}
	
	
	
}
