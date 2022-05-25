import java.util.Scanner;

public class ClassePrincipal {
	
	static final int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
	
	public static final Scanner teclat = new Scanner(System.in);
	
	public static String dadesUser(String demanarNum) {
		String numRoma;
		
		System.out.println(demanarNum);
		numRoma = teclat.nextLine();
		
		return numRoma;
	}
	
	public static int romaToDecimal (String num) {
		int resultat = 0;
		
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == 'I' && i < num.length()-1 && (num.charAt(i+1) == 'V' || num.charAt(i+1) == 'X')) {
				resultat = resultat - I;
			} else if (num.charAt(i) == 'I') {
				resultat = resultat + I;
			} else if (num.charAt(i) == 'V') {
				resultat = resultat + V;
			} else if (num.charAt(i) == 'X' && i < num.length()-1 && (num.charAt(i+1) == 'L' || num.charAt(i+1) == 'C')) {
				resultat = resultat - X;
			} else if (num.charAt(i) == 'X') {
				resultat = resultat + X;
			} else if (num.charAt(i) == 'L') {
				resultat = resultat + L;
			} else if (num.charAt(i) == 'C' && i < num.length()-1 && (num.charAt(i+1) == 'D' || num.charAt(i+1) == 'M')) {
				resultat = resultat - C;
			} else if (num.charAt(i) == 'C') {
				resultat = resultat + C;
			} else if (num.charAt(i) == 'D') {
				resultat = resultat + D;
			} else if (num.charAt(i) == 'M') {
				resultat = resultat + M;
			}
		}
		
		
		return resultat;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numRoma;
		numRoma = dadesUser("Introdueix el número romà que vols convertir");
		
		System.out.println("El número en romà " + numRoma + " convertir és " + romaToDecimal(numRoma));
		
		
	}

}