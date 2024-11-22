package heritage_ref;

public class Main {

	public static void main(String[] args) {
		
		Apple pomme1 = new Apple("Pomme Pinklady"); //Création d'un objet Apple
		pomme1.taste();//Utlisation de méthodes de la class Apple hérité de la class Fruit
		pomme1.miam();
		
		Pineapple ananas1 = new Pineapple("Ananas Guyanais");//Création d'un objet Apple
		ananas1.taste();//Utlisation de méthodes de la class Pineapple hérité de la class Fruit
		ananas1.miam();
		
		pomme1.TypePomme(); //Utilisation de la Méthode 
		
	}
}
