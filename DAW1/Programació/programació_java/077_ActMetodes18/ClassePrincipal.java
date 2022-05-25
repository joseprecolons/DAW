import java.util.Scanner;

public class ClassePrincipal {
	
	static final int MIDA = 3;
	
	public static int dadesUser(String demanarNum) {
		int num;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println(demanarNum);
		num = teclat.nextInt();
		
		return num;
	}
	
	public static void buscarNum (int [][] array, int [] posicio) {
		int aux = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (aux < array[i][j]) {
					aux = array[i][j];
					posicio[0] = i;
					posicio[1] = j;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]llistaNums = new int [MIDA][MIDA];
		int []posicio = new int [2];
		
		for (int i = 0; i < llistaNums.length; i++) {
			for (int j = 0; j < llistaNums[i].length; j++) {
				llistaNums[i][j] = dadesUser("Escriu el número que vols a la posició " + i + " de la fila " + j);
			}
		}
		
		buscarNum(llistaNums, posicio);

		System.out.println("El número més gran es troba a la posició " + posicio[0] + " de la fila " + posicio[1]);
		
	}

}