package web;
import java.util.ArrayList;
import java.util.List;

import metier.patient;

public class PatientModele {
	private String motCle;
	List<patient> patients = new ArrayList<>();
	
	public String getMotCle() {
	return motCle;
	}
	
	public void setMotCle(String motCle) {
	this.motCle = motCle;
	}
	
	public List<patient> getPatients() {
	return patients;
	}
	
	public void setPatients(List<patient>patients) {
	this.patients=patients;
	}

}