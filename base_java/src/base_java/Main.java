package base_java;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point myPoint = new Point(10, 10);
		Division mydiv = new Division(5, 7.5);
		Vector myvector = new Vector(2,4);
		
		Person person1 = new Person("Maman",55);
		Person person2 = new Person("Papa",55);
		Person person3 = new Person("Mamie",85);
		Person person4 = new Person("Mamie"); //Utilisation du OVERLOADING
		Person person5 = new Person(56); //Utilisation du OVERLOADING
		
		
		mydiv.affichage_console();
		
		
		double res;
		res = myvector.getLength();
		System.out.println("Le résultat est "+ res);
		
		
        //Création d'un ArrayList stockant les personnes  
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		System.out.println(personList.get(0).getAge()); //get(0) signifie le premier indice de la liste 
		
		
		//Je change l'Age de la personne 1 avec la MÉTHODE setAge
		person1.setAge(10000);
		//J'affiche le Nom et l'Age avec la MÉTHODE getName et getAge
		System.out.println("Nom = "+personList.get(0).getName()+" : Age =  "+personList.get(0).getAge());
		System.out.println("-----------------------------------------------");
		System.out.println("Afficher les éléments spé JAVA");
		System.out.println(" ");
		
		//On peut utliser une boucle parcourant la list 
		for(Person  i : personList) {
			System.out.println("Nom = "+i.getName()+" : Age =  "+i.getAge());
		}
		
		
		//Supression d'un élément de la liste
		personList.remove(person1);
		System.out.println("-----------------------------------------------");
		System.out.println("Afficher les éléments avec for classique");
		System.out.println(" ");
		for (int i=0; i<personList.size(); i++) {
			System.out.println("Nom = "+personList.get(i).getName()+" : Age =  "+personList.get(i).getAge());
			
		}
		
		
	}


}
