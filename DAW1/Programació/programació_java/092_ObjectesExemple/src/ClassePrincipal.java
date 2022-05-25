import java.util.Scanner;

public class ClassePrincipal {
	
	public static void introduirDadesObjectes(String titolObj, Persona objPersona) {
		Scanner teclatText = new Scanner(System.in);
		Scanner teclatNum = new Scanner(System.in);
		
		String dni, nom;
		int edat;
		
		System.out.println("DADES PER " + titolObj.toUpperCase());
		System.out.println("Introdueix el DNI de " + titolObj);
		dni = teclatText.nextLine();
		
		System.out.println("Introdueix el nom de l'objecte 1");
		nom = teclatText.nextLine();
		
		System.out.println("Introdueix l'edat de l'objecte 1");
		edat = teclatNum.nextInt();
		
		objPersona.setDni(dni);
		objPersona.setNom(nom);
		objPersona.setEdat(edat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona objPersona1 = new Persona();
		Persona objPersona2 = new Persona();
		
		introduirDadesObjectes("Objecte 1", objPersona1);
		introduirDadesObjectes("Objecte 2", objPersona2);
		
		System.out.println("INFORMACIÓ PERSONA 1");
		objPersona1.visualitzar();
		System.out.println("INFORMACIÓ PERSONA 2");
		objPersona2.visualitzar();
	}

}
