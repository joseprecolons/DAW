import java.util.Scanner;

public class ClassePrincipal {
	
	public static int numIntents(String demanarDades) {
		int num;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println(demanarDades);
		num = teclat.nextInt();

		return num;
	}
	
	public static String dadesUser(String demanarDades) {
		String cadena;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println(demanarDades);
		cadena = teclat.nextLine();

		return cadena;
	}
	
	public static int comptarEspais(String cadena) {
		int num = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				num++;
			}
		}

		return num - 1;
	}
	
	public static void inicialitzarArray(String[] cadena) {
		
		for (int i = 0; i < cadena.length; i++) {
			cadena[i] = "";
		}
	}
	
	public static void pasarCadena(String cadena, String[] cadenaSi, String[] cadenaNo) {
		
		for (int i = 4, j = 0; j < cadenaSi.length; i++) {
			if (cadena.charAt(0) == 'S') {
				if (cadena.charAt(i) == ' ') {
					j++;
				} else {
					cadenaSi[j] = cadenaSi[j] + cadena.charAt(i);
				}
				
			} else {
				if (cadena.charAt(i) == ' ') {
					j++;
				} else {
					cadenaNo[j] = cadenaNo[j] + cadena.charAt(i);
				}
			}
			
		}
		
	}
	
	public static void cadenaToAux(String[] array, String[] aux) {
		boolean repetir;
		
		for (int i = 0; i < array.length; i++) {
			repetir = false;
			for (int j = 0; j < aux.length; j++) {
				if (array[i] == aux[j]) {
					repetir = true;
				}
			}
			int num = 0;
			
			for (int k = 0; k < aux.length; k++) {
				if (aux[k] == "") {
					break;
				} else {
					num++;
				}
			}
			
			if (repetir == false) {
				aux[num] = array[i];
			}
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numProves = numIntents("Introdueix el número de probes que vols realitzar");
		String[] arrayAuxSi = new String [10]; 
		String[] arrayAuxNo = new String [10];
		inicialitzarArray(arrayAuxSi);
		inicialitzarArray(arrayAuxNo);
		boolean agradar = false;
		
		for (int i = 0; i < numProves; i++) {
			String prova = dadesUser("Introdueix les dades d'aquesta proba");
			String[] cadenaSi = new String [comptarEspais(prova)];
			String[] cadenaNo = new String [comptarEspais(prova)];
			inicialitzarArray(cadenaSi);
			inicialitzarArray(cadenaNo);
			pasarCadena(prova, cadenaSi, cadenaNo);
			cadenaToAux(cadenaSi, arrayAuxSi);
			cadenaToAux(cadenaNo, arrayAuxNo);
			}
		
		System.out.println("Ingredients de la cadena Si");
		
		for (int i = 0; i < arrayAuxSi.length; i++) {
			System.out.print(arrayAuxSi[i] + " ");
		}
		System.out.println();
		System.out.println("Ingredients de la cadena No");
		for (int i = 0; i < arrayAuxSi.length; i++) {
			System.out.print(arrayAuxNo[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < arrayAuxSi.length; i++) {
			for (int j = 0; j < arrayAuxSi.length; j++) {
				if (arrayAuxSi[i] == arrayAuxNo[j]) {
					agradar = true;
				}
			}
			if (agradar == false) {
				System.out.print(arrayAuxNo[i] + " ");
			}
		
		}
		
		
		
		
	}

}
