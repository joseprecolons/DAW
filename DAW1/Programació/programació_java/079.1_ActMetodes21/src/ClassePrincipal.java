import java.util.Scanner;

public class ClassePrincipal {

	public static final Scanner teclat = new Scanner(System.in);
	
	public static String dadesUser(String demanarNum) {
		String paraula;

		System.out.println(demanarNum);
		paraula = teclat.nextLine();

		return paraula;
	}
	
	public static void lletresAArray(String lletres, char[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = lletres.charAt(i);
		}
	}
	
	public static boolean buscarParaula(String paraula, char[] arrayLletres) {
		boolean trobada = false;
		
		for (int i = 0, j = 0; i < arrayLletres.length; i++) {
			if (arrayLletres[i] == paraula.charAt(j) ) {
				j++;
			} else {
				j = 0;
			}
			
			if (j == paraula.length()-1) {
				trobada = true;
			}
		}
		
		return trobada;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paraula = dadesUser("La paraula que vols");
		String lletres = dadesUser("Introdueix totes les lletres que vulguis a la cadena de text");
		char[] arrayParaula = new char [lletres.length()]; 
		lletresAArray(lletres, arrayParaula);
		if (buscarParaula(paraula, arrayParaula)) {
			System.out.println("La paraula s'ha trobat");
		}
		
		
	}
}