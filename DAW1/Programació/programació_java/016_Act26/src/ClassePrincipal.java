import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		int numero;
		int divisor;
		boolean sortir;
		divisor = 2;
		sortir = false;
		Scanner teclatnum = new Scanner (System.in);
		
		System.out.println("Introdueix un numero");
		numero = teclatnum.nextInt();
		
		while (divisor < numero && sortir ==false) {
			if (numero % divisor ==0) {
				sortir = true;
			} else {
				divisor++;
			}
			
			
		}
		if (sortir == false) {
			System.out.println("El numero " + numero + " es primer");
			} else {
				System.out.println("El numero " + numero + " no es primer");
				
			}
		}

}
