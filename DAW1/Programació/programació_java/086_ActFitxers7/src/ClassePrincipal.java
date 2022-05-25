import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class ClassePrincipal {
	
	public static int[] posicionsMatriu(String nomFitxer) {
		String linea;
		String[] array;
		int[] arrayPosicionsMatriu = new int [2];
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
				linea = fileScanner.nextLine();
				array = linea.split("#");
				for (int i = 0; i < array.length; i++) {
					arrayPosicionsMatriu[i] = Integer.parseInt(array[i]);
				}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
		return arrayPosicionsMatriu;
	}
	
	public static void posicionsMatriu(String nomFitxer, String[][] matriuNumeros) {
		String linea;
		String[] array;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
				linea = fileScanner.nextLine();
				linea = fileScanner.nextLine();
				array = linea.split(",");
				for (int i = 0, k = 0; i < matriuNumeros.length; i++) {
					for (int j = 0; j < matriuNumeros[i].length; j++, k++) {
						matriuNumeros[i][j] = array[k];
					}
				}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void setMatriuToFile(String nomFitxerSortida, String[][] matriuNumeros) {
		try {
			FileWriter fitxer = new FileWriter(nomFitxerSortida);
			for (int i = 0; i < matriuNumeros.length; i++) {
				fitxer.write("\n");
				for (int j = 0; j < matriuNumeros[i].length; j++) {
					fitxer.write(matriuNumeros[i][j] + " ");
				}
			}
			fitxer.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/file.txt";
		String nomFitxerSortida = "lib/fileOut.txt";
		String[][] matriuNumeros = new String [posicionsMatriu(nomFitxer)[0]][posicionsMatriu(nomFitxer)[1]];
		posicionsMatriu(nomFitxer, matriuNumeros);
		setMatriuToFile(nomFitxerSortida, matriuNumeros);
	}
}