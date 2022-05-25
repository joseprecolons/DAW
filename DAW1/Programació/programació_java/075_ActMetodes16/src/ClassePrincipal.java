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
	
	public static int buscarNum (int [] array) {
		int contador = -1;
		int aux = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (aux < array[i]) {
				aux = array[i];
				contador = i;
			}
		}
		
		return contador;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []llistaNums = new int [MIDA];
		
		for (int i = 0; i < llistaNums.length; i++) {
			llistaNums[i] = dadesUser("Escriu el número que vols a la posició " + i + "de l'array");
		}

		System.out.println("El número més gran es troba a la posició " + buscarNum(llistaNums));
		
	}

}