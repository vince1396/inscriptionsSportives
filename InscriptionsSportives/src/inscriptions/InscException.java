package inscriptions;

public class InscException extends RuntimeException {
	
		private static final long serialVersionUID = -7812038589914974223L;

		public void errorMessage() 
		{
			System.out.println("Vous ne pouvez pas vous inscrire à cette compétition");
		}
	
}