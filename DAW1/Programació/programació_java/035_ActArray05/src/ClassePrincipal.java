import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclat = new Scanner(System.in);
		int numcadenes;
		numcadenes = 5;
		String cadena[] = new String[numcadenes];
		int numchar[] = new int[numcadenes];
		
		for (int i = 0; i < numcadenes; i++) {
		System.out.println("Introdueix una cadena de text");
		cadena[i] = teclat.nextLine();
		}
		
		for (int j = 0; j < numcadenes; j++) {
			numchar[j] = cadena[j].length();
			System.out.println("A la posició " + j + " hi ha " + numchar[j] + " caracters");
		}
		
		teclat.close();
		
	}
			
}