import java.util.*; //Importen la llibreria on est� el Scanner

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		String nom;
		Scanner teclatint; //Declarem la variable del teclat
		Scanner teclatline;
		
		teclatint = new Scanner (System.in); //Creem la variable del teclat
		teclatline = new Scanner (System.in);
		
		System.out.println("Introdueix un n�mero entre l'1 i el 15");
		numero = teclatint.nextInt();
		System.out.println("Introdueix el teu nom");
		nom = teclatline.nextLine();
		
		System.out.println("El valor de la variable n�mero �s " + numero);
		System.out.println("El valor de la variable nom �s " + nom);
		
		teclatint.close();
		teclatline.close();
	}

}
