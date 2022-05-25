import java.util.Scanner;

public class ClassePrincipal {
	
	public static int suma(int num1, int num2) {
		int resultat;
		resultat = num1 + num2;
		return resultat;
	}
	
	public static int resta(int num1, int num2) {
		int resultat;
		resultat = num1 - num2;
		return resultat;
	}
	
	public static int multiplicacio(int num1, int num2) {
		int resultat;
		resultat = num1 * num2;
		return resultat;
	}
	
	public static float divisio(int num1, int num2) {
		float resultat;
		resultat = num1 / num2;
		return resultat;
	}
	
	public static int residu(int num1, int num2) {
		int resultat;
		resultat = num1 % num2;
		return resultat;
	}
	
	public static int elevat(int num1, int num2) {
		int resultat = 0;
		resultat = num1;
		for (int i = 1; i < num2; i++) {
			resultat = resultat * num1;
		}
		return resultat;
	}
	
	public static void operacio(int num1, int num2, char signe) {
		switch (signe) {
		case '+':
			System.out.println(suma(num1, num2));
			break;
			
		case '-':
			System.out.println(resta(num1, num2));
			break;
			
		case '*':
			System.out.println(multiplicacio(num1, num2));
			break;
			
		case '/':
			if (num2 == 0) {
				System.out.println("No es pot dividir entre 0");
				break;
			} else {
				System.out.println(divisio(num1, num2));
				break;
			}
			
		case '%':
			System.out.println(residu(num1, num2));
			break;
			
		case '^':
			System.out.println(elevat(num1, num2));
			break;
			
		default:
			System.out.println("Error!! Has d'introduir el signe amb el que vols operar");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		char signe;
		boolean sortir = false;
		String acabar = "";
		Scanner teclatsigne = new Scanner(System.in);
		Scanner teclat = new Scanner(System.in);
		Scanner teclatsortir = new Scanner(System.in);
		
		do {
			System.out.println("Introdueix el primer número");
			n1 = teclat.nextInt();
			
			System.out.println("Introdueix el segon número");
			n2 = teclat.nextInt();
			
			System.out.println("Introdueix el signe del tipus de operació vols fer");
			signe = teclatsigne.next().charAt(0);
			
			operacio(n1, n2, signe);
			
			System.out.println("Vols continuar? Si | No");
			acabar = teclatsortir.nextLine();
			
			if (acabar == "Si") {
				sortir = true;
			}
			
		} while (sortir == false);
		
		
		teclat.close();
		teclatsigne.close();	
		teclatsortir.close();
	}
	

}