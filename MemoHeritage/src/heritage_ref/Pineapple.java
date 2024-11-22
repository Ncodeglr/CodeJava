package heritage_ref;

public class Pineapple extends Fruit {

	//Constructeur
	public Pineapple(String name_ananas) {
		super(name_ananas);//Récupère name_ananas et appel le Constructeur de Fruit avec cette variable 
		
	}

	
	//MÉTHODES
	
	@Override
	public void taste() {System.out.println("Gout est acide");}
	@Override
	public int getSize() {return 2;}
	@Override
	public boolean HasSeed() {return true;}

}
