package com.patient.test;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.patient.dao.PatientDao;
import com.patient.entities.Patient;

public class PatientTest {
	public static void main(String[] args) {
		//créer un objet patient
		Patient p = new Patient();
		p.setNom("Moula Imen");
		p.setAdresse("nabeul");
		try {
            java.util.Date dateNaissanceUtil = new SimpleDateFormat("dd/MM/yyyy").parse("30/01/2002");
          
            Date dateNaissance = new Date(dateNaissanceUtil.getTime());
            p.setDateNaissance(dateNaissance);
        } catch (ParseException e) {
            e.printStackTrace();
        }
		p.setEmail("user1@gmail.com");
		 p.setGenre("Femme");
		p.setPhone("22222222");
		//2emee patient ////////////////////////////////////////*/
		Patient p1 = new Patient();
		p1.setNom("Moula ichraf");
		p1.setAdresse("tunis");
		try {
            java.util.Date dateNaissanceUtil = new SimpleDateFormat("dd/MM/yyyy").parse("12/01/1994");
            
            Date dateNaissance = new Date(dateNaissanceUtil.getTime());
            p1.setDateNaissance(dateNaissance);
        } catch (ParseException e) {
            e.printStackTrace();
        }
		p1.setEmail("user2@gmail.com");
		 p1.setGenre("Femme");
		p1.setPhone("3333333");
		//3eme patient///////////////////////////////////////*/
		Patient p2= new Patient();
		p2.setNom("charrada alya");
		p2.setAdresse("nabeul");
		try {
            java.util.Date dateNaissanceUtil = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1972");
            Date dateNaissance = new Date(dateNaissanceUtil.getTime());
            p2.setDateNaissance(dateNaissance);
        } catch (ParseException e) {
            e.printStackTrace();
        }
		p2.setEmail("user2@gmail.com");
		p2.setGenre("Femme");
		p2.setPhone("4444444");
		
		
		
	
		//ajouter l'objet patient à la BD
		PatientDao  patDao = new PatientDao ();
		patDao.ajouter(p);
		patDao.ajouter(p1);
		patDao.ajouter(p2);
		
		System.out.println("Appel de la méthode listerTous");
		for (Patient pat : patDao.listerTous())
			
		/*System.out.println(pat.getId()+" "+pat.getNom()+"  "+pat.getAdresse()+" "+
		pat.getEmail()+" "+pat.getGenre()+" "+pat.getPhone()+" "+pat.getDateNaissance());*/
			System.out.println(pat);
		System.out.println("Appel de la méthode listerParNom");
		for (Patient pat : patDao.listerParNom("im"))

	/*System.out.println(pat.getId()+" "+pat.getNom());*/
			System.out.println(pat);

}
}
