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
		int numeros2[][] = new int[m][n];
		int numeros3[][] = new int[m][n];
		String simbolsuma = "+", simbolresta = "-", simbollinea = "|";
		
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Introdueix el valor " + j + " de la fila " + i);
				numeros[i][j] = teclat.nextInt();	
			}
		}
		
		for (int i = 0; i < numeros2.length; i++) {
			for (int j = 0; j < numeros2[i].length; j++) {
				System.out.println("Introdueix el valor " + j + " de la fila " + i);
				numeros2[i][j] = teclat.nextInt();	
			}
		}
		
		for (int i = 0; i < numeros3.length; i++) {
			for (int j = 0; j < numeros3[i].length; j++) {
				numeros3[i][j] = numeros[i][j] + numeros2[i][j];	
			}
		}
		
		for (int k = 0; k < n; k++) {
			System.out.print(simbolsuma + simbolresta);
			if (numeros3[0][k] > 9 || numeros3[0][k] < 0) {
				System.out.print(simbolresta);
			}
			if (numeros3[0][k] < -9) {
				System.out.print(simbolresta);
			}
		}
		System.out.println(simbolsuma);
		
		for (int i = 0; i < numeros3.length; i++) {
			for (int j = 0; j < numeros3[i].length; j++) {
				System.out.print(simbollinea + numeros3[i][j]);
			}
			System.out.println(simbollinea);
			
			for (int k = 0; k < n; k++) {
				System.out.print(simbolsuma + simbolresta);
				if (numeros3[i][k] > 9 || numeros3[i][k] < 0) {
					System.out.print(simbolresta);
				}
				if (numeros3[i][k] < -9) {
					System.out.print(simbolresta);
				}
			}
			System.out.println(simbolsuma);
		}
		 teclat.close();
	}

}