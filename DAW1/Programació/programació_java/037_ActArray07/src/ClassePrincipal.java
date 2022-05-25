import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclat = new Scanner(System.in);
		int numcadenes;
		numcadenes = 5;
		String cadena[] = new String[numcadenes];
		int comptadorV[] = new int[5];
		int comptador = 0;
		
		for (int i = 0; i < numcadenes; i++) {
		System.out.println("Introdueix una cadena de text");
		cadena[i] = teclat.nextLine();
		}
		
		for (int j = 0; j < numcadenes; j++) {
		
			for (int s = 0; s < 5; s++) {
				comptadorV[s] = 0;
			}
			
			for (int l = 0; l < cadena[j].length(); l++) {
				if (cadena[j].toLowerCase().charAt(l) == 'a') {
					comptadorV[0]++;
				} else if (cadena[j].toLowerCase().charAt(l) =='e') {
					comptadorV[1]++;
				} else if (cadena[j].toLowerCase().charAt(l) == 'i') {
					comptadorV[2]++;
				} else if (cadena[j].toLowerCase().charAt(l) == 'o') {
					comptadorV[3]++;
				} else if (cadena[j].toLowerCase().charAt(l) == 'u') {
					comptadorV[4]++;
				}
				
			}
			
			comptador = 0;
			
			while (comptador < 5 && comptadorV[comptador] > 0) {
				comptador++;
			}
			
			if (comptador == 5) {
				System.out.println("La paraula " + cadena[j] + " utilitza totes les vocals");
			} else {
				System.out.println("La paraula " + cadena[j] + " no utilitza totes les vocals");
			}
			
		teclat.close();
		
		}
			
	}
}