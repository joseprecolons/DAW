import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclat = new Scanner (System.in);
		int m, n;
		int valormesgran = 0;
		System.out.println("Introdueix les files que vols que tingui la matriu");
		m = teclat.nextInt();
		System.out.println("Introdueix les columnes que vols que tingui la matriu");
		n = teclat.nextInt();
		
		int numeros[][] = new int[m][n];
		 
		 
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[m].length; j++) {
				System.out.println("Introdueix el valor de la fila " + j + " i de la columna " + i);
				numeros[i][j] = teclat.nextInt();
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[m].length; j++) {
				if (valormesgran < numeros[i][j]) {
					valormesgran = numeros[i][j];
				}
			}
		}
		
		System.out.println("El valor més gran de la matrius es " + valormesgran);
		
		 teclat.close();
	}

}