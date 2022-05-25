import java.util.Scanner;

public class ClassePrincipal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, contador = 0;
		String DemanarNum = ("Introdueix el n�mero d'elements");
		num = DadesUser(DemanarNum);
		
		System.out.print("Numeros primers i divisors de " + num + ": ");
		
		for (int i = 2; i < num; i++) {
			if (DivisorONo(num, i) && NumPrimerONo(i)) {
				System.out.print(i + " ");
				contador++;
			}
		}
		System.out.println();
		System.out.println("Quantitat de numeros primers divisors de " + num + " : " + contador);
		
	}
	
	public static int DadesUser(String DemanarNum) {
		String Missatge = DemanarNum;
		int num;
		Scanner teclat = new Scanner(System.in);
		System.out.println(Missatge);
		num = teclat.nextInt();
		return num;
	}
	
	public static boolean DivisorONo(int num, int posibledivisor) {
		boolean divisor = false;
		
		if (num % posibledivisor == 0) {
			divisor = true;
		}
		
		return divisor;
	}
	
	public static boolean NumPrimerONo(int num) {
		boolean primer = true;
		if (num < 2) {
			primer = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					primer = false;	
					break;
				}
			}
		}
		return primer;
	}
}