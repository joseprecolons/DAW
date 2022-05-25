import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclat = new Scanner (System.in);
		int m, n;
		System.out.println("Introdueix les files que vols que tingui la matriu");
		m = teclat.nextInt();
		System.out.println("Introdueix les columnes que vols que tingui la matriu");
		n = teclat.nextInt();
		 
		int numeros[][] = new int[m][n];
		int numeros2[][] = new int[n][m];
		 
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Introdueix el valor de la fila " + i + " i de la columna " + j);
				numeros[i][j] = teclat.nextInt();
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros2[j][i] = numeros[i][j];
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < numeros2.length; i++) {
			for (int j = 0; j < numeros2[i].length; j++) {
				System.out.print(numeros2[i][j] + " ");
			}
			System.out.println();
		}
		
		 teclat.close();
	}

}