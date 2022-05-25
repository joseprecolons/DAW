import java.util.Scanner;
public class ClassePrincipal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclat = new Scanner (System.in);
		Scanner teclat2 = new Scanner (System.in);
		
		String cadena;
		String lletra;
		int num;
		int m = 3, n;
		
		System.out.println("Quans caràcters te el missatge que vols enviar");
		num = teclat2.nextInt();
		
		do {
			System.out.println("'x' per xifrar i 'd' per desxifrar");
			lletra = teclat.nextLine();
		} while (!lletra.equals("x") && !lletra.equals("d"));
		
		
		if (lletra.equals("x")) {
			System.out.println("Escriu el text");
			cadena = teclat.nextLine();
			
			n = num % 3;
			
			char matriu[][] = new char [m][n];
			
			for (int i = 0, k = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++, k++) {
					matriu[i][j] = cadena.charAt(k);
				}
			}
			
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					System.out.print(matriu[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Escriu el text");
			cadena = teclat.nextLine();
			
			n = num % 3;
			
			char matriu[][] = new char [m][n];
			
			for (int i = 0, k = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++, k++) {
					matriu[i][j] = cadena.charAt(k);
				}
			}
			
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu.length; j++) {
					System.out.print(matriu[i + j][j] + " ");
				}
			}
		}

	}
}