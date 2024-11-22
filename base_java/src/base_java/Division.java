package base_java;

import java.util.Scanner;

public class Division {
	
	//Attrbuts de la classe
	int A_diviseur; 
	double A_dividende;
	
	
	//Constructeur de la classe
	public Division(int diviseur, double dividende) {
		super();
		this.A_diviseur = diviseur;
		this.A_dividende = dividende;
		
	}
	
	//Les Méthodes la classe
	public double divison() {
		
		double quotient;
		//Demande à l'utilisateur la saisi des data
		Scanner clavier = new Scanner(System.in); // Création d'un objet de la classe Scanner nommé Clavier
		System.out.print("Demande du diviseur : ");
		A_diviseur = clavier.nextInt();
		System.out.print("Demande du dividende : ");
		A_dividende = clavier.nextDouble();
        clavier.close();
				
		//Calcul du quotient
		quotient = A_diviseur/A_dividende;
		return quotient;
		}
	    
	 public void affichage_console() {
		 double quot;
		 quot = divison();
		 System.out.println("Le résultat de la division est "+ quot);
	 }
	 
	 


}
