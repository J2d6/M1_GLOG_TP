package iut.bad;


import java.util.HashMap;
import java.util.Map;


public class Humain implements Consommation {
	
	String nom;
	String prenom;
	int age;
	boolean soif;
	boolean faim;
	
	Map<Humain, Integer> amis = new HashMap<>();
	Humain ami;
	int dureeeAmitie;
	
	public Humain ( String nom, String prenom, int age ) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void details () {
		System.out.println( toString() );
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
	
	public void ami ( Humain ami, int dureeAmitie ) {
		this.amis.put(ami, dureeAmitie) ;
		ami.amis.put(this, dureeAmitie);
		System.out.println(this.prenom +" et "+ ami.prenom + " sont désormais amis pour "+ dureeAmitie +" jours");
		
	}
	public void ami ( Humain ami ) {
		this.ami(ami, 100);	
	}
}
