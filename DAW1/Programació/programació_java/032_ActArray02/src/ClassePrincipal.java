import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int error = 0;
		Scanner teclatnum = new Scanner(System.in);
		System.out.println("Introdueix quans arrays");
		num = teclatnum.nextInt();
		int numeros[] = new int[num];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introdueix el valor de l'array " + i);
			numeros[i] = teclatnum.nextInt();
			if (i != 0 && numeros[i] > numeros[i-1]) {
				System.out.println("Error");
				error++;
				i--;
			}
		}
		
		for (int n = 0; n < numeros.length; n++) {
			System.out.println("En la posició " + n + " hi ha el numero " + numeros[n]);
		}
		
		System.out.println("Hi ha " + error + " errors");
	
		teclatnum.close();
	}
	
}
