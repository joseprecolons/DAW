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
			
		for (int i = 2, j = 0; j < numeros.length; i = i + 2, j++) {
					numeros[j] = i;
				}
		}
	
	public static int sumaSenars (int [] arrayParells) {
		int resultatParells = 0;
		for (int i = 2, j = 0; j < arrayParells.length; i = i + 2, j++) {
			resultatParells = arrayParells[j] + resultatParells; 
				}
		
		return resultatParells;
		}
	
	public static int sumaSenarsPrimers (int [] arrayParells) {
		
		int resultatSenarsParells = 0;
		boolean primer;
		
		for (int i = 2, j = 0; j < arrayParells.length; i = i + 2, j++) {
			primer = true;
			if (arrayParells[j] < 2) {
				primer = false;
			} else {
				for (int k = 2; k < arrayParells[j]; k++) {
					if (arrayParells[j] % k == 0) {
						primer = false;	
						break;
					}
				}
			}
			if (primer == true) {
				resultatSenarsParells = arrayParells[j] + resultatSenarsParells;
			}
		}
		return resultatSenarsParells;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sumaNumerosParells, sumaNumerosParellsPrimers;
		String DemanarNum = ("Introdueix la quantitat de números que vols");
		num = DadesUser(DemanarNum);
		
		if (num % 2 != 0) {
			num = num - 1;
		}
		
		int[] numerosParells = new int [num / 2];
		omplirArray(numerosParells);
		
		sumaNumerosParells = sumaSenars(numerosParells);
		sumaNumerosParellsPrimers = sumaSenarsPrimers(numerosParells);
		
		
		System.out.println("La suma de tots els números parells es: " + sumaNumerosParells);
		System.out.println();
		System.out.println("La suma de tots els números parells i primers es: " + sumaNumerosParellsPrimers);
		
	}

}