import java.util.Scanner;
import java.util.Arrays;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int numcadenes;
		numcadenes = 6;
		String cadena[] = new String[numcadenes];
		
		for (int i = 0; i < numcadenes; i++) {
			System.out.println("Introdueix una cadena de text");
			cadena[i] = teclat.nextLine();
			}
		
		Arrays.sort(cadena);
		
		for (int l = 0; l < numcadenes; l++) {
			System.out.println(cadena[l]);
			}
		
		teclat.close();
	}

}
