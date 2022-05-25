import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class EnfonsarLaFlota {
	static final Scanner teclatText = new Scanner(System.in);
	static final Scanner teclat = new Scanner(System.in);
	
	public static String teclatText(String text) {
		String cadena;
		
		System.out.println(text);
		cadena = teclat.next();
		
		return cadena;
	}
	
	public static void omplirMatriu(char[][] matriu) {
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				matriu[i][j] = 'a';
			}
		}
	}
	
	public static void introduirVaixells(char[][] matriu, String cadenaText) {
		int pos1, pos2;
		System.out.println(cadenaText);
		String cadenaPosicions = "";
		boolean incorrecte;
		for (int i = 0; i < 5; i++) {
			try {
				incorrecte = true;
				do {
					cadenaPosicions = teclatText("Introdueix la fila i la columna a la que vols posar-hi el vaixell (XY) de 0 a 7");
				incorrecte = false;
				} while (!incorrecte);
			} catch (Exception e) {
				System.out.println("Error al introduir la fila i la columna" + e.getMessage());
			}
			
				pos1 = cadenaPosicions.charAt(0)-48;
				pos2 = cadenaPosicions.charAt(1)-48;
				if (matriu[pos1][pos2] == 'v') {
					System.out.println("No pots introduir un vaixell en aquesta posició, perquè ja n'hi tens 1");
					i--;
				} else {
					matriu[pos1][pos2] = 'v';
				}
		}
	}
	
	public static int comprovarVaixells(char[][] matriu, String cadenaText) {
		int contador = 0;
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (matriu[i][j] == 'v') {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public static boolean enfonsarVaixells(char[][] matriu, String cadenaText) {
		System.out.println(cadenaText);
		boolean seguir = true;
		boolean incorrecte;
		int pos1, pos2;
		String cadenaPosicions = "";
		try {
			incorrecte = true;
			do {
			cadenaPosicions = teclatText("Introdueix la fila i la columna de la posició on vols tirar (0 a 7)"
					+ "\n O escriu save en cas de que vulguis sortir i guardar la partida");
			incorrecte = false;
			} while (!incorrecte);
		} catch (Exception e) {
			System.out.println("Error al introduir la fila i la columna" + e.getMessage());
		}
			if (cadenaPosicions.equals("save")) {
				seguir = false;
				return seguir;
			} else {
				pos1 = cadenaPosicions.charAt(0)-48;
				pos2 = cadenaPosicions.charAt(1)-48;
				if (matriu[pos1][pos2] == 'v') {
					System.out.println("-- Tocat");
					if (comprovarVaixellEnfonsat(matriu, pos1, pos2)) {
						System.out.println("Vaixel enfonsat!!!!");
					}
				} else {
					System.out.println("-- Aigua");
				}
				matriu[pos1][pos2] = 'a';
				
				return seguir;
			}
	}
	
	public static boolean comprovarVaixellEnfonsat(char[][] matriu, int pos1, int pos2) {
		boolean enfonsat = true;
 		
			try {
				if (matriu[pos1+1][pos2] == 'v') {
					enfonsat = false;
					return enfonsat;
				}
			} catch (Exception e) {
				enfonsat = true;
			}
			
			try {
				if (matriu[pos1][pos2+1] == 'v') {
					enfonsat = false;
					return enfonsat;
				}
			} catch (Exception e) {
				enfonsat = true;
			}
			
			try {
				if (matriu[pos1-1][pos2] == 'v') {
					enfonsat = false;
					return enfonsat;
				}
			} catch (Exception e) {
				enfonsat = true;
			}
			
			try {
				if (matriu[pos1][pos2-1] == 'v') {
					enfonsat = false;
					return enfonsat;
				}
			} catch (Exception e) {
				enfonsat = true;
			}
		
		return enfonsat;
	}
	
	public static void guardarPartida(char[][] flota1, char[][] flota2) {
		String nomFitxer = "lib/partidaGuardada.txt";
		try {
			FileWriter fitxer = new FileWriter(nomFitxer, false);
			for (int i = 0; i < (flota1.length); i++) {
				for (int j = 0; j < flota1[i].length; j++) {
						fitxer.write(flota1[i][j] + "");
					if ((j) != flota1.length-1) {
						fitxer.write(";");
					}
				}
				fitxer.write("\n");
			}
			for (int i = 0; i < (flota2.length); i++) {
				for (int j = 0; j < flota2[i].length; j++) {
						fitxer.write(flota2[i][j] + "");
					if ((j) != flota2.length-1) {
						fitxer.write(";");
					}
				}
				fitxer.write("\n");
			}
			fitxer.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer a la funció guardarPartida");
		}
	}

	public static boolean novaPartida() {
		String partida = ""; 
		do {
			partida = teclatText("Si vols començar una nova partida escriu nova, o si vols recuperar la partida anterior escriu guardada");
			if (!(partida.equals("nova")) && !(partida.equals("guardada"))) {
				System.out.println("Error!! Has d'introduir nova o guardada");
			}
		} while (!(partida.equals("nova")) && !(partida.equals("guardada")));

		if (partida.equals("nova")) {
			return true;
		} else {
			return false;
		}
	}

	public static void setFileToMatriu(String nomFitxer, char[][] flota1, char[][] flota2) {
		String linea;
		int contador = 0;
		String[][] matriu = new String [16][8];
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			for (int i = 0; i < matriu.length; i++) {
				linea = fileScanner.nextLine();
				String[] array = linea.split(";");
				for (int j = 0; j < array.length; j++) {
					matriu[contador][j] = array[j];
				}
				contador++;
			}

			for (int i = 0; i < flota1.length; i++) {
				for (int j = 0; j < flota1[i].length; j++) {
					flota1[i][j] = matriu[i][j].charAt(0);
				}
			}
	
			for (int i = 0; i < flota2.length; i++) {
				for (int j = 0; j < flota2[i].length; j++) {
					flota2[i][j] = matriu[i + flota1.length][j].charAt(0); 
				}
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer a la funció setFileToMatriu");
		}
	}
	
	public static void main(String[] args) {
		String msgFlota1 = "Torn de la Flota número 1";
		String msgFlota2 = "Torn de la Flota número 2";
		String nomFitxerGuardada = "lib/partidaGuardada.txt";
		char[][] matriuFlota1 = new char [8][8];
		char[][] matriuFlota2 = new char [8][8];
		boolean seguir = true;

		if (novaPartida()) {
			omplirMatriu(matriuFlota1);
			omplirMatriu(matriuFlota2);
			introduirVaixells(matriuFlota1, msgFlota1);
			introduirVaixells(matriuFlota2, msgFlota2);
		} else {
			setFileToMatriu(nomFitxerGuardada, matriuFlota1, matriuFlota2);
			System.out.println("Flota 1: ");
			for (int i = 0; i < matriuFlota1.length; i++) {
				for (int j = 0; j < matriuFlota1.length; j++) {
					System.out.print(matriuFlota1[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Flota 2: ");
			for (int i = 0; i < matriuFlota2.length; i++) {
				for (int j = 0; j < matriuFlota2.length; j++) {
					System.out.print(matriuFlota2[i][j]);
				}
				System.out.println();
			}
			
		}
		
		while (comprovarVaixells(matriuFlota1, msgFlota1) != 0 && comprovarVaixells(matriuFlota2, msgFlota2) != 0) {
			comprovarVaixells(matriuFlota1, msgFlota1);
			comprovarVaixells(matriuFlota2, msgFlota2);
			seguir = enfonsarVaixells(matriuFlota2, msgFlota1);
			if (!(seguir)) {
				guardarPartida(matriuFlota1, matriuFlota2);
				break;
			} 
			seguir = enfonsarVaixells(matriuFlota1, msgFlota2);
			if (!(seguir)) {
				guardarPartida(matriuFlota1, matriuFlota2);
				break;
			}
		}
		
		if (!(seguir)) {
			System.out.println("La partida ha sigut guardada");
		} else if (comprovarVaixells(matriuFlota1, msgFlota1) == 0) {
			System.out.println("La Flota número 2 ha guanyat!!!");
		} else if (comprovarVaixells(matriuFlota2, msgFlota2) == 0) {
			System.out.println("La Flota número 1 ha guanyat!!!");
		}
		
	}

}