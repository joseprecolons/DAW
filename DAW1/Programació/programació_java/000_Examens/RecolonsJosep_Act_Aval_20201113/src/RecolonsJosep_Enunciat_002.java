import java.util.*;
public class RecolonsJosep_Enunciat_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, resultatnum;
		Scanner teclatnum = new Scanner (System.in);
		System.out.println("Introdueix un n�mero entre 0 i 10");
		num = teclatnum.nextInt();
		
		if (num <= 10 && num >= 0) { // Si el n�mero es m�s gran que 10 o el n�mero es m�s petit que 0 no entrar� el programa
			
			for (int i = 0; i <= 20; i++) { //Anem aumentan el comptador i, per anar multiplicant el numeros fins a 20
				
				resultatnum = num * i; 
				
				System.out.println("El resultat de " + num + " * " + i + " es " + resultatnum); //Cada multiplicaci� mostra el resultat
			}
					
		} else {	
			
			System.out.println("Error"); // El n�mero era diferent del que voliem, per tant a donat error
			
			}
		
		teclatnum.close();
		
	}

}
