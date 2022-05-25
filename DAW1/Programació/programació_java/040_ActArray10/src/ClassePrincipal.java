import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int numelements = 3;
		int num, comptador = 0;
		int numeros[] = new int[numelements];
		
		for (int i = 0; i < numelements; i++) {
			System.out.println("Introdueix el valor de la posició " + i);
			numeros[i] = teclat.nextInt();
		}
		
		System.out.println("Introdueix el número");
		num = teclat.nextInt();
		
		for (int j = 0; j < numelements; j++) {
			if (numeros[j]%num == 0) {
				comptador++;
				System.out.println("El valor de la posició " + j + " que es " + numeros[j] + " es multiple de " + num);
			}
		}
		
		System.out.println("Hi han " + comptador + " multiples de " + num);
		
		teclat.close();
	}

}