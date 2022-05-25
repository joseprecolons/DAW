import java.util.*;

public class ClassePrincipal {
	
	public static int DemanarDadesTeclat(String msg) {
		Scanner teclat = new Scanner(System.in);
		System.out.println(msg);
		int num = teclat.nextInt();
		return num;
	}
	
	public static void DemanarPosicioInsectes(int array[][], int insectes) {
		Scanner teclat2 = new Scanner(System.in);
		for (int i = 0; i < insectes; i++) {
			System.out.println("Introdueix la fila de l'insecte número " + (i+1));
			int num = teclat2.nextInt();
			System.out.println("Introdueix la columna de l'insecte número " + (i+1));
			int num2 = teclat2.nextInt();
			array[num][num2] = 1;
			
		}
	}
	
	public static void VisualitzarMatriu(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(" " + m[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void MatriuTest_toMatriu(int[][] m, int[][] m2) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = m2[i][j];
			}
		}
		
	}
	
	public static int getNumeroVeins(int[][] m, int a, int b) {
		int veins = 0;
				if (a != 0 && b != 0 && m[a-1][b-1] == 1) {
					veins++;
				}
				if (a != 0 && m[a-1][b] == 1) {
					veins++;
				}
				if (a != 0 && b != m.length-1 && m[a-1][b+1] == 1) {
					veins++;
				}
				if (b != 0 && m[a][b-1] == 1) {
					veins++;
				}
				if (b != m.length-1 && m[a][b+1] == 1) {
					veins++;
				}
				if (b != 0 && a != m.length-1 && m[a+1][b-1] == 1) {
					veins++;
				}
				if (a != m.length-1 && m[a+1][b] == 1) {
					veins++;
				}
				if (a != m.length-1 && b != m.length-1 && m[a+1][b+1] == 1) {
					veins++;
				}
				
		return veins;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numElements = DemanarDadesTeclat("Introdueix les posicions que vols que tingui la matriu");
		int numInsectes =  DemanarDadesTeclat("Introdueix el número d'insectes amb el que vols començar");
		int[][] matriuInsectes = new int [numElements][numElements];
		int[][] matriuInsectesTest = new int [numElements][numElements];
		DemanarPosicioInsectes(matriuInsectes, numInsectes);
		int numCicles = DemanarDadesTeclat("Introdueix el número de cicles que vols que fagi la matriu");
		VisualitzarMatriu(matriuInsectes);
		
		MatriuTest_toMatriu(matriuInsectesTest, matriuInsectes);
		
		while (numCicles > 0) {
			for (int i = 0; i < matriuInsectesTest.length; i++) {
				for (int j = 0, k = 0; j < matriuInsectesTest[i].length; j++) {
					k = getNumeroVeins(matriuInsectes, i, j);
					if (k == 0 || k == 1 || k == 4 || k == 5 || k == 6 || k == 7 || k == 8 && matriuInsectes[i][j] == 1) {
						matriuInsectesTest[i][j] = 0;
					} else if (k == 3 && matriuInsectes[i][j] == 0) {
						matriuInsectesTest[i][j] = 1;
					}
				}
			}
			MatriuTest_toMatriu(matriuInsectes, matriuInsectesTest);
			numCicles--;
		}
		System.out.println();
		VisualitzarMatriu(matriuInsectes);
		

	}

}