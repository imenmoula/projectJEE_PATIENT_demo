package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {

    @Override
    public List<patient>  getPatientsParMotCle(String mc) {
        List<patient> pat = new ArrayList<>();
        Connection conn = SingletonConnection.getConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from patient where nom LIKE ?");
            ps.setString(1, "%" + mc + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	patient p = new patient();
                p.setPatientId(rs.getInt("patient_id"));
                p.setNom(rs.getString("nom"));
                p.setPrenom(rs.getString("prenom"));
                p.setDateNaissance(rs.getDate("date_naissance"));
                p.setGenre(rs.getString("genre"));
                p.setAdresse(rs.getString("adresse"));
                p.setTelephone(rs.getString("telephone"));
                p.setEmail(rs.getString("email"));

                pat.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pat;
    }

    @Override
    public void addPatient(patient p) {
        // TODO Auto-generated method stub
    }
}
