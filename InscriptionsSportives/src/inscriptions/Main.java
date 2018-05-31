package inscriptions;
import menu.*;

public class Main {

    public static void main(String[] args)
    {
    	Inscriptions insc = new Inscriptions();
    	MainMenu menu = new MainMenu();
    	menu.initMenuRoot(insc);
    }

}
