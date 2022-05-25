import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int numelements = 5;
		boolean iguals = true;
		int numeros[] = new int[numelements];
		int numeros2[] = new int[numelements];
		
		for (int i = 0; i < numelements; i++) {
			System.out.println("Introdueix el valor de la posició " + i);
			numeros[i] = teclat.nextInt();
		}
		
		for (int i = 0; i < numelements; i++) {
			System.out.println("Introdueix el valor de la posició " + i);
			numeros2[i] = teclat.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] != numeros2[i]) {
				iguals = false;
				break;
			}
		}
		
		if (iguals == true) {
			System.out.println("Els dos arrays son exactament iguals");
		} else {
			System.out.println("Els dos arrays no son iguals");
		}
		
		
		
		
		teclat.close();
	}

}