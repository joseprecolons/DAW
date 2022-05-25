import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2;
		int comptador;
		Scanner teclatnum = new Scanner (System.in);
		System.out.println("Introdueix la base");
		n1 = teclatnum.nextInt();
		System.out.println("Introdueix l'exponent");
		n2 = teclatnum.nextInt();
		
		for (int i = 1; i != n2; i++) {
			n1 = n1 + n1;
		}
		System.out.println("El resultat és: " + n1);
		
		teclatnum.close();
	}

}