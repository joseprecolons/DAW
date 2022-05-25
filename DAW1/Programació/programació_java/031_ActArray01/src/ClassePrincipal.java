import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner teclatnum = new Scanner(System.in);
		System.out.println("Introdueix un número");
		num = teclatnum.nextInt();
		int numeros[] = new int[num];
		
		for (int i = 0, j = num; i < numeros.length; i++, j--) {
			numeros[i] = j;
		}
		
		for (int n = 0; n < numeros.length; n++) {
			System.out.println("En la posició " + n + " hi ha el numero " + numeros[n]);
		}
	
		teclatnum.close();
	}
	
}