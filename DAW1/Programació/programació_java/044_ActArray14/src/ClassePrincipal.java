import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int numelements = 5;
		int dif = 0, resultat = 0;
		int posicio1 = 0, posicio2 = 0;
		int numeros[] = new int[numelements];
		
		for (int i = 0; i < numelements; i++) {
			System.out.println("Introdueix el valor de la posició " + i);
			numeros[i] = teclat.nextInt();
		}
		
		for (int j = 0; j < numeros.length - 1; j++) {
			dif = numeros[j] - numeros[j + 1];
			if (dif < 0) {
				dif = dif * -1;
			}
			
			System.out.println("La diferencia entre " + numeros[j] + " i " + numeros[j + 1] + " es " + dif);
			
			if (dif > resultat) {
				resultat = dif;
				posicio1 = j;
				posicio2 = j + 1;
			}
		}
		
		System.out.println("La diferència màxima és " + resultat + " i es troba entre les posicions " + posicio1 + " i " + posicio2);
		
		
		
		
		teclat.close();
	}

}