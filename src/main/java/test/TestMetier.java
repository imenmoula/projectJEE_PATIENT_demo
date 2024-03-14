package test;

import java.util.List;

import metier.MetierImpl;
import metier.patient;

public class TestMetier {

	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<patient> pat = metier.getPatientsParMotCle("mo");
		
		for (patient p : pat)
		System.out.println(p.getNom());
		}

}
