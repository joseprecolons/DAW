import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclat = new Scanner (System.in);
		int m, n;
		boolean sortir = false;
		boolean becknormal = true;
		
			System.out.println("Introdueix les files que vols que tingui la matriu");
			m = teclat.nextInt();
			System.out.println("Introdueix les columnes que vols que tingui la matriu");
			n = teclat.nextInt();
			if (n%2 != 0) {
				sortir = true;
			}
			
		int numeros[][] = new int[m][n];
		 
		for (int i = 0; i < numeros.length && sortir == false; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Introdueix el valor " + j + " de la fila " + i);
				numeros[i][j] = teclat.nextInt();
			}
		}
		
		for (int i = 0; i < numeros.length && sortir == false; i++) {
			for (int j = 0; j < numeros[i].length - 1; j= j+2) {
				if (numeros[i][j] != numeros[i][j+1]) {
					becknormal = false;
					break;
				}
			}
			if (becknormal == true) {
				System.out.println("La fila " + i + " es becknormal");
			} else {
				System.out.println("La fila " + i + " no es becknormal");
			}
		}
		
		for (int i = 0; i < numeros.length && sortir == false; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(" " + numeros[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Final");
		
		
		 teclat.close();
	}

}