import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class ClassePrincipal {

	public static final Scanner teclat = new Scanner(System.in);
	
	public static int dadesUser(String demanarNum) {
		int num;
		
		System.out.println(demanarNum);
		num = teclat.nextInt();
		
		return num;
	}
	
	public static void omplirMatriu(int[][] matriu) {
		for (int i = 0, k = 1; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++, k++) {
				matriu[i][j] = k;
			}
		}
	}
	
	public static void lecturaFitxer(String nomFitxer, int[][] matriu) {
		try {
			FileWriter fitxerSortida = new FileWriter(nomFitxer);
			for (int i = 0, k = 1; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++, k++) {
					if (j == matriu[i].length-1) {
						fitxerSortida.write(matriu[i][j] + "\n");
					} else {
						fitxerSortida.write(matriu[i][j] + " ");
					}
				}
			}
			fitxerSortida.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		num1 = dadesUser("Introdueix el número de files");
		num2 = dadesUser("Introdueix el número de columnes");
		int[][] matriuNumeros = new int [num1][num2];
		String nomFitxer = "lib/fileOut.txt";
		omplirMatriu(matriuNumeros);
		lecturaFitxer(nomFitxer, matriuNumeros);
		
	}
}