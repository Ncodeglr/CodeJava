package heritage_ref;


//La class Apple hérite de la class Fruit, on le remarque avec le "extends Fruit".
//On récupère les méthode déja initialisée dans la class mère aka la class Fruit.



public class Apple extends Fruit {

	//Constructeur
	public Apple(String name_pomme) {
		super(name_pomme); //Récupère name_pommme et appel le Constructeur de Fruit avec cette variable 
	
	}

	
	//MÉTHODES : On a redéfnis les méthodes de la class abstraite de l'objet Fruit
	
	@Override
	public void taste() {System.out.println("Gout est sucré");}
	@Override
	public int getSize() {return 1;}
	@Override
	public boolean HasSeed() {return true;}
	
	//Une class dispo que pour les objets de type Pomme 
	public void TypePomme() {
		String pink = "Pomme Pinklady";
	    if(getName().equals(pink)) {
	    	System.out.println("La pomme est de type : "+ pink);
	    }
	    else {System.out.println("La pomme est d'un autre type");}
	    }

}
