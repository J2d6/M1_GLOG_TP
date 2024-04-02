package iut.bad;

public class Humain {
	String nom;
	String prenom;
	int age;
	boolean soif;
	boolean faim;
	
	public Humain ( String nom, String prenom, int age ) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void details () {
		System.out.println(toString());
	}
	
	public String toStirng () {
		return ( "NOM : " + this.nom + "\n" +"Prenom : " + this.prenom + "\n" + "Age : " + this.age );
	}
	
	public void manger () {
		this.faim = false;
		System.out.println("Yummyyy! ");
	}
	
	public void boire () {
		this.soif = false;
	}
}
