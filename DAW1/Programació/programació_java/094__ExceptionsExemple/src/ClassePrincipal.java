import java.util.*;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0, intents = 0;
		Scanner teclatText = new Scanner(System.in);
		
		do {
			System.out.println("Introdueix un número entre 1 i 100");
			try {
				numero = Integer.parseInt(teclatText.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("El valor introduit no és un int");
			} catch (Exception e) {
				System.out.println("Error general!" + e.getMessage());
			}
			intents++;
		} while (numero < 1 || numero > 100);
		
		System.out.println("El número introduït és " + numero);
		System.out.println("El número d'intents és " + intents);
	}

}
