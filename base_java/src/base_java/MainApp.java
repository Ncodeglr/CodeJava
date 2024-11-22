package base_java;

public class MainApp {
	
	public static void main(String[] args) {
		
		Article article1 = new Article("pomme");
		Article article2 = new Article("tomate");
		
		//Changement de nom via la MÉTHODE SetName()
		article1.setName("orange");
		article1.drop();
		
		
	}

}
