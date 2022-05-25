import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclat = new Scanner (System.in);
		Scanner teclatlletres = new Scanner (System.in);
		String direccio;
		int m, n;
		boolean sortir = false;
		
		do {
			System.out.println("Introdueix les files que vols que tingui la matriu");
			m = teclat.nextInt();
			System.out.println("Introdueix les columnes que vols que tingui la matriu");
			n = teclat.nextInt();
			if (m == 0 || n == 0) {
				sortir = true;
				System.out.println("Has sortit del programa");
				break;
			}
		} while (m != n);
		 
		System.out.println("Digues si vols construir la diagonal esquerra o dreta");
		direccio = teclatlletres.nextLine();
		
		int numeros[][] = new int[m][n];
		 
		
		if (direccio.equals("e")) {
			for (int i = 0; i < numeros.length && sortir == false; i++) {
				for (int j = 0; j < numeros[i].length; j++) {
					numeros[i][j] = 0;
				}
				numeros[i][i] = 1;
			}
		} else {
			for (int i = 0; i < numeros.length && sortir == false; i++) {
				for (int j = 0; j < numeros[i].length; j++) {
					if (i + j == numeros.length - 1) {
						numeros[i][j] = 1;
					} else {
						numeros[i][j] = 0;
					}
				}
			}
		}
		
		for (int i = 0; i < numeros.length && sortir == false; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(" " + numeros[i][j] + " ");
			}
			System.out.println();
		}
		
		 teclat.close();
		 teclatlletres.close();
	}

}