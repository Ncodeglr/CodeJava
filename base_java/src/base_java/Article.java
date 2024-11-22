package base_java;

public class Article {
	
	//Attributs
	private String name;
	
	
	
	//Constructeur
	public Article(String name) {
		this.name = name;
		
		
		}
	
	
	
	//Méthodes
	public void setName(String name) { this.name = name;}
	public String getName() {return name;}
	
	

	
	public void drop() {System.out.println("L'article "+name+" est déposé");}
	
	

}
