import java.util.*;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclatText = new Scanner(System.in);
		int[] arrNums = new int [10];
		int numero = 0, intents = 0, posicio;
		
		do {
			System.out.println("Introdueix un n�mero entre 1 i 100");
			try {
				numero = Integer.parseInt(teclatText.nextLine());
				posicio = Integer.parseInt(teclatText.nextLine());
				arrNums[posicio] = numero;
			} catch (NumberFormatException e) {
				System.out.println("El valor introduit no �s un int");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("La posici� de l'array ha de ser entre 0 i 9");
			} catch (Exception e) {
				System.out.println("Error general!" + e.getMessage());
			}
			intents++;
		} while (numero < 1 || numero > 100);
		
		System.out.println("El n�mero introdu�t �s " + numero);
		System.out.println("El n�mero d'intents �s " + intents);
		
	}

}
