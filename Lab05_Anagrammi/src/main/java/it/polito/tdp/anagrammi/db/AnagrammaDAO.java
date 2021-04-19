package it.polito.tdp.anagrammi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class AnagrammaDAO {
	
	public List<Word> getTuttiICorsi() {

		final String sql = "SELECT * FROM corso";

		List<Word> parole = new LinkedList<Word>();

		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
           
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

			Word w= new Word(rs.getString("parola"));

				parole.add(w);

				// Crea un nuovo JAVA Bean Corso
				// Aggiungi il nuovo oggetto Corso alla lista corsi
			}
			 conn.close();
			 st.close();
			 rs.close();

	
			
			return parole;
			

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
	}	
		public boolean VerificaParola(String parola) {

			final String sql = "SELECT * FROM corso WHERE";

			String parolaa = null;

			try {
				Connection conn = DBConnect.getConnection();
				PreparedStatement st = conn.prepareStatement(sql);
	           
				ResultSet rs = st.executeQuery();

				if(rs.next()) {

                  parolaa=parola;  
				}
				
				
				 conn.close();
				 st.close();
				 rs.close();
				 
                if(parolaa==null || parolaa=="") {
                	return false;
                }
                 return true;
				
				
				

			} catch (SQLException e) {
				// e.printStackTrace();
				throw new RuntimeException("Errore Db", e);
			}
	}

}
