import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1;
		double num2;
		double suma;
		double resta;
		double prod;
		double divi;
		
		Scanner teclatnum = new Scanner (System.in);
		
		System.out.println("Introdueix el primer numero");
		num1 = teclatnum.nextInt();
		System.out.println("Introdueix el segon numero");
		num2 = teclatnum.nextInt();
		
		suma = (num1 + num2);
		
		if (suma > 0) {
			
			System.out.println("El resultat de la suma �s positiu");
			
		} else if (suma < 0) {
			
			System.out.println("El resultat de la suma �s negatiu");
			
		} else {
			
			System.out.println("El resultat de la suma �s zero");
		}
		
		resta = (num1 - num2);
		
		if (resta > 0) {
			
			System.out.println("El resultat de la resta �s positiu");
			
		} else if (resta < 0) {
			
			System.out.println("El resultat de la resta �s negatiu");
			
		} else {
			
			System.out.println("El resultat de la resta �s zero");
		}
		
		prod = (num1 * num2);
		
		if (prod > 0) {
			
			System.out.println("El resultat de la multiplicaci� �s positiu");
			
		} else if (prod < 0) {
			
			System.out.println("El resultat de la multiplicaci� �s negatiu");
			
		} else {
			
			System.out.println("El resultat de la multiplicaci� �s zero");
		}
		
		if (num1 == 0 || num2 == 0) {
			System.out.println("No es pot dividir entre 0");
		} else {
			
			divi = (num1 / num2);
			
			if (divi > 0) {
				
				System.out.println("El resultat de la divisi� �s positiu");
				
			} else if (divi < 0) {
				
				System.out.println("El resultat de la divisi� �s negatiu");
				
			} else {
				
				System.out.println("El resultat de la divisi� �s zero");
			}
		}
		
		teclatnum.close();
	}
}
