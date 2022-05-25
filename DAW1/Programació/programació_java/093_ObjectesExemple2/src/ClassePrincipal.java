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
		Scanner teclatNum = new Scanner(System.in);
		int numPersones;
		
		System.out.println("Introdueix el número de persones que vols crear");
		numPersones = teclatNum.nextInt();
		Persona[] objArr = new Persona[numPersones];
		for (int i = 0; i < objArr.length; i++) {
			objArr[i] = new Persona();
			introduirDadesObjectes("Objecte " + (i+1), objArr[i]);
		}
		
		System.out.println("Visualitzar informació dels objectes");
		for (int i = 0; i < objArr.length; i++) {
			System.out.println("Objecte " + (i+1));
			objArr[i].visualitzar();
		}
		
	}

}