package heritage_ref;


//La class Fruit est "abstract", ce qui signifie les que les objet qui vont hériter de celle-ci devront-- 
//--redéfinir les méthodes de type "abstract".


public abstract class Fruit {
	
	//Attributs
	private String name;
	
	//Constructeur 
	public Fruit(String name) {
		this.name = name;
	}
	
	//MÉTHODE de la super class
	public String getName() {return name;}
	public abstract void taste();
	public abstract int getSize();
	public abstract boolean HasSeed(); //Fruit a-t-il des pépins
	
	//Je rajoute une méthode qui sera dispo pour les objets Apple, Pineapple
	public void miam() {
		System.out.println("C'est Miam ");
		System.out.println("Le nom du fruit est "+getName());
		
	}
	

}
