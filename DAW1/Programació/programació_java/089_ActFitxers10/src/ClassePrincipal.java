import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ClassePrincipal {
	static final Scanner teclat = new Scanner(System.in);
	
	public static int dadesUser(String demanarNum) {
		int num;
		
		System.out.println(demanarNum);
		num = teclat.nextInt();
		
		return num;
	}
	
	public static void omplirMatriu(int[][] matriuNums) {
	
		for (int i = 0; i < matriuNums.length; i++) {
			for (int j = 0; j < matriuNums[i].length; j++) {
				matriuNums[i][j] = dadesUser("Introdueix el número de la fila " + i + " i de la columna " + j);
			}
		}
	}
	
	public static void mostrarMatriu(int[][] matriuNums) {
		
		for (int i = 0; i < matriuNums.length; i++) {
			System.out.println();
			for (int j = 0; j < matriuNums[i].length; j++) {
				System.out.print(matriuNums[i][j]);
			}
		}
	}
	
	public static void setMatriuToFile(String nomFitxer, int[][] matriuNums) {
		try {
			FileWriter fitxer = new FileWriter(nomFitxer);
			for (int i = 0; i < matriuNums.length; i++) {
				if (i != 0) {
					fitxer.write("\n");
				}
				for (int j = 0; j < matriuNums[i].length; j++) {
					fitxer.write(matriuNums[i][j] + "");
					if (j != matriuNums.length-1) {
						fitxer.write("#");
					}
				}
			}
			fitxer.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void setFileToMatriu(String nomFitxer, int[][] matriuQuadrada2) {
		String linea;
		String[] array;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			for (int i = 0; i < matriuQuadrada2.length; i++) {
				linea = fileScanner.nextLine();
				array = linea.split("#");
				for (int j = 0; j < matriuQuadrada2[i].length; j++) {
					matriuQuadrada2[j][i] = Integer.parseInt(array[j]);
				}
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/file.txt";
		String nomFitxer2 = "lib/fileOut.txt";
		int columnesFiles = dadesUser("Introdueix el número de files i columnes que vols que tingui la matriu quadrada");
		int [][] matriuQuadrada = new int [columnesFiles][columnesFiles];
		int [][] matriuQuadrada2 = new int [columnesFiles][columnesFiles];
		omplirMatriu(matriuQuadrada);
		mostrarMatriu(matriuQuadrada);
		setMatriuToFile(nomFitxer, matriuQuadrada);
		setFileToMatriu(nomFitxer, matriuQuadrada2);
		System.out.println();
		mostrarMatriu(matriuQuadrada2);
		setMatriuToFile(nomFitxer2, matriuQuadrada2);
	}
}
