import java.util.Scanner;

public class ClassePrincipal {
	//Act 19, 20 i 21
	public static final Scanner teclat = new Scanner(System.in);
	
	public static int dadesUser(String demanarNum) {
		int num;
		
		System.out.println(demanarNum);
		num = teclat.nextInt();
		
		return num;
	}
	
	public static int mcd (int a, int b) {
		int r;
		
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	public static int mcm (int a, int b) {
		int resultat;
		
		resultat = (a*b) / mcd(a,b);
		
		return resultat;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		num1 = dadesUser("Introdueix el primer valor");
		num2 = dadesUser("Introdueix el segon valor");
		
		System.out.println("El mcd de " + num1 + " i de " + num2 + " és: " + mcd(num1, num2));
		System.out.println("El mcd de " + num1 + " i de " + num2 + " és: " + mcm(num1, num2));
	}

}