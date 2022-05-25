import java.util.Scanner;

public class ProgramaPersona {
	static Scanner teclat = new Scanner (System.in);
	
	public static void comprovarPes(Persona persona) {
		if (persona.calcularIMC() == 1) {
			System.out.println("En/La " + persona.getNom() + " té sobrepès");
		} else if (persona.calcularIMC() == -1) {
			System.out.println("En/La " + persona.getNom() + " està desnutrit");
		} else {
			System.out.println("En/La " + persona.getNom() + " està en el seu pes ideal");
		}
		System.out.println();
	}
	
	public static void majorEdat(Persona persona) {
		if (persona.esMajorDEdat()) {
			System.out.println("En/La " + persona.getNom() + " és major d'edat");
		} else {
			System.out.println("En/La " + persona.getNom() + " és menor d'edat");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom1;
		char sexe1;
		int edat1; 
		double pes1, alsada1;
		
		System.out.println("Introdueix el teu nom");
		nom1 = teclat.next();
		System.out.println("Introdueix la teva edat");
		edat1 = teclat.nextInt();
		System.out.println("Introdueix el teu sexe (H = home | D = dona)");
		sexe1 = teclat.next().charAt(0);
		System.out.println("Introdueix el teu pes en Kg");
		pes1 = teclat.nextDouble();
		System.out.println("Introdueix la teva alçada en Metres");
		alsada1 = teclat.nextDouble();
		
		
		Persona persona1 = new Persona (nom1, edat1, sexe1, pes1, alsada1);
		Persona persona2 = new Persona("Marc", 53, 'H'); //El pes i l'alçada ho deixo a 0, perque diu que no els hi doni, i per defecte els tinc a 0.
		Persona persona3 = new Persona();
		
		persona3.setNom("Lluis");
		persona3.setEdat(25);
		persona3.setSexe('H');
		persona3.setPes(60.8);
		persona3.setAlsada(1.80);
	
		comprovarPes(persona1);
		comprovarPes(persona2);
		comprovarPes(persona3);
		System.out.println();
		
		majorEdat(persona1);
		majorEdat(persona2);
		majorEdat(persona3);
		System.out.println();
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		
	}

}
