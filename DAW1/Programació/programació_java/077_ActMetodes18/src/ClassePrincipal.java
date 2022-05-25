import java.util.Scanner;

public class ClassePrincipal {
	
	public static final int MIDA = 3;
	
	public static int dadesUser(String demanarNum) {
		int num;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println(demanarNum);
		num = teclat.nextInt();
		
		teclat.close();
		return num;
	}
	
	public static int sumatori (int num) {
		int resultat = 0;
		
		for (int i = 1; i < num+1; i++) {
			resultat = resultat + i;
		}
		return resultat;
	}
	
	public static int factorial (int num) {
		int resultat = 1;
		
		for (int i = 1; i < num+1; i++) {
			resultat = resultat * i;
		}
		return resultat;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		num = dadesUser("Escriu el número del qual vols fer el sumatori");
		
		System.out.println("El sumatori de " + num + " és: " + sumatori(num));
		System.out.println("El factorial de " + num + " és: " + factorial(num));
		
	}

}