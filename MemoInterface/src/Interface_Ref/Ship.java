package Interface_Ref;

public class Ship extends Vehicule implements Flyable{
	
	
	public Ship() {
		this.mMovementSpeed= 16;
	}

    public void moveXY(int x, int y) {
    	System.out.println("Le navire brasse les flots et se déplace en"+x+ ","+y);
    }

    
    //----------------UTILISATION DE LA 1er MÉTHODE DE L'INTERFACE FLYABLE-------------------//
    @Override
    public void fly(String energy) {
    	System.out.println("Je me propulse dans les airs avec du "+energy+".");
    	
    }






}
