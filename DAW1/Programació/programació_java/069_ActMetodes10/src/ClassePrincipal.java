import java.util.Scanner;

public class ClassePrincipal {
	
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
	
	public static void omplirArray (int [] numeros) {
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int) (Math.random()*101);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numElements;
		String DemanarNum = ("Introdueix la quantitat de números que vols");
		numElements = DadesUser(DemanarNum);
		
		int cadenaNumeros[] = new int [numElements];
		omplirArray(cadenaNumeros);
		
		for (int i = 0, k; i < cadenaNumeros.length; i++) {
			k = 0;
			System.out.print("Numeros primers i divisors de " + cadenaNumeros[i] + ": ");
			System.out.println();
			for (int j = 2; j < cadenaNumeros[i]; j++) {
				if (DivisorONo(cadenaNumeros[i], j) && NumPrimerONo(j)) {
					System.out.print(j + " ");
					k++;
				}
			}
			System.out.println();
			System.out.println("Quantitat de numeros primers divisors de " + cadenaNumeros[i] + " : " + k);
			System.out.println();
		}
		
	}
	
}