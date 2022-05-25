import java.util.Scanner;
public class ClassePrincipal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclat = new Scanner (System.in);
		
		int m, n;
		
		System.out.println("Introdueix les files que vols que tingui la matriu");
		m = teclat.nextInt();
		System.out.println("Introdueix les columnes que vols que tingui la matriu");
		n = teclat.nextInt();
		
		int matriu1[][] = new int[m][n];
		int matriu2[][] = new int [m][3];
		 
		
		for (int i = 0; i < matriu1.length; i++) {
			for (int j = 0; j < matriu1[i].length; j++) {
				System.out.println("Introdueix el valor de la fila " + i + " i de la columna " + j);
				matriu1[i][j] = teclat.nextInt();
			}
		}
		
		for (int i = 0; i < matriu1.length; i++) {
			for (int j = 0; j < matriu1[i].length; j++) {
				if (matriu1[i][j] < 0) {
					matriu2[i][0] = matriu2[i][0] + 1;
				} else if (matriu1[i][j] > 0) {
					matriu2[i][1] = matriu2[i][1] + 1;
				} else {
					matriu2[i][2] = matriu2[i][2] + 1;
				}
			}
		}
		
		for (int i = 0; i < matriu2.length; i++) {
			for (int j = 0; j < matriu2[i].length; j++) {
				System.out.print(matriu2[i][j] + " ");
			}
			System.out.println();
		}

	}
}
