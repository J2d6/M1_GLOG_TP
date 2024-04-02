package iut.bad;

public class Femme extends Humain {	
	public Femme( String nom, String prenom, int age ) {
		super( nom, prenom, age );
	}
	
	public static void main (String[] args) {
		Homme lehilahy  = new Homme("RAZ", "Dimbiniaina Jordany", 23);
		Femme vehivavy = new Femme("ZAFY", "Marie ", 24);
		vehivavy.ami(lehilahy);
	}
}
