import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class ClassePrincipal {

	public static int[] posicionsMatriu() {
		String linea;
		int[] arrayPosicionsMatriu = new int [2];
		try {
			File fitxer = new File("lib/file.txt");
			Scanner fileScanner = new Scanner(fitxer);
			
				linea = fileScanner.nextLine();
				String[] arrayPosicionsMatriuString = linea.split("#");
				for (int i = 0; i < arrayPosicionsMatriuString.length; i++) {
					arrayPosicionsMatriu[i] = Integer.parseInt(arrayPosicionsMatriuString[i]);
				}
				
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
		return arrayPosicionsMatriu;
	}
	
	public static void lecturaFitxer(String nomFitxer, int[][] matriu) {
		String linea;
		try {
			File fitxer = new File("lib/file.txt");
			FileWriter fitxerSortida = new FileWriter(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			while (fileScanner.hasNextLine()) {
				linea = fileScanner.nextLine();
				String[] arrayLletres = linea.split(",");
				
				fitxerSortida.write(linea);
			}
			fitxerSortida.close();
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/fileOut.txt";
		int[][] matriuNumeros = new int [posicionsMatriu()[0]][posicionsMatriu()[1]];
		lecturaFitxer(nomFitxer, matriuNumeros);
		
	}
}