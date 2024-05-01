package com.patient.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.patient.entities.Patient;
import com.patient.util.JPAutil;
//classe contenant les méthodes génériques ajouter, supprimer,
//consulter par clé primaire (Id)
public class PatientDao {
	private EntityManager entityManager=JPAutil.getEntityManager("JPAProjectPatient");
	//méthode ajouter d'une entité à la bd
	public void ajouter(Patient c)
	{
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(c);
		tx.commit();
	}
	//méthode modifier d'une entité à partir de la bd
	public void modifier(Patient c)
	{
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(c);
		tx.commit();
	}
	//méthode Supprimer d'une entité à partir de la bd
	public void supprimer(Patient c)
	{
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		c=entityManager.merge(c); // important
		entityManager.remove(c);
		tx.commit();
	}
	//méthode Consulter d'une entité à partir de la bd
	public Patient consulter(Patient p,Object id)
	{
		return entityManager.find(p.getClass(), id);
	}
	//méthode pour lister tous les objets à partir de la bd
	public List<Patient> listerTous() {
		List<Patient> patients =
				entityManager.createQuery
				("select p from Patient p").getResultList();

		return patients;
	}
	//méthode pour lister tous les client dont le nom contient un
	//texte donné en paramètre (pnom)
	public List<Patient> listerParNom(String nom) {
		List<Patient> patients=entityManager.createQuery( "select p from Patient p where p.nom like :pnom")
				.setParameter("pnom","%"+nom+"%").getResultList();

		return patients; 
	}
}

