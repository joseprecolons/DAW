import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		int comptador;
		int divisor;
		int suma;
		boolean sortir;
		
		Scanner teclatnum = new Scanner (System.in);
		System.out.println("Introdueix el primer numero (petit)");
		num1 = teclatnum.nextInt();
		System.out.println("Introdueix el segon numero (gran)");
		num2 = teclatnum.nextInt();
		sortir = false;
		suma = 0;
		comptador = num1;
		
		while (comptador != num2 ) {
			divisor = 2;
			sortir = false;
			while (divisor < comptador && sortir == false) {
				if (comptador % divisor == 0) {
					sortir = true;
				} else {
					divisor++;
				}
			}
			
			if (sortir == false) {
				suma = suma + comptador;
			}
			comptador++;
		
		}
		
		System.out.println("El resultat de la suma dels números primers es " + suma);
		
		teclatnum.close();
	}
}
