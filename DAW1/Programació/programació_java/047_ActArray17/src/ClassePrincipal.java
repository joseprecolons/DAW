import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int numapostes;
		boolean guanyar = true;
		int numelements = 6;
		int numeros[] = new int[numelements];
		
		System.out.println("Introdueix el numero d'apostes que vols fer");
		numapostes = teclat.nextInt();
		
		int numeros2[][] = new int[numapostes][numelements];
		
			for (int j = 0; j < numelements; j++) {
				int x = (int) (100 * Math.random()+1);
				numeros[j] = x;
			}
			
			for (int j = 0; j < numelements; j++) {
				System.out.print(numeros[j] + " ");
			}
			
			System.out.println();
			
			for (int i = 0; i < numeros2.length; i++) {
				for (int j = 0; j < numeros2[i].length; j++) {
					System.out.println("Introdueix el numero " + (j + 1) + " de l'aposta " + (i + 1));
					numeros2[i][j] = teclat.nextInt();
				}
			}
			
			for (int i = 0; i < numeros2.length; i++) {
				guanyar = true;
				for (int j = 0; j < numeros2[i].length; j++) {
					if (numeros[j] != numeros2[i][j]) {
						System.out.println("L'aposta número " + (i + 1) + " no es la guanyadora :c");
						guanyar = false;
						break;
					}
				}
				
				if (guanyar == true) {
					System.out.println("L'aposta número " + (i + 1) + " es la guanyadora :3");
				}
			}
		
		
		teclat.close();
	}

}