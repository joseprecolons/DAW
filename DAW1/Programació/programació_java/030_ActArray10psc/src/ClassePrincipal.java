import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = new int[10];
		
		Scanner teclatnum = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introdueix un n�mero");
		numeros[i] = teclatnum.nextInt();
		}
		
		
		for (int n = 0; n < numeros.length; n++) {
		System.out.println("El valor a la posici� " + n + " es " + numeros[n]);
		}
	
		teclatnum.close();
	}
	
}