import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base, altura;
		int perimetre, area;
		Scanner teclatnum = new Scanner (System.in);
		System.out.println("Introdueix la base en cm");
		base = teclatnum.nextInt();
		System.out.println("Introdueix l'altura en cm");
		altura = teclatnum.nextInt();
		
		perimetre = (base * 2) + (altura * 2);
		area = base * altura;
		
		System.out.println("El perimetre es de " + perimetre + "cm");
		System.out.println("La base es de " + base + "cm");
		
	}

}
