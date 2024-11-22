//https://perso.telecom-paristech.fr/hudry/coursJava/exercices/tableau.html

package exo2_Telecom;

public class EssaiOp {

	public static void main(String[] args) {
		
		OpTabInt optabint1 = new OpTabInt(); //Création d'un Objet Eleve
		int [] monTableau = new int[2];
		int otherTableau[] = new int[monTableau.length + 1];
		
		
		monTableau[0] = 8;
		monTableau[1] = 13;
		
		
		System.out.println("Somme tableau = "+optabint1.somme(monTableau));
		System.out.println("Indice Max = "+optabint1.indiceMax(monTableau));
		
		System.out.print("Mon nouveau tableau  : ");
		otherTableau = optabint1.ajouteInt(monTableau, 5);
		System.out.println(" ");
		
		System.out.print("Mon ancien tableau  : ");
		optabint1.writeTab(monTableau);
		
		
		
		
	    
		
		

	}

}
