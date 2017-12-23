package menu;

import commandLineMenus.Menu;
import commandLineMenus.Option;

public class MainMenu {
	
	static Menu getMainMenu() {
		
		Menu mainMenu = new Menu("Menu principal");
		mainMenu.add(getTeamOption());
		mainMenu.add(getPersonneOption());
		mainMenu.add(getCandOption());
		mainMenu.add(getCompOption());
		mainMenu.addQuit("q");
		
		return mainMenu;
	}
	
	static Option getTeamOption()
	{
		Option teamOption = new Option("Equipe","1", getTeamAction());
		return teamOption;
	}
	
	static Option getPersonneOption()
	{
		Option personneOption = new Option("Personne","2", getPersonneAction());
		return personneOption;

	}
	
	static Option getCandOption()
	{
		Option CandOption = new Option("Candidat","3", getCandAction());
		return CandOption;
	}
	
	static Option getCompOption()
	{
		Option compOption = new Option("Compétition","4", getCompAction());
		return compOption;
	}
// =================================================================================================================================
	static Action getTeamAction()
	{
		return new Action()
		{
			
		}
	}
	
	static Action getPersonneAction()
	{
		return new Action()
		{
			
		}
	}
	
	static Action getCandAction()
	{
		return new Action()
		{
			
		}
	}
	
	static Action getCompAction()
	{
		return new Action()
		{
			
		}
	}
	
	
}
