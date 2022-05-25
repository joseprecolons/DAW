import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// Els dos enunciats son el C
		
		char arrLletres[] = new char[52];
		String lletra;
		Scanner teclatnum = new Scanner (System.in);
		Scanner teclatlletra = new Scanner (System.in);
		String cadena = "";
		
		for (int i = 65, j = 0; j < arrLletres.length; i++, j++) { //Asignem els valors a l'array
			if (i == 91) {
				i = 97;
			}
			arrLletres[j] = (char) i;
		}
	
	
		for (int i = 0; i != -1;) {
			do {
				System.out.println("Entra l'índex del caràcter que vols escriure (A: 1, X:26, -1 per acabar) "); // Preguntem quin caracter vol escriure
				i = teclatnum.nextInt();
				
				if (i > 26) {
					System.out.println("Error! El valor ha d'estar entre 1 i 26 o -1 per acabar."); //Repetim la pregunta fins que introdueix un número inferior a 26
				}
				
			} while (i > 26);
			
			if (i == -1) { // Si el número introduit es -1, acabem el for directament
				break;
			}
			System.out.println("Vols que el caràcter sigui majúscules (M) o minúscules (m) "); // Preguntem si vol que la lletra sigui majúscula o minúscula
			lletra = teclatlletra.nextLine();
			
			if (lletra.equals("M")) { // Si escriu una M, es majúscula
					cadena = cadena + (char) arrLletres[i - 1];
					System.out.println("S'afegirà una '" + (char) arrLletres[i - 1] + "' a la cadena."); //Treiem per pantalla el caràcter que ha demanat
				
			} else if (lletra.equals("m")) { //Si escriu una m es minúscula
				i = i + 26;
				cadena = cadena + (char) arrLletres[i - 1];
				System.out.println("S'afegirà una '" + (char) arrLletres[i - 1] + "' a la cadena."); //Treiem per pantalla el caràcter que ha demanat
			}
			
		}
		
		System.out.println("La cadena final és: " + cadena); //Al acabar el for, treiem per pantalla la cadena de text que ha fet l'usuari
		
		
	}

}
