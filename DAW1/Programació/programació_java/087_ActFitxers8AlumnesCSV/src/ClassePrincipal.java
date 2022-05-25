import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class ClassePrincipal {
	static final Scanner teclatText = new Scanner(System.in);
	
	public static int contadorFiles(String nomFitxer) {
		int contador = 0;
		String linea;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			while (fileScanner.hasNextLine()) {
				linea = fileScanner.nextLine();
				contador++;
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
		
		return contador-1;
	}
	
	public static void pasarMatriu(String nomFitxer, String[][] alumnes) {
		String linea;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			linea = fileScanner.nextLine();
			for (int i = 0; i < alumnes.length; i++) {
				linea = fileScanner.nextLine();
				alumnes[i] = linea.split(";");
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void visualitzarMatriu(String[][] alumnes) {
		for (int i = 0; i < alumnes.length; i++) {
			System.out.println();
			for (int j = 0; j < alumnes[i].length; j++) {
				System.out.print(" " + alumnes[i][j] + " ");
			}
		}
	}
	
	public static int getFilaIdentificadorAlumnes(String idAlumne, String[][] alumnes) {
		int fila = -1;
		for (int i = 0; i < alumnes.length; i++) {
			if (alumnes[i][1].equals(idAlumne)) {
				fila = i;
				break;
			}
		}
		
		
		return fila;
	}
	
	public static boolean setInformacioAlumne(String[][] alumnes, int filaAlumne) {
		System.out.println("Introdueix el nou nom de l'alumne ");
		String nouNom = teclatText.nextLine();
		System.out.println("Introdueix el nou cognom de l'alumne ");
		String nouCognom = teclatText.nextLine();
		
		System.out.println("Desitja modificar l'informació? (S/N)");
		String opcio = teclatText.nextLine();
		
		if (opcio.toUpperCase().charAt(0) =='S') {
			alumnes[filaAlumne][2] = nouNom;
			alumnes[filaAlumne][3] = nouCognom;
			return true;
		} else {
			System.out.println("Operació cancel·lada");
			return false;
		}
	}
	
	public static void setMatriuToFile(String nomFitxer, String[][] alumnes) {
		String capcelera = "Num.;Id;Nom;Cognom";
		try {
			FileWriter fitxer = new FileWriter(nomFitxer);
			fitxer.write(capcelera);
			for (int i = 0; i < alumnes.length; i++) {
				fitxer.write("\n");
				for (int j = 0; j < alumnes[i].length; j++) {
					fitxer.write(alumnes[i][j] + ";");
				}
			}
			fitxer.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/alumnes.csv";
		String [][] alumnes;
		int columnes = 4;
		int files = contadorFiles(nomFitxer);
		String idAlumne;
		int filaAlumne;
		
		alumnes = new String[files][columnes];
		pasarMatriu(nomFitxer, alumnes);
		visualitzarMatriu(alumnes);
		System.out.println("Introdueix l'idintifacdor");
		idAlumne = teclatText.nextLine();
		filaAlumne = getFilaIdentificadorAlumnes(idAlumne, alumnes);
		if (filaAlumne == -1) {
			System.out.println("Aquest identificador no existeix");
		} else {
			System.out.println("Nom: " + alumnes[filaAlumne][2]);
			System.out.println("Cognom: " + alumnes[filaAlumne][3]);
			System.out.println("Desitja modificar l'informació? (S/N)");
			String opcio = teclatText.nextLine();
			if (opcio.toUpperCase().charAt(0) =='S') {
				if (setInformacioAlumne(alumnes, filaAlumne)) {
					setMatriuToFile(nomFitxer, alumnes);
					System.out.println("Modificació correcte");
				}
			} else {
				System.out.println("No s'ha produit cap modificació");
			}
		}
	}

}
	