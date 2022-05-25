import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclat = new Scanner(System.in);
		int numcadenes;
		numcadenes = 5;
		String cadena[] = new String[numcadenes];
		int numwords[] = new int[numcadenes];
		int comptadorespais = 0;
		
		
		for (int i = 0; i < numcadenes; i++) {
		System.out.println("Introdueix una cadena de text");
		cadena[i] = teclat.nextLine();
		}
		
		for (int j = 0; j < numcadenes; j++) {
			numwords[j] = cadena[j].length();
			
			for (int l = 0; l < cadena[j].length(); l++) {
				if (cadena[j].charAt(l) == ' ') {
					comptadorespais++;
				}
			}
			
			System.out.println("Hi ha " + (comptadorespais+1) + " paraules" );
		}
		
		
		teclat.close();
		
	}
			
}