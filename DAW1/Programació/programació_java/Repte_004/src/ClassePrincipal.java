import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ClassePrincipal {

	public static int[] dimensionsMatriu(String nomFitxer, int contador) {
		String[] cadena;
		int[] arrayDimensions = null;
 		String linea;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			while (contador > 0) {
				linea = fileScanner.nextLine();
				contador--;
			}
				linea = fileScanner.nextLine();
				cadena = linea.split(" ");
				arrayDimensions = new int [cadena.length];
				for (int i = 0, j = 1; i < cadena.length; i++, j--) {
					arrayDimensions[i] = Integer.parseInt(cadena[j]);
				}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
		return arrayDimensions;
	}
	
	public static void setFileToMatriu(String nomFitxer, char[][] matriu, int contador) {
 		String linea;
 		int i = 0;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			while (contador > 0) {
				linea = fileScanner.nextLine();
				contador--;
			}
			linea = fileScanner.nextLine();
			while (i < matriu.length) {
				linea = fileScanner.nextLine();
				for (int j = 0; j < matriu[i].length; j++) {
					matriu[i][j] = linea.charAt(j);
				}
				i++;
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static boolean getNumeroBombes(char[][] matriu, int a, int b) {
		int numBombes = 0;
		boolean bombes;
				if (a != 0 && b != 0 && matriu[a-1][b-1] == '*') {
					numBombes++;
				}
				if (a != 0 && matriu[a-1][b] == '*') {
					numBombes++;
				}
				if (a != 0 && b != matriu[a].length-1 && matriu[a-1][b+1] == '*') {
					numBombes++;
				}
				if (b != 0 && matriu[a][b-1] == '*') {
					numBombes++;
				}
				if (b != matriu[a].length-1 && matriu[a][b+1] == '*') {
					numBombes++;
				}
				if (b != 0 && a != matriu.length-1 && matriu[a+1][b-1] == '*') {
					numBombes++;
				}
				if (a != matriu.length-1 && matriu[a+1][b] == '*') {
					numBombes++;
				}
				if (a != matriu.length-1 && b != matriu[a].length-1 && matriu[a+1][b+1] == '*') {
					numBombes++;
				}
	
				
				if (numBombes >= 6) {
					bombes = true;
				} else {
					bombes = false;
				}
		return bombes;
	}
	
	public static int contarBombes (String nomFitxerSortida, char[][] dades) {
		int contador = 0;
		for (int i = 0; i < dades.length; i++) {
			for (int j = 0; j < dades[i].length; j++) {
				if (getNumeroBombes(dades, i, j)) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	
	public static void escriuMatriuAlFitxer (String nomFitxerSortida, int[] nums) {
		
		try {
			FileWriter fitxerSortida = new FileWriter(nomFitxerSortida);
			for (int i = 0; i < nums.length; i++) {
				fitxerSortida.write(String.valueOf(nums[i]) + "\n");
			}
			fitxerSortida.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		int num = 0;
		int [] numeroBombes = new int [2];
		String nomFitxer = "lib/file.txt";
 		String nomFitxerSortida = "lib/fileOut.txt";
 		//En el fitxer el primer número son les files i el segon les columnes, perquè fer-ho al revés no te sentit, 
 		//i si el client ho vol així, es fot, hi ho fa com s'ha de fer.
 		while (dimensionsMatriu(nomFitxer, contador)[0] != 0 && dimensionsMatriu(nomFitxer, contador)[1] != 0) {
 			char[][] matriuBuscaminas = new char [dimensionsMatriu(nomFitxer, contador)[0]][dimensionsMatriu(nomFitxer, contador)[1]];
 	 	 	setFileToMatriu(nomFitxer, matriuBuscaminas, contador);
 	 	 	numeroBombes[num] = contarBombes(nomFitxerSortida, matriuBuscaminas);
 	 	 	contador = contador + matriuBuscaminas.length + 1;
 	 	 	
 	 	 	for (int i = 0; i < matriuBuscaminas.length; i++) {
 	 	 		System.out.println();
 	 			for (int j = 0; j < matriuBuscaminas[i].length; j++) {
 	 				System.out.print(matriuBuscaminas[i][j]);
 	 			}
 	 		}
 	 	 	num++;
 		}
 		
 		escriuMatriuAlFitxer(nomFitxerSortida, numeroBombes);
 		
	}

}
