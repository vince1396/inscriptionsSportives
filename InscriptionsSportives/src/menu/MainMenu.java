package menu;

import commandLineMenus.*;

public class MainMenu {
	
	static Menu getMainMenu() {
		
		Menu mainMenu = new Menu("Menu principal");
		mainMenu.add(getTeamMenu());
		mainMenu.add(getPersonneMenu());
		mainMenu.add(getCandMenu());
		mainMenu.add(getCompMenu());
		mainMenu.addQuit("q");
		
		return mainMenu;
	}
	
	static Menu getTeamMenu()
	{
		Menu teamMenu = new Menu("Menu equipe");
		return teamMenu;
	}
	
	static Menu getPersonneMenu()
	{
		Menu personneMenu = new Menu("Menu Personne");
		return personneMenu;

	}
	
	static Menu getCandMenu()
	{
		Menu CandMenu = new Menu("MenuCandidat");
		return CandMenu;
	}
	
	static Menu getCompMenu()
	{
		Menu compMenu = new Menu("Menu Compétition");
		return compMenu;
	}
// =================================================================================================================================
//	static Action getTeamAction()
//	{
//		return new Action()
//		{
//			
//		}
//	}
//	
//	static Action getPersonneAction()
//	{
//		return new Action()
//		{
//			
//		}
//	}
//	
//	static Action getCandAction()
//	{
//		return new Action()
//		{
//			
//		}
//	}
//	
//	static Action getCompAction()
//	{
//		return new Action()
//		{
//			
//		}
//	}
	
}
