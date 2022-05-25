import java.util.Scanner;

public class ProgramaPersonaAdrece {
	static Scanner teclat = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomPersona1, localitatPersona1, cpPersona1, carrerPersona1;
		int dniPersona1;
		System.out.println("Introdueix nom");
		nomPersona1 = teclat.next();
		System.out.println("Introdueix dni");
		dniPersona1 = teclat.nextInt();
		System.out.println("Introdueix localitat");
		localitatPersona1 = teclat.next();
		System.out.println("Introdueix codi postal");
		cpPersona1 = teclat.next();
		System.out.println("Introdueix carrer");
		carrerPersona1 = teclat.next();
		
		Adrece adrecePersona1 = new Adrece(localitatPersona1, cpPersona1, carrerPersona1);
		
		//PersonaAdrece persona1 = new PersonaAdrece(dniPersona1, nomPersona1, localitatPersona1, cpPersona1, carrerPersona1);
		PersonaAdrece persona1 = new PersonaAdrece(dniPersona1, nomPersona1, adrecePersona1);
		
		System.out.println("Persona 1 creada correctament");
		System.out.println("Nom : " + persona1.getNom());
		System.out.println("DNI : " + persona1.getDni());
		System.out.println(persona1.getAdrece());
	}

}
