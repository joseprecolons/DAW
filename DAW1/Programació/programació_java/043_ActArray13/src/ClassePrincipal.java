import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		Scanner teclatdireccio = new Scanner(System.in);
		int numelements = 5;
		String direccio;
		int posicions;
		int numeros[] = new int[numelements];
		int numeros2[] = new int[numelements];
		
		System.out.println("Introdueix les posicions que vols que es desplaci"); //Ha de ser mes petit que "numelements"
		posicions = teclat.nextInt();
		
		System.out.println("Introdueix la direcció, a la que vols que roti l'array, dreta o esquerra."); //Ha de ser mes petit que "numelements"
		direccio = teclatdireccio.nextLine();
		
		for (int i = 0; i < numelements; i++) {
			System.out.println("Introdueix el valor de la posició " + i);
			numeros[i] = teclat.nextInt();
		}

		if (direccio.equals("dreta") || direccio.equals("d") || direccio.equals("D")) {
		
			for (int j = 0; j < numeros.length; j++) {
				if (j + posicions >= numeros.length) {
					numeros2[(j + posicions) - numeros.length] = numeros [j];
					
				} else {
					numeros2[j + posicions] = numeros[j];
				}
			}
			
		} else  if (direccio.equals("esquerra") || direccio.equals("e") || direccio.equals("E")) {
			
			for (int j = numeros.length - 1; j >= 0; j--) {
				if (j - posicions < 0 ) {
					numeros2[(numeros.length + j) - posicions] = numeros[j];
					
				} else {
					numeros2[(j - posicions)] = numeros[j];
				}
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
		teclatdireccio.close();
	}

}