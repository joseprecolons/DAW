import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[] = new int[10];
		int num;
		Scanner teclatnum = new Scanner(System.in);
		System.out.println("Introdueix la base");
		num = teclatnum.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = num;
			for (int j = 0; j != i; j++) {
			numeros[i] = numeros[i] * num;
			}
			
		System.out.println("El resultat és: " + numeros[i]);
		
		}
			
	}

}
