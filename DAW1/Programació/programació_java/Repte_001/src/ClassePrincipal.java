import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int numeros[] = new int[4];
		 String pal = "";
		 boolean sortir = false;
		 String cadena = "";
		 Scanner teclatlletra = new Scanner(System.in);
		 int comptadorC = 0, comptadorP = 0, comptadorD = 0, comptadorT = 0;
		 
		 System.out.println("Introdueix els valors de les teves cartes");
		 cadena = teclatlletra.nextLine();
		 
		 
		 for (int i = 0, j = 0, p = 2; i < numeros.length; i++, j = (j + 4), p = j + 2) {
			 
			 if (cadena.charAt(j) == '1') {
				 numeros[i] = 10;
				 j++;
				 p++;
			 } else if (cadena.charAt(j) == 'J') {
				 numeros[i] = 11;
			 } else if (cadena.charAt(j) == 'Q') {
				 numeros[i] = 12;
			 } else if (cadena.charAt(j) == 'K') {
				 numeros[i] = 13;
			 } else if (cadena.charAt(j) == 'A') {
				 numeros[i] = 14;
			 } else {
				 numeros[i] = Integer.parseInt(String.valueOf(cadena.charAt(j)));
				 
			 }
			 
			 if (cadena.charAt(p) == 'C') {
				 comptadorC++;
			 } else if (cadena.charAt(p) == 'P') {
				 comptadorP++;
			 } else if (cadena.charAt(p) == 'T') {
				 comptadorT++;
			 } else if (cadena.charAt(p) == 'D') {
				 comptadorD++;
			 }
			 
		 }
		 
		 if (comptadorC == 4) {
			 pal = "C";
		 } else if (comptadorP == 4) {
			 pal = "P";
		 } else if (comptadorT == 4) {
			 pal = "T";
		 } else if (comptadorD == 4) {
			 pal = "D";
		 } else {
			 sortir = true;
		 }
		 
		 Arrays.sort(numeros);
		 
		 int error = 0;
		 int pos = -1;
		 for (int i = 0; i < numeros.length - 1; i++) {
			 if (numeros[i + 1] - numeros[i] > 2) {
				 error = numeros.length;
				 break;
			 } else if (numeros[i + 1] - numeros[i] == 2) {
				 error++;
				 pos = i;
			 }
		 }
		 
		 if (error == 0 && sortir == false) {
			 if (numeros[3] == 14) {
				 System.out.print(numeros[0] - 1 + " " + pal);
			 } else {
				 if (numeros[3] + 1 == 14) {
					 System.out.print("A " + pal);
				 } else if (numeros[3] + 1 == 13) {
					 System.out.print("K " + pal);
				 } else if (numeros[3] + 1 == 12) {
					 System.out.print("Q " + pal);
				 } else if (numeros[3] + 1 == 11) {
					 System.out.print("J " + pal);
				 } else {
					 System.out.print(numeros[3] + 1 + " " + pal);
				 }
			 }
			 
		 } else if (error == 1 && sortir == false) {
			 if (numeros[pos] + 1 == 13) {
				 System.out.print("K " + pal);
			 } else if (numeros[pos] + 1 == 12) {
				 System.out.print("Q " + pal);
			 } else if (numeros[pos] + 1 == 11) {
				 System.out.print("J " + pal);
			 } else {
				 System.out.print(numeros[pos] + 1 + " " + pal);
			 }
		 } else if (error > 1 || sortir == true) {
			 System.out.print("RES");
		 }
		 
		 
		 
		 teclatlletra.close();
	}
}
