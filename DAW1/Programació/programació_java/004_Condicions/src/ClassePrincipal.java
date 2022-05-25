import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Scanner teclatnum = new Scanner (System.in);
		
		System.out.println("Introdueix un número entre 25 i 50");
		numero = teclatnum.nextInt();
		
		if (numero >= 25 && numero <= 50) {
			System.out.println("Enhorabona!!!");
		} 
		
		else {
			System.out.println("Error!!!!");
		}
		
		
		int diasetmana;
		System.out.println("Introdueix número de dia de la setmana, entre 1 i 7");
		
		diasetmana = teclatnum.nextInt();
		
		if (diasetmana < 1 || diasetmana > 7) {
			System.out.println("ERROR");
		} 
		
		else {
			if (diasetmana == 6 || diasetmana == 7) {
				System.out.println("Es cap de setmana");
			}
			else if (diasetmana == 1) {
				System.out.println("DILLUNS");
			}
			else if (diasetmana == 2) {
				System.out.println("DIMARTS");
			}
			else if (diasetmana == 3) {
				System.out.println("DIMECRES");
			}
			else if (diasetmana == 4) {
				System.out.println("DIJOUS");
			}
			else if (diasetmana == 5) {
				System.out.println("DIVENDRES");
			}
		}
		
		
		teclatnum.close();
	}

}
