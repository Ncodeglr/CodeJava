package exo2_Telecom;


public class OpTabInt {
	
	//MÉTHODES
	public static int somme(int[] tableau) {
		int somTab = 0;
		for (int i = 0; i < tableau.length; i++){somTab = somTab + tableau[i];}
		return somTab;
	}
	
	public static int indiceMax(int[] tableau) {
		int maxTab = tableau[0];
		if(tableau.length == 0) {return -1;}
		
		for (int i = 0; i < tableau.length; i++)
		{
			if(maxTab >=tableau[i]) {continue;}
			else if(maxTab<tableau[i]) {maxTab = tableau[i];}
		}
		return maxTab;
	}
	
	public static int[] ajouteInt(int[] tableau, int newElement) {
		int[] nouveauTableau = new int[tableau.length + 1];
		for (int i = 0; i < tableau.length; i++) nouveauTableau[i] = tableau[i];
		nouveauTableau[tableau.length] = newElement;
		writeTab(nouveauTableau);
		return nouveauTableau;
	}
	
	public static void writeTab(int[] tableau) {
		for (int i = 0; i < tableau.length; i++){System.out.print(tableau[i]+" ");}
	}
	






}
