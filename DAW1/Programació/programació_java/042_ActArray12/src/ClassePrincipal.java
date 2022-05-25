import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int numelements = 5;
		int posicions;
		int numeros[] = new int[numelements];
		int numeros2[] = new int[numelements];
		
		System.out.println("Introdueix les posicions que vols que es desplaci"); //Ha de ser mes petit que "numelements"
		posicions = teclat.nextInt();
		
		
		for (int i = 0; i < numelements; i++) {
			System.out.println("Introdueix el valor de la posició " + i);
			numeros[i] = teclat.nextInt();
		}

		
		for (int j = 0; j < numeros.length; j++) {
			if (j + posicions >= numeros.length) {
				numeros2[(j + posicions) - numeros.length] = numeros [j];
				
			} else {
				numeros2[j + posicions] = numeros[j];
			}
		}
		
		
		System.out.println("Números sense desplaçar");
		for (int l = 0; l < numeros.length; l++) {
			System.out.print(numeros[l] + " ");
		}
		
		System.out.println();
		
		System.out.println("Números desplaçats");
		for (int p = 0; p < numeros.length; p++) {
			System.out.print(numeros2[p] + " ");
		}
		
		System.out.println();
		
		teclat.close();
	}

}