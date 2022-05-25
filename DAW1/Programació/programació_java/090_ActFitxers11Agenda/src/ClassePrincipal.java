import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class ClassePrincipal {
	static final Scanner teclatText = new Scanner(System.in);
	static final Scanner teclat = new Scanner(System.in);
	
	public static int operacioARealitzar(String text) {
		int num;
		
		System.out.println(text);
		num = teclat.nextInt();
		
		return num;
	}
	
	public static String dadesUserString(String text) {
		String cadena;
		
		System.out.println(text);
		cadena = teclat.next();
		
		return cadena;
	}
	
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
		
		return contador;
	}
	
	public static String[][] afegirContacte(String nomFitxer, String[][] matriuContacte) {
		String[][] matriuContacteAfegit = new String [matriuContacte.length+1][4];
		
		for (int i = 0; i < matriuContacte.length; i++) {
			for (int j = 0; j < matriuContacte[i].length; j++) {
				matriuContacteAfegit[i][j] = matriuContacte[i][j];
			}
		}
			int pMatriu = matriuContacteAfegit.length-1;
			
			if ((contadorFiles(nomFitxer) + 1) < 10) {
				matriuContacteAfegit[pMatriu][0] = "00" + (contadorFiles(nomFitxer) + 1);
			} else if ((contadorFiles(nomFitxer) + 1) < 100) {
				matriuContacteAfegit[pMatriu][0] = "0" + (contadorFiles(nomFitxer) + 1);
			} else {
				matriuContacteAfegit[pMatriu][0] = "" + (contadorFiles(nomFitxer) + 1);
			}
			
			matriuContacteAfegit[pMatriu][1] = dadesUserString("Introdueix el nom de la persona a la que vols agregar als teus contactes");
			
			matriuContacteAfegit[pMatriu][2] = dadesUserString("Introdueix el correu de la persona a la que vols agregar als teus contactes");
			
			matriuContacteAfegit[pMatriu][3] = dadesUserString("Introdueix el telèfon de la persona a la que vols agregar als teus contactes");
		
		return matriuContacteAfegit;
	}
	
	public static String[][] deleteContacte(String[][] matriu ) {
		String[][] novaMatriu = new String [matriu.length-1][4];
		String idContacte = dadesUserString("Escriu el id del contacte al que vols esborrar");
		
		for (int i = 0; i < matriu.length; i++) {
			if (matriu[i][0].equals(idContacte)) {
				for (int j = i; j < matriu.length; j++) {
					for (int k = 0; k < matriu[j].length; k++) {
						if (j == matriu.length-1) {
							matriu[j][k] = "";
						} else {
							matriu[j][k] = matriu[j+1][k];
						}
					}
				}
			}
		}
		return novaMatriu;
	}
	
	public static void modificarContacte(String[][] matriu) {
		String idContacte = dadesUserString("Escriu el id del contacte al que vols modificar");
		
		for (int i = 0; i < matriu.length; i++) {
			if (matriu[i][0].equals(idContacte)) {
				
				matriu[i][1] = dadesUserString("Introdueix el nou nom de la persona a la que vols modificar als teus contactes");	
				matriu[i][2] = dadesUserString("Introdueix el nou correu de la persona a la que vols modificar als teus contactes");
				matriu[i][3] = dadesUserString("Introdueix el nou telèfon de la persona a la que vols modificar als teus contactes");	
			}
		}
	}
	
	public static void setFileToMatriu(String nomFitxer, String[][] matriu) {
		String linea;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			for (int i = 0; i < matriu.length; i++) {
				linea = fileScanner.nextLine();
				matriu[i] = linea.split(";");
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void setMatriuToFile(String nomFitxer, String[][] matriu) {
		try {
			FileWriter fitxer = new FileWriter(nomFitxer);
			for (int i = 0; i < matriu.length; i++) {
				if(i != 0) {
					fitxer.write("\n");	
				}
				for (int j = 0; j < matriu[i].length; j++) {
					fitxer.write(matriu[i][j] + ";");
				}
			}
			fitxer.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/contactes.txt";
		String escollirOpcio = "1. Afegir contacte. \n2. Esborrar contacte. \n3. Modificar contacte. \n4. Sortir i guardar dades. \n5. Sortir sense guardar.";
		String[][] matriuModificarContacte = new String [contadorFiles(nomFitxer)][4];
		String[][] matriuEsborrarContacte = new String [contadorFiles(nomFitxer)-1][4];
		String[][] matriuNouUser = new String [contadorFiles(nomFitxer)+1][4];;
		String[][] matriuNoGuardar = new String [contadorFiles(nomFitxer)][4];
		int numOpcio;
		do {
			numOpcio = operacioARealitzar(escollirOpcio);
			setFileToMatriu(nomFitxer, matriuNoGuardar);
			if (numOpcio == 1) {
				setFileToMatriu(nomFitxer, matriuModificarContacte);
				matriuNouUser = afegirContacte(nomFitxer, matriuModificarContacte);
			} else if (numOpcio == 2) {
				setFileToMatriu(nomFitxer, matriuModificarContacte);
				matriuEsborrarContacte = deleteContacte(matriuModificarContacte);
			} else if (numOpcio == 3) {
				setFileToMatriu(nomFitxer, matriuModificarContacte);
				modificarContacte(matriuModificarContacte);
			}
			
			setMatriuToFile(nomFitxer, matriuNouUser);
			setMatriuToFile(nomFitxer, matriuModificarContacte);
			setMatriuToFile(nomFitxer, matriuEsborrarContacte);
			
		} while (numOpcio != 4 && numOpcio != 5);
		
		if (numOpcio == 5) {
			setMatriuToFile(nomFitxer, matriuNoGuardar);
			System.out.println("Les dades no s'han guardat!");
		} else {
			System.out.println("Les dades s'han guardat!");
		}
				
	}

}