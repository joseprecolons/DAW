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
	
	public static void omplirArray (int [] numeros) {
			
		for (int i = 1, j = 0; j < numeros.length; i = i + 2, j++) {
					numeros[j] = i;
				}
		}
	
	public static int sumaSenars (int [] arraySenars) {
		int resultatSenars = 0;
		for (int i = 1, j = 0; j < arraySenars.length; i = i + 2, j++) {
			resultatSenars = arraySenars[j] + resultatSenars; 
				}
		
		return resultatSenars;
		}
	
	public static int sumaSenarsPrimers (int [] arraySenars) {
		
		int resultatSenarsPrimers = 0;
		boolean primer;
		
		for (int i = 1, j = 0; j < arraySenars.length; i = i + 2, j++) {
			primer = true;
			if (arraySenars[j] < 2) {
				primer = false;
			} else {
				for (int k = 2; k < arraySenars[j]; k++) {
					if (arraySenars[j] % k == 0) {
						primer = false;	
						break;
					}
				}
			}
			if (primer == true) {
				resultatSenarsPrimers = arraySenars[j] + resultatSenarsPrimers;
			}
		}
		return resultatSenarsPrimers;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sumaNumerosSenars, sumaNumerosSenarsPrimers;
		String DemanarNum = ("Introdueix la quantitat de números que vols");
		num = DadesUser(DemanarNum);
		
		if (num % 2 != 0) {
			num = num + 1;
		}
		
		int[] numerosSenars = new int [num / 2];
		omplirArray(numerosSenars);
		
		sumaNumerosSenars = sumaSenars(numerosSenars);
		sumaNumerosSenarsPrimers = sumaSenarsPrimers(numerosSenars);
		
		
		System.out.println("La suma de tots els números senars es: " + sumaNumerosSenars);
		System.out.println();
		System.out.println("La suma de tots els números senars i primers es: " + sumaNumerosSenarsPrimers);
		
	}

}
