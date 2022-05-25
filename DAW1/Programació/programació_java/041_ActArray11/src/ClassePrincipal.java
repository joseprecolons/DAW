import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int numelements = 5;
		int numeros[] = new int[numelements];
		int numeros2[] = new int[numelements];
		
		
		for (int i = 0; i < numelements; i++) {
			System.out.println("Introdueix el valor de la posició " + i);
			numeros[i] = teclat.nextInt();
		}
		
		for (int j = 0; j < numelements; j++) {
			if (j == numeros2.length - 1) {
				numeros2[0] = numeros[numeros2.length - 1];
			} else {
				numeros2[(j + 1)] = numeros[j];
			}
		}
		
		System.out.println("Números sense desplaçar");
		for (int l = 0; l < numelements; l++) {
			System.out.print(numeros[l] + " ");
		}
		
		System.out.println();
		
		System.out.println("Números desplaçats");
		for (int p = 0; p < numelements; p++) {
			System.out.print(numeros2[p] + " ");
		}
		
		System.out.println();
		
		teclat.close();
	}

}
