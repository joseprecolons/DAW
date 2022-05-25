import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int valorgran, valorpetit, aux;
		int numeros[] = new int[5];
		
		for (int i = 0; i<5; i++) {
			System.out.println("El valor de la posició" + i);
			numeros[i] = teclat.nextInt();
		}
		
		System.out.println("Introdueix el primer valor");
		valorgran = teclat.nextInt();
		System.out.println("Introdueix el segon valor");
		valorpetit = teclat.nextInt();
		
		if (valorgran < valorpetit) {
			aux = valorgran;
			valorgran = valorpetit;
			valorpetit = aux;
		}
		
		for (int l = 0; l < 5; l++) {
			if (numeros[l] < valorpetit) {
				numeros[l] = 0;
			} else if (numeros[l] > valorgran) {
				numeros[l] = 1;
			}
		}
		
		for (int n = 0; n < 5; n++) {
			System.out.println("A la posició " + n + "hi ha un" + numeros[n]);
		}
		
		teclat.close();
	}

}
