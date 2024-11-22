package base_java;

public class Person {
	
	private String Name;
	private int age;
	
	//Constructeur
	public Person(String name, int age) {
		super();
		this.Name = name;
		this.age= age;
	}
	
	//OVERLOADING == Permet de créer un objet sans à avoir toutes les data dispo à l'instant 
    //////////////////////////////////////////////////////////////////
	public Person(String name) {
		super();
		Name = name; //Si par exemeple on a que le nom 
		
	}
	public Person(int age) {
		super();
		this.age= age; //Si par exemeple on a que l'age 
		
	}
	
	
	
	//////////////////////////////////////////////////////////////////
	
	
	//MÉTHODES
	public String getName() {return Name;} //Récupère la variable en dehors de la class Person
	public void setName(String name) {Name = name;}//Configure la variable
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	
	
	
	
	
	
	
	
	
	
	

}
