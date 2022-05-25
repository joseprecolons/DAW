import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class RecolonsJosepPart03 {
	static final Scanner teclat = new Scanner(System.in);
	
	public static String dadesUserString(String text) {
		String cadena;
		
		System.out.println(text);
		cadena = teclat.nextLine();
		
		return cadena;
	}
	
	
	public static int[] obteQuantitatDeVocals (String cadenaRebuda) {
		int [] quantitatVocals = new int [5];
		
		for (int i = 0; i < cadenaRebuda.length(); i++) {
			if (cadenaRebuda.charAt(i) == 'a' || cadenaRebuda.charAt(i) == 'à') {
				quantitatVocals[0]++;
			} else if (cadenaRebuda.charAt(i) == 'e' || cadenaRebuda.charAt(i) == 'è' || cadenaRebuda.charAt(i) == 'é') {
				quantitatVocals[1]++;
			} else if (cadenaRebuda.charAt(i) == 'i' || cadenaRebuda.charAt(i) == 'í') {
				quantitatVocals[2]++;
			} else if (cadenaRebuda.charAt(i) == 'o' || cadenaRebuda.charAt(i) == 'ò' || cadenaRebuda.charAt(i) == 'ó') {
				quantitatVocals[3]++;
			} else if (cadenaRebuda.charAt(i) == 'u' || cadenaRebuda.charAt(i) == 'ú') {
				quantitatVocals[4]++;
			}
		}
		
		return quantitatVocals;
	}
	
	public static int obteQuantitatParaules (String cadenaRebuda) {
		int quantitatParaules = 1;
		
		for (int i = 0; i < cadenaRebuda.length(); i++) {
			if (cadenaRebuda.charAt(i) == ' ') {
				quantitatParaules++;
			}
		}
		
		return quantitatParaules;
	}
	
	public static int[] creaArray (int[] vocals, int paraules) {
		int [] quantitatVocalsParaules = new int [vocals.length+1];
		
		for (int i = 0; i < quantitatVocalsParaules.length; i++) {
			if (i == vocals.length) {
				quantitatVocalsParaules[i] = paraules;
			} else {
				quantitatVocalsParaules[i] = vocals[i];
			}
		}
		return quantitatVocalsParaules;
	}
	
	public static void escriuMatriuAlFitxer (String nomFitxerSortida, int[][] dades) {
		String linea = "";
		try {
			File fitxer = new File(nomFitxerSortida);
			Scanner fileScanner = new Scanner(fitxer);
				linea = fileScanner.nextLine();
				
			FileWriter fitxerSortida = new FileWriter(nomFitxerSortida);
			for (int i = 0; i < dades.length; i++) {
					fitxerSortida.write("Fila " + (i+1) + " té " + dades[i][0] + " a's, " + dades[i][1] + " e's, " + 
							dades[i][2] + " i's, " + dades[i][3] + " o's, " + dades[i][4] + " u's i " + dades[i][5] + " paraules.\n");
			}
			fitxerSortida.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static String setFileToString(String nomFitxer, int lineaActual) {
 		String linea = "";
 		int contador = 0;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			while (contador < lineaActual) {
				linea = fileScanner.nextLine();
				contador++;
			}
			linea = fileScanner.nextLine();
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer"); //Si algo no surt ve amb aquesta funció, mostrara aquest missatge per pantalla
		}
		return linea;
	}
	
	public static int liniesDelFitxer(String nomFitxer) {
		int contador = 0;
		String linea; //Encara que digui que no s'utilitza aquesta funció es necessaria perquè compti les linies
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			while (fileScanner.hasNextLine()) { //Mentre hi hagi una linea per sota, no sortirem del while
				linea = fileScanner.nextLine();
				contador++;
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer"); //Si algo no surt ve amb aquesta funció, mostrara aquest missatge per pantalla
		}
		
		return contador;
	}
	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		String nomFitxer = "lib/" + dadesUserString("Escriu el nom del fitxer de on vols treure les dades");
 		String nomFitxerSortida = "lib/" + dadesUserString("Escriu el nom del fitxer a on vols escriure les dades de la matriu");
 		int [][] dadesFinals = new int [liniesDelFitxer(nomFitxer)][6];
 		
 		for (int i = 0; i < dadesFinals.length; i++) {
 			for (int j = 0; j < dadesFinals[i].length; j++) {
 				dadesFinals[i][j] = creaArray(obteQuantitatDeVocals(setFileToString(nomFitxer, i)), obteQuantitatParaules(setFileToString(nomFitxer, i)))[j];
 			}
 		}
 		
 		for (int i = 0; i < dadesFinals.length; i++) {
 			for (int j = 0; j < dadesFinals[i].length; j++) {
 				escriuMatriuAlFitxer(nomFitxerSortida, dadesFinals);
 			}
 		}
 		
 		
 		
 		
	}

}
