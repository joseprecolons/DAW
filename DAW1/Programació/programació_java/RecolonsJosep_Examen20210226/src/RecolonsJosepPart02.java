import java.io.File;
import java.util.Scanner;

public class RecolonsJosepPart02 {

	public static boolean conteRepetits(String[] cadenaRebuda) {
		boolean repetits = false;
		
		for (int i = 0; i < cadenaRebuda.length; i ++) {
			for (int j = 0; j < cadenaRebuda.length; j++) {
				if (cadenaRebuda[i].equals(cadenaRebuda[j]) && i != j) { //Al ser strings es comparen amb la funció equals
					repetits = true;
					break; // Si es true directament sortim i ja pasem el resultat de la funció
				}
			}
		}
		return repetits;
	}
	
	public static void setFileToMatriu(String nomFitxer) {
		String[] cadenaEnters;
		int contador = 1; //Per contar la linia en la que estem actualment així poder treureu per pantalla
 		String linea;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			while (fileScanner.hasNextLine()) {
				linea = fileScanner.nextLine();
				cadenaEnters = linea.split(",");
				if (conteRepetits(cadenaEnters)) {
					System.out.print("Fila " + contador + " de " + liniesDelFitxer(nomFitxer) + " té nombres duplicats"); //Si es true mostrem aquest missatge
				} else {
					System.out.print("Fila " + contador + " de " + liniesDelFitxer(nomFitxer) + " no hi ha nombres duplicats"); //Si es false mostrem aquest altre
				}
				System.out.println();
				contador++; // Sumem el contador per estar actualitzats a l'hora de mostrar per pantalla la linea en la que estem
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer"); //Si algo no surt ve amb aquesta funció, mostrara aquest missatge per pantalla
		}
	}
	
	public static int liniesDelFitxer(String nomFitxer) { //Aquesta es la funció de la part01 per contar les linies del fitxer
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/filePart02.csv";
		setFileToMatriu(nomFitxer);
	}

}
