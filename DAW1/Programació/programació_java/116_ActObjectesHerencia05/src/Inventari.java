import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Inventari {
	private static Scanner teclat = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcio;
		
		ArrayList arrList = new ArrayList();
		
		arrList.add(new Perro("Perro1", "bueno", 12, 2009, "razaX", false));
		arrList.add(new Loro("Loro1", "bueno", 12, 2009, "largo", true, "español", true));
		
		do {
			System.out.println("Indica quina acció vols realitzar: \n"
					+ "1. Mostrar la llista d'animals \n"
					+ "2. Mostrar totes les dades d'un animal en concret \n"
					+ "3. Mostrar totes les dades de tots els animals  \n"
					+ "4. Insertar animals en l'inventari \n"
					+ "5. Eliminar animals de l'inventari \n"
					+ "6. Buidar l'inventari \n"
					+ "7. Sortir \n");
			opcio = teclat.nextInt();
			
			switch(opcio) {
				case 1:
					Iterator it = arrList.iterator();
					
					while(it.hasNext()) {
						Object contigunt = it.next();
						if(contigunt instanceof Perro) {
							Perro tmb = (Perro) contigunt;
							System.out.println(tmb.info());
						} else if(contigunt instanceof Gato) {
							Gato tmb = (Gato) contigunt;
							System.out.println(tmb.info());
						} else if(contigunt instanceof Loro) {
							Loro tmb = (Loro) contigunt;
							System.out.println(tmb.info());
						} else if(contigunt instanceof Canario) {
							Canario tmb = (Canario) contigunt;
							System.out.println(tmb.info());
						}
						
					}
					break;
					
				case 2:
					System.out.println("Quin animals vols treure per pantalla?");
					int animal = teclat.nextInt();
					System.out.println(arrList.get(animal).toString());
					break;
					
				case 3:
					for (int i = 0; i < arrList.size(); i++) {
						System.out.println(arrList.get(i).toString());
					}
					break;
					
				case 4:
					
					arrList.add(new Gato("Gato1", "bueno", 12, 2009, "azul", false));
					arrList.add(new Loro("Loro", "bueno", 12, 2009, "corto", false, "americano", true));
					arrList.add(new Canario("Canario76", "bueno", 12, 2009, "corto", false,  "rojo", true));
					
					System.out.println("Los animales se han añadido correctamente!");
					break;
					
				case 5:
					arrList.remove(1);
					
					System.out.println("El animal se ha eliminado correctamente!");
					break;
					
				case 6:
					for (int i = 0; i < arrList.size();) {
						arrList.remove(i);
					}
					
					System.out.println("Todos los animales se han eliminado correctamente!");
					break;
				
			
			}
		} while (opcio != 7);
	}

}
