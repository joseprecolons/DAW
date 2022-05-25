import java.util.ArrayList;

public class ClassePrincipal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrList = new ArrayList();
		
		arrList.add(new Pelicula ("Venom", "Jeff Pinker", "dvd", 112, "Tom Hardy", "Ruben Fleischer"));
		arrList.add(new Pelicula ("Venom2", "Jeff Pinker", "dvd", 112, "Tom Hardy", "Ruben Fleischer"));
		arrList.add(new Pelicula ("Venom", "Jeff Pinker", "dvd", 112, "Tom Hardy", "Ruben Fleischer"));
	
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		for (int i = 0; i < arrList.size(); i++) {
			for (int j = 0; j < arrList.size(); j++) {
				if (i != j) {
					if (((Multimedia) arrList.get(i)).comparacio((Multimedia) arrList.get(j))) {
						System.out.println("La pelicula de la posició " + i + " es igual a la pelicula de la posició " + j);
					}
				}
			}
		}
	}

}
