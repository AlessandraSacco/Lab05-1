package it.polito.tdp.anagrammi.model;

import it.polito.tdp.anagrammi.db.AnagrammaDAO;

public class Model {
	private AnagrammaDAO anagrammaDAO;
	
   public Model(){
	anagrammaDAO = new AnagrammaDAO();
   }
   
   public boolean verificaParola(String parola) {
	   return anagrammaDAO.VerificaParola(parola);
   }
}
