import java.util.Scanner;

public class ClassePrincipal {
	
	static final int MIDA = 5;
	
	public static int dadesUser(String demanarNum) {
		int num;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println(demanarNum);
		num = teclat.nextInt();
		
		return num;
	}
	
	public static int buscarNum (int num, int [] array) {
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				break;
			} else {
				contador++;
			}
		}
		
		if (contador == array.length) {
			contador = -1;
		}
		
		return contador;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, posicio;
		int []llistaNums = new int [MIDA];
		
		num = dadesUser("Escriu el número que vols buscar a l'array");
		
		for (int i = 0; i < llistaNums.length; i++) {
			llistaNums[i] = dadesUser("Escriu el número que vols a la posició " + i + "de l'array");
		}

		posicio = buscarNum(num, llistaNums);
		
		
		if (posicio == -1) {
			System.out.println("No existeix tal número a l'array, per tant: " + posicio);
		} else {
			System.out.println("El número " + num + " es troba a la posició " + posicio);
		}
		
	}

}