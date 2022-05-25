import java.util.Scanner;

public class ClassePrincipal {

	public static Scanner teclat = new Scanner(System.in);
	public static Scanner teclat2 = new Scanner(System.in);
	/*
	 * 0.5 p. mostrarMissatgePerPantalla(String cadena) retorna res 0.5 p.
	 * llegirEnterTeclat() retorna int 0.5 p. llegirCaracterTeclat() retorna char
	 * 1.0 p. llegirCadenaDeLletresTeclat() retorna String
	 * 
	 * 0.5 p. comprovaEsEnter(Char valorLlegit) retorna boolean
	 * 
	 * 1.5 p. comprovaEsLletra(Char valorLlegit) retorna boolean
	 * 
	 * 2.0 p. mostrarMissatgePerPantallaSegonsSaltLinea(String cadena) retorna res
	 * 
	 * 6.0 p. TOTAL
	 * 
	 * (4 punts)
	 * 
	 * Dins del main, desenvolupa el codi necessari per:
	 * 
	 * Crear una matriu, les dimensions de la qual, li demanaràs a l'usuari, També
	 * li demanaràs a l'usuari si vol omplir la matriu amb majúscules, minúscules
	 * o unitats (és a dir, enters d'un sol dígit, valors entre 0 i 9 ambdós
	 * inclosos). I en funció del que escolli l'usuari, i fent servir la funció
	 * aleatoriEntreDosNombres(minim,maxim) omple la matriu. Recorda que pots fer
	 * servir el codi de la taula ASCII per obtenir lletres majúscules, lletres
	 * minúscules o nombres enters.
	 * 
	 * Al final de l'execució d'aquest codi, li demanaràs a l'usuari si vol tornar
	 * a començar, i si respon que si, repetiràs tot el procés, i si respon que
	 * no, faràs aparèixer un missatge de comiat i s'acabarà l'execució del
	 * programa.
	 * 
	 * Fes servir totes les funcions que puguis.
	 * 
	 */

	public static void mostrarMissatgePerPantalla(String cadena) {
		System.out.print(cadena);
	}

	public static int llegirEnterTeclat(String cadena) {
		int enterLlegit = 0;
		System.out.println(cadena);
		enterLlegit = teclat.nextInt();
		return enterLlegit;
	}

	public static char llegirCaracterTeclat() {
		String lletra;
		char caracterLlegit = ' ';
		lletra = teclat2.nextLine();
		caracterLlegit = lletra.charAt(0);
		return caracterLlegit;
  }

	public static String llegirCadenaDeLletresTeclat() {
		String cadenaLlegida = "";
		char caracterLlegit = ' ';
		boolean esLletra = false;
		do {
			// caracterLlegit = quina funció pots fer servir feta anteriorment? (0.5 punts)
			// esLletra = quina funció pots fer servir feta anteriorment? (0.5 punts)
			
			caracterLlegit = llegirCaracterTeclat();
			esLletra = comprovaEsLletra(caracterLlegit);
			
			if (caracterLlegit != '#' && esLletra == true) {
				cadenaLlegida = cadenaLlegida + caracterLlegit;
			} else {
				if (caracterLlegit != '#') {
					System.out.println("No és lletra, torna-hi!");
				}
			}
		} while (caracterLlegit != '#');

		return cadenaLlegida;
	}

	public static boolean comprovaEsLletra(char caracterRebut) {
		boolean esLletra = false;
		int codiASCII;
		codiASCII = (int) caracterRebut;
		/*
		 * caracter = 0 => ASCII = 48 caracter = 9 => ASCII = 57 caracter = A => ASCII =
		 * 65 caracter = Z => ASCII = 90 caracter = a => ASCII = 97 caracter = z =>
		 * ASCII = 122
		 */

		/*
		 * A les posicions (1), (2) i (3) (1.5 punts = 3 * 0.5 punts) hi van els
		 * operadors: && o || has de dir quin va a cada posició.
		 */
		if ((codiASCII >= 65 && codiASCII <= 90) || (codiASCII >= 97 && codiASCII <= 122)) {
			esLletra = true;
		}
		return esLletra;
	}

	public static boolean comprovaEsEnter(char caracterRebut) {
		boolean esEnter = false;
		int codiASCII;
		codiASCII = (int) caracterRebut;
		// caracter = 0 => ASCII = 48
		// caracter = 9 => ASCII = 57
		if (codiASCII >= 48 && codiASCII <= 57) {
			// Escriu aqui la linea de codi (0.5 punts)
			esEnter = true;
		}
		return esEnter;
	}

	public static void mostrarMissatgePerPantallaSegonsSaltLinea(String cadena, boolean ambSalt) {
		// Escriu aqui les teves linees de codi ( 2 punts )
		
		if (ambSalt) {
			System.out.println(cadena);
		} else {
			System.out.print(cadena);
		}
	}

	public static char aleatoriEntreDosNombres(char lletra) {
		int nombreAleatori = 0;
		char caracter;
		if (lletra == 'N') {
			nombreAleatori = (int) (Math.random() * (57 + 1 - 48) + 48);
		} else if (lletra == 'A') {
			nombreAleatori = (int) (Math.random() * (90 + 1 - 65) + 65);
		} else if (lletra == 'I') {
			nombreAleatori = (int) (Math.random() * (122 + 1 - 97) + 97);
		}
		
		caracter = (char) nombreAleatori;
		return caracter;
	}
	
	public static void omplirMatriu(char[][] matriu, char lletra) {
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				matriu[i][j] = aleatoriEntreDosNombres(lletra);
			}
		}
	}
	
	public static char deQueOmplirMatriu(String cadena, boolean ambSalt) {
		char lletra;
		mostrarMissatgePerPantallaSegonsSaltLinea(cadena, ambSalt);
		lletra = llegirCaracterTeclat();
		return lletra;
	}
	
	public static void mostrarMatriu(char[][] matriu) {
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(" " + matriu[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean sortir() {
		boolean sortir = false;
		char lletra;
		do {
			mostrarMissatgePerPantalla("Vols sortir? S/N");
			lletra = llegirCaracterTeclat();
			if (lletra == 'S') {
				sortir = true;
			}
		} while (lletra != 'S' && lletra != 'N');
		
		return sortir;
	}

	public static void main(String[] args) {
		String missatgeAMostrar;
		String cadenaLlegida;
		boolean senseSaltDeLinia = false;

		missatgeAMostrar = "Entra una cadena de" + " caracters, pero entrant els" + " caracters d'un amb un,\n si"
				+ " entres dos, o més, només" + " es llegirè el primer!\n";

		mostrarMissatgePerPantalla(missatgeAMostrar);
		mostrarMissatgePerPantallaSegonsSaltLinea(missatgeAMostrar, senseSaltDeLinia);

		cadenaLlegida = llegirCadenaDeLletresTeclat();

		mostrarMissatgePerPantalla("La cadena llegida és " + cadenaLlegida);
		boolean sortir = false;
				
		do {
			senseSaltDeLinia = true;
			missatgeAMostrar = "Escriu les dimensions de la matriu";
			mostrarMissatgePerPantallaSegonsSaltLinea(missatgeAMostrar, senseSaltDeLinia);
			char matriuNumeros[][] = new char [llegirEnterTeclat("Introdueix les files que vols")][llegirEnterTeclat("Introdueix les columnes que vols")];
			missatgeAMostrar = "De que vols omplir la matriu? Maj�scules = A, min�scules = I o n�meros enters = N";
			char omplirAmb = deQueOmplirMatriu(missatgeAMostrar, senseSaltDeLinia);
			omplirMatriu(matriuNumeros, omplirAmb);
			mostrarMatriu(matriuNumeros);
			sortir = sortir();
			if (sortir) {
				System.out.println("Adeu!!");
			}
		} while (sortir == false);
		
		
		
	}

}