import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Enunciat02 {
	
	static final Scanner teclat = new Scanner(System.in);
	
	public static int funcioTeclat(String msg) {
		int num;

		System.out.println(msg);
		num = teclat.nextInt();
		
		return num;
	}

	public static int contadorFiles(String nomFitxer) {
		int contador = 0;
		String linea;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			while (fileScanner.hasNextLine()) {
				linea = fileScanner.nextLine();
				contador++;
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
		
		return contador;
	}
	
	public static int generarNumRandom(String nomFitxer) {
		return (int) (Math.random() * contadorFiles(nomFitxer));
	}
	
	public static void crearProductes(String[] arrayProductesFinal, String[] arrayObj, 
			String[] arrayFunc, String[] arrayAdj, String[] nomsFitxers) {
		for (int i = 0; i < arrayProductesFinal.length; i++) {
			arrayProductesFinal[i] = arrayObj[generarNumRandom(nomsFitxers[0])] + "-" + 
					arrayFunc[generarNumRandom(nomsFitxers[1])] + "-" + arrayAdj[generarNumRandom(nomsFitxers[2])];
		}
	}
	
	public static void setFileToArray(String nomFitxer, String[] array) {
		String linea;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			for (int i = 0; i < array.length; i++) {
				linea = fileScanner.nextLine();
				array[i] = linea;
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void setArrayToFile(String nomFitxer, String[] array) {
		try {
			FileWriter fitxer = new FileWriter(nomFitxer);
			for (int i = 0; i < array.length; i++) {
				if(i != 0) {
					fitxer.write(array[i] + "\n");	
				}
			}
			fitxer.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nomsFitxers = {"lib/objectes.txt", "lib/funcions.txt", "lib/adjectius.txt", "lib/sortida.txt"};
		//Com que tinc molts fitxers, posu els noms en un array
		
		int numProductes = funcioTeclat("Quantitat de productes que vols crear");
		String[] objectes = new String [contadorFiles(nomsFitxers[0])];
		String[] funcions = new String [contadorFiles(nomsFitxers[1])];
		String[] adjectius = new String [contadorFiles(nomsFitxers[2])];
		String[] arrayProductesFinal = new String [numProductes+1];
		/*Tots aquests arrays, no els creo en una matriu perquè en aquest cas son tots de les mateixes posicions
		pero podrian no ser-ho, i no se fer una matriu amb diferent número de posicions cada fila*/
		
		
		setFileToArray(nomsFitxers[0], objectes);
		setFileToArray(nomsFitxers[1], funcions);
		setFileToArray(nomsFitxers[2], adjectius);
		
		crearProductes(arrayProductesFinal, objectes, funcions, adjectius, nomsFitxers);
		
		setArrayToFile(nomsFitxers[3], arrayProductesFinal);
	}

}
