package metier;

import java.util.List;

public interface ImetierCatalogue {
	public List<patient> getPatientsParMotCle(String mc);
	public void addPatient(patient p);
}
