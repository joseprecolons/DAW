import java.io.File;
import java.util.Scanner;

public class Enunciat01 {
	static final Scanner teclat = new Scanner(System.in);
	
	public static char funcioTeclat(String msg) {
		char caracterLlegit;

		System.out.print(msg);
		caracterLlegit = teclat.next().charAt(0);
		
		return caracterLlegit;
	}
	
	public static int enterSegur(String msg, String [] missatges) {
	    char caracterLlegit;
	    int enterLlegit = 0;
	    boolean esNombre = false;
	    do {
	       caracterLlegit = funcioTeclat(msg);
	       esNombre = comprovaEsEnter(caracterLlegit);
	       
	       if (esNombre == true) {
	          enterLlegit = Character.getNumericValue(caracterLlegit); 
	       } else {
	          System.out.println(missatges[2] + missatges[5]);
	       }
	  } while (esNombre != true);
	    
	  return enterLlegit;
	}

     public static boolean comprovaEsEnter(char caracterRebut) {
        boolean esEnter = false;
        int codiASCII;
        codiASCII = (int) caracterRebut;
        if(codiASCII >= 48 && codiASCII <= 57) {
           esEnter = true;
        }
        return esEnter;
     }
	
	public static int contadorFiles(String nomFitxer) { //Utilitzo el contador de files per donar el tamany corresponent a l'array que guarda els díes
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
	
	public static void setFileToMatriu(String nomFitxer, String[] arrayDiesSetmana) {
		 //Aquesta funció em passa la informació de l'archiu catala.txt a l'array dels dies de la setmana
		String[][] matriu = new String [contadorFiles(nomFitxer)][2];
		String linea;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			for (int i = 0; i < matriu.length; i++) {
				linea = fileScanner.nextLine();
				matriu[i] = linea.split(",");
			}
			
			for (int i = 0; i < arrayDiesSetmana.length; i++) {
				arrayDiesSetmana[i] = (i+1) + " - " + matriu[i][0];
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}

	public static int llegeixEnterArray(String cadenaAMostrar, String[] arrayValors) {
		int valorDemanat;
		String[] missatges = {"Els possibles valors són:", "Entra la teva opció", "ERROR! El valor entrat ", "Torna a intentar-ho.", 
				"està fora de rang,", "No és un enter"};
		System.out.println(cadenaAMostrar + "\n" + missatges[0]);
		
		for (int i = 0; i < arrayValors.length; i++) {
			System.out.println(arrayValors[i]);
		}
		
		if (cadenaAMostrar.equals("Entra un dia de la setmana")) {
			do {
				System.out.println(missatges[1] + " 1,2,3,4,5,6,7");
				valorDemanat = enterSegur("", missatges);
				if (valorDemanat > 7 || valorDemanat < 1) {
					System.out.println(missatges[2] + missatges[4] + "\n" + missatges[3] +  " 1,2,3,4,5,6,7");
				}
			} while (valorDemanat < 1 || valorDemanat > 7);
			
		} else if (cadenaAMostrar.equals("Entra un idioma")) {
			do {
				System.out.println(missatges[1] + " 1,2,3");
				valorDemanat = enterSegur("", missatges);
			} while (valorDemanat < 1 || valorDemanat > 3);
			
		} else {
			do {
				System.out.println(missatges[1] + " 1,2");
				valorDemanat = enterSegur("", missatges);
			} while (valorDemanat < 1 || valorDemanat > 2);
		}
		
		
		return valorDemanat;
	}
	
	public static String[][] setFileToMatriuFinal(String nomFitxer) { 
		//Utilitzo un altre funció diferent per enviar la info dels arxius a la matriu que conté tots els dies en tots els idiomes
		String[][] matriu = new String [contadorFiles(nomFitxer)][2];
		String linea;
		try {
			File fitxer = new File(nomFitxer);
			Scanner fileScanner = new Scanner(fitxer);
			for (int i = 0; i < matriu.length; i++) {
				linea = fileScanner.nextLine();
				matriu[i] = linea.split(",");
			}
			
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
		return matriu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/catala.txt"; //Li posu aquest nom el primer per utilitzarlo per contar les files de l'array que creare pels noms en catala de la pregunta
		String missDemDiaSet = "Entra un dia de la setmana";
		String missDemIdioma = "Entra un idioma";
		String missDemFormat = "Entra un format";
		boolean sortir = true;
		int aux;
		int diaSetDemanat = 0;
		int idiomaDemanat = 0;
		int formatDemanat = 0;
		String[] arrayDiesDeLaSetmana = new String [contadorFiles(nomFitxer)];
		String[] idiomesDisponibles = {"1 - català", "2 - castellà", "3 - anglès"};
		String[] formatDia = {"1 - llarg", "2 - curt"};
 		setFileToMatriu(nomFitxer, arrayDiesDeLaSetmana);
		
 		do {
 			diaSetDemanat = llegeixEnterArray(missDemDiaSet, arrayDiesDeLaSetmana);
 	 		idiomaDemanat = llegeixEnterArray(missDemIdioma, idiomesDisponibles);
 	 		formatDemanat = llegeixEnterArray(missDemFormat, formatDia);
 	 		
 			if (idiomaDemanat == 1) {
 	 			nomFitxer = "lib/catala.txt";
 	 			System.out.println("El dia de la setmana (" + arrayDiesDeLaSetmana[diaSetDemanat-1] + ") segons l'idioma escollit (" + idiomesDisponibles[idiomaDemanat-1] + 
 	 	 				") i el format demanat (" + formatDia[formatDemanat-1] + ") + és: " + setFileToMatriuFinal(nomFitxer)[diaSetDemanat-1][formatDemanat-1]);
 	 			
 	 		} else if (idiomaDemanat == 2) {
 	 			nomFitxer = "lib/castella.txt";
 	 			System.out.println("El dia de la setmana (" + arrayDiesDeLaSetmana[diaSetDemanat-1] + ") segons l'idioma escollit (" + idiomesDisponibles[idiomaDemanat-1] + 
 	 	 				") i el format demanat (" + formatDia[formatDemanat-1] + ") + és: " + setFileToMatriuFinal(nomFitxer)[diaSetDemanat-1][formatDemanat-1]);
 	 		} else {
 	 			nomFitxer = "lib/angles.txt";
 	 			System.out.println("El dia de la setmana (" + arrayDiesDeLaSetmana[diaSetDemanat-1] + ") segons l'idioma escollit (" + idiomesDisponibles[idiomaDemanat-1] + 
 	 	 				") i el format demanat (" + formatDia[formatDemanat-1] + ") + és: " + setFileToMatriuFinal(nomFitxer)[diaSetDemanat-1][formatDemanat-1]);
 	 		}
 			
 			do {
 				String [] missatgeError = {"ERROR! El valor entrat NO és un enter \n Torna a intentar-ho."};
 				aux = enterSegur("Vols continuar (1 - Si, 2 - No): ", missatgeError);
 	 			if (aux == 1) {
 	 				sortir = false;
 	 			} else if (aux == 2) {
 	 				sortir = true;
 	 				System.out.println("Que vagi bé!!");
 	 			}
 			} while (aux != 1 && aux != 2);
 			
 		} while (sortir == false);
 		
 		
		
		
 	}

}
