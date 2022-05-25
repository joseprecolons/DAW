import java.util.Scanner;

public class ClassePrincipal2 {
	private static Scanner teclat = new Scanner(System.in);
	
	public static void imprimirInformacio(Persona[] objArray) {
		for(int i = 0; i < objArray.length; i++) {
			System.out.println(objArray[i]);
		}
	}
	
	public static void imprimirInformacioPerObjecte(Persona[] objArray) {
		for(int i = 0; i < objArray.length; i++) {
			if (objArray[i] instanceof Estudiante) {
				Estudiante e = (Estudiante) objArray[i];
				e.estudiar();
			} else {
				Empleado e = (Empleado) objArray[i];
				e.cobrar();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] objArray;
		int nPersones, opcio;
		String nom, domicili, horari, nomJefe;
		int grau;
		char grup;
		
		System.out.println("Introdueix el número de persones que vols crear");
		nPersones = teclat.nextInt();
		
		objArray = new Persona[nPersones];
		
		for(int i = 0; i < objArray.length; i++) {
			System.out.println("Que vols crear? Estudiant -> 0 | Empleat -> 1");
			opcio = teclat.nextInt();
			
			System.out.println("Escriu el seu nom");
			nom = teclat.next();
			
			System.out.println("Escriu el seu domicili");
			domicili = teclat.next();
			
			System.out.println("Escriu el seu horari");
			horari = teclat.next();
			
			switch (opcio) {
				case 0: 
					System.out.println("Introdueix el seu grau");
					grau = teclat.nextInt();
					
					System.out.println("Introdueix el seu grup");
					grup = teclat.next().charAt(0);
					
					objArray[i] = new Estudiante(nom, domicili, horari, grau, grup);
					break;
					
				case 1:
					System.out.println("Introdueix el nom del teu jefe");
					nomJefe = teclat.next();
					
					objArray[i] = new Empleado(nom, domicili, horari, nomJefe);
					break;
			}
		}
		
		imprimirInformacio(objArray);
	}

}
