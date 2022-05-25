import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclatText = new Scanner(System.in);
		int numero, intents = 0, numUsuari = 0;
		numero = (int) ((Math.random() * 100) + 1);
		
		System.out.println(numero);
		
		while (numUsuari != numero && intents < 3 && numUsuari != -1) {
			System.out.println("Introdueix un número entre 1 i 100");
			try {
				numUsuari = Integer.parseInt(teclatText.nextLine());
				
			} catch (NumberFormatException e) {
				System.out.println("El valor introduit no és un int");
			} catch (Exception e) {
				System.out.println("Error general!" + e.getMessage());
			}
			intents++;
			
			if (numUsuari > numero) {
				System.out.println("El número que has introduït es masa gran");
			} else if (numUsuari < numero && numUsuari != -1) {
				System.out.println("El número que has introduït es masa petit");
			}
		}
		
		if (numUsuari == numero) {
			System.out.println("Enhorabona!!! Ho has aconseguit en " + intents + "intents");
		} else if (numUsuari == -1) {
			System.out.println("T'has rendit");
		} else {
			System.out.println("f");
		}
		
		teclatText.close();
	}
	

}
