import java.util.Scanner;

public class ClassePrincipal {

	public static Scanner teclatNum = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introdueix el número de passwords que vols generar");
		int numPasswords = teclatNum.nextInt();		
		
		System.out.println("Introdueix la longitud que vols que tinguin les passwords");
		int longitudPw = teclatNum.nextInt();		
		
		Password[] objArrayPasswords = new Password[numPasswords];
		for (int i = 0; i < objArrayPasswords.length; i++) {
			objArrayPasswords[i] = new Password(longitudPw);
		}
		
		for (int i = 0; i < objArrayPasswords.length; i++) {
			if (objArrayPasswords[i].esFort()) {
				System.out.println("La contrasenya " + objArrayPasswords[i].getContrasenya() + " valor Sí");
			} else {
				System.out.println("La contrasenya " + objArrayPasswords[i].getContrasenya() + " valor No");
			}
		}
	}

}
