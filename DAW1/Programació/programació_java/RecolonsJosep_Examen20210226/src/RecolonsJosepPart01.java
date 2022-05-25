import java.io.File;
import java.util.Scanner;

public class RecolonsJosepPart01 {
	
	public static void mostrarMatriuEnters(int[][] matriuRebuda) {
		for (int i = 0; i < matriuRebuda.length; i++) {
			if (i != 0 ) {
				System.out.println(); // Posu el if perqu� aix� quan es la primera linea no fa un salt nom�s comen�ar
			}
			for (int j = 0; j < matriuRebuda[i].length; j++) {
				System.out.print(matriuRebuda[i][j] + " ");
			}
		}
	}
	
	public static void mostrarMatriuEnters(String[][] matriuRebuda) {
		for (int i = 0; i < matriuRebuda.length; i++) {
			if (i != 0 ) {
				System.out.println(); // Posu el if perqu� aix� quan es la primera linea no fa un salt nom�s comen�ar
			}
			for (int j = 0; j < matriuRebuda[i].length; j++) {
				System.out.print(matriuRebuda[i][j] + " ");
			}
		}
	}
	
	public static int liniesDelFitxer(String nomFitxer) {
		int contador = 0;
		String linea; //Encara que digui que no s'utilitza aquesta funci� es necessaria perqu� compti les linies
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			while (fileScanner.hasNextLine()) { //Mentre hi hagi una linea per sota, no sortirem del while
				linea = fileScanner.nextLine();
				contador++;
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer"); //Si algo no surt ve amb aquesta funci�, mostrara aquest missatge per pantalla
		}
		
		return contador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/file.txt";
		
		System.out.println(liniesDelFitxer(nomFitxer)); //Mostra el n�mero de linies per pantalla
	}

}
