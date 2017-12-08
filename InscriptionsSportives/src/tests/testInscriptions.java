package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import inscriptions.Competition;
import inscriptions.Equipe;
import inscriptions.Inscriptions;
import inscriptions.Personne;

class testInscriptions {

	Inscriptions inscriptions = Inscriptions.getInscriptions();
	Competition flechettes = inscriptions.createCompetition("Mondial de fléchettes", null, false);
	Personne tony = inscriptions.createPersonne("Tony", "Dent de plomb", "azerty"), 
			boris = inscriptions.createPersonne("Boris", "le Hachoir", "ytreza");
	Equipe lesManouches = inscriptions.createEquipe("Les Manouches");
	
	@Test
	void EquipeSetnom() {
		lesManouches.setNom("Vince");
		assertEquals("Vince", lesManouches.getNom());
	}
	
	void CompetitionsSetnom()
	{
		flechettes.setNom("Cauchemard");
		assertEquals("Cauchemard", flechettes.getNom());
	}

	void PersonneSetnom()
	{
		tony.setNom("Gerard");
		assertEquals("Gerard", tony.getNom());
	}
	
	void PersonneSetmail()
	{
		tony.setMail("test@gmail.com");
		assertEquals("test@gmail.com", tony.getMail());
	}
	
	void EquipeRemove()
	{
		lesManouches.add(boris);
		lesManouches.remove(boris);
		lesManouches.getMembres();
	}	
}
