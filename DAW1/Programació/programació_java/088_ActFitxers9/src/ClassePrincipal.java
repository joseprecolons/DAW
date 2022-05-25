import java.io.File;
import java.util.Scanner;

public class ClassePrincipal {
	
	public static void omplirArray(String nomFitxer, String[] arrayNoms) {
		String linea;
		String[] array;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
				linea = fileScanner.nextLine();
				array = linea.split("\\W");
				for (int i = 0, j = arrayNoms.length-1; i < arrayNoms.length; i++, j--) {
					arrayNoms[j] = array[i];
				}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/file.txt";
		String[] arrayNoms = new String [3];
		omplirArray(nomFitxer, arrayNoms);
		for (int i = 0; i < arrayNoms.length; i++) {
			System.out.println(arrayNoms[i]);
		}
	}
}
