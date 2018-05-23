package menu;

import commandLineMenus.*;

public class MainMenu {
	
	public void initMenuRoot ()
	{
		Menu rootMenu = new Menu("Root Menu");

		Menu gestionComp = new Menu("Gestion compétition", "Gestion compétition", "1");
		Menu gestionEquipe = new Menu("Gestion équipe", "Gestion équipe", "2");
		Menu gestionPersonne = new Menu("Gestion personne", "Gestion personne", "3");
	
		rootMenu.add(gestionComp);
		rootMenu.add(gestionEquipe);
		rootMenu.add(gestionPersonne);
		rootMenu.addQuit("q");
		
		initMenuComp(gestionComp);
		initMenuEquipe(gestionEquipe);
		initMenuPersonne(gestionPersonne);
		
		rootMenu.start();
	}
	
// ======================================================================================================================
	
	public void initMenuComp(Menu menu)
	{
		Option createComp = new Option("Créer Compétition","1");
		Option updateComp = new Option("Modifier Compétition","2");
		Option displayParts = new Option("Afficher Participants","3");
		Option suppPart = new Option("Supprimer Participant","4");
		Option displayComp = new Option("Afficher Compétitions","5");
		Option suppComp = new Option("Supprimer Compétition","6");
		
	// ----------------------------------------------------------------
		
		menu.add(createComp);
		menu.add(updateComp);
		menu.add(displayParts);
		menu.add(suppPart);
		menu.add(displayComp);
		menu.add(suppComp);
		menu.addBack("q");
		
	// ----------------------------------------------------------------
		
		Action createCompAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Créer Comp");
			}
		};
		
		Action updateCompAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Update Comp");
			}
		};
		
		Action displayPartsAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Display Participants");
			}
		};
		
		Action suppPartAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Supp Participant");
			}
		};
		
		Action displayCompAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Display Comp");
			}
		};
		
		Action suppCompAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Supp Comp");
			}
		};
	// --------------------------------------------------------
		
		createComp.setAction(createCompAction);
		updateComp.setAction(updateCompAction);
		displayParts.setAction(displayPartsAction);
		suppPart.setAction(suppPartAction);
		displayComp.setAction(displayCompAction);
		suppComp.setAction(suppCompAction);
		
	//---------------------------------------------------------
	}
	
	
// =====================================================================================================================
	
	public void initMenuEquipe(Menu menu)
	{
		Option createEquipe = new Option("Créer Equipe","1");
		Option updateEquipe = new Option("Modifier Equipe","2");
		Option displayMembres = new Option("Afficher Membres","3");
		Option displayEquipes = new Option("Afficher les équipes","4");
		Option suppMembre = new Option("Supprimer un membre","5");
		Option suppEquipe = new Option("Supprimer Equipe","6");
		
	// ----------------------------------------------------------------
		
		menu.add(createEquipe);
		menu.add(updateEquipe);
		menu.add(displayMembres);
		menu.add(suppMembre);
		menu.add(displayEquipes);
		menu.add(suppEquipe);
		menu.addBack("q");
		
	// ----------------------------------------------------------------
		
		Action createEquipeAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Créer Equipe");
			}
		};
		
		Action updateEquipeAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Update Equipe");
			}
		};
		
		Action displayMembresAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Display Membres");
			}
		};
		
		Action suppMembreAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Supp Membre");
			}
		};
		
		Action displayEquipesAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Display Equipes");
			}
		};
		
		Action suppEquipeAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Supp Equipe");
			}
		};
	// --------------------------------------------------------
		
		createEquipe.setAction(createEquipeAction);
		updateEquipe.setAction(updateEquipeAction);
		displayMembres.setAction(displayMembresAction);
		suppMembre.setAction(suppMembreAction);
		displayEquipes.setAction(displayEquipesAction);
		suppEquipe.setAction(suppEquipeAction);
		
	//---------------------------------------------------------
	}
	
// =====================================================================================================================
	
	public void initMenuPersonne(Menu menu)
	{
		Option addPersonne = new Option("Ajouter une Personne","1");
		Option updatePersonne = new Option("Modifier infos Personne","2");
		Option displayPersonne = new Option("Afficher infos Personne","3");
		Option suppPersonne = new Option("Supprimer Personne","4");
		
	// ----------------------------------------------------------------
		
		menu.add(addPersonne);
		menu.add(updatePersonne);
		menu.add(displayPersonne);
		menu.add(suppPersonne);
		menu.addBack("q");
		
	// ----------------------------------------------------------------
		
		Action addPersonneAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Ajout Personne");
			}
		};
		
		Action updatePersonneAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Update Personne");
			}
		};
		
		Action displayPersonneAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Display Personne");
			}
		};
		
		Action suppPersonneAction = new Action()
		{
			@Override
			public void optionSelected()
			{
				System.out.println("Test Supp Personne");
			}
		};
		
	// --------------------------------------------------------
		
		addPersonne.setAction(addPersonneAction);
		updatePersonne.setAction(updatePersonneAction);
		displayPersonne.setAction(displayPersonneAction);
		suppPersonne.setAction(suppPersonneAction);
		
	//---------------------------------------------------------
	}
}