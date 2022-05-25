import java.util.*;
public class ClassePrincipalExercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner (System.in);
		Scanner teclattext = new Scanner (System.in);
		int numerodetreballadors = 100;
		String nom;
		Double souactual;
		Double costaugments = (double) 0;
		Double souaugmentat = (double) 0;
		int tramA = 0, tramB = 0, tramC = 0, tramD = 0;
		
		for (int i = 0; i < numerodetreballadors; i++) {
			System.out.println("Escriu el nom del treballador");
			nom = teclattext.nextLine();
			do {
				System.out.println("Introdueix el sou actual d'aquest traballador");
				souactual = teclat.nextDouble();
				if (souactual < 100) {
					System.out.println("Error al introduir el sou, introdueix-lo una altra vegada");
				}
			} while (souactual < 100);
			
			
			if (souactual <= 300) {
				souaugmentat = souactual + (souactual * 0.07);
				costaugments = costaugments + (souactual * 0.07);
				System.out.println("El nou sou pel treballador " + nom + "es de " + souaugmentat + "€");
			} else if (souactual <= 600) {
				souaugmentat = souactual + (souactual * 0.05);
				costaugments = costaugments + (souactual * 0.05);
				System.out.println("El nou sou pel treballador " + nom + "es de " + souaugmentat + "€");
			} else if (souactual <= 1000) {
				souaugmentat = souactual + (souactual * 0.03);
				costaugments = costaugments + (souactual * 0.03);
				System.out.println("El nou sou pel treballador " + nom + "es de " + souaugmentat + "€");
			} else if (souactual > 1000) {
				souaugmentat = souactual + (souactual * 0.01);
				costaugments = costaugments + (souactual * 0.01);
				System.out.println("El nou sou pel treballador " + nom + "es de " + souaugmentat + "€");
			}
			
			if (souaugmentat <= 300) {
				System.out.println("Pertany al tram A");
				tramA++;
			} else if (souaugmentat <= 600) {
				System.out.println("Pertany al tram B");
				tramB++;
			} else if (souaugmentat <= 1000) {
				System.out.println("Pertany al tram C");
				tramC++;
			} else if (souaugmentat > 1000) {
				System.out.println("Pertany al tram D");
				tramD++;
			}
		}
		
		System.out.println("Al tram A i pertanyen " + tramA + " treballadors");
		System.out.println("Al tram B i pertanyen " + tramB + " treballadors");
		System.out.println("Al tram C i pertanyen " + tramC + " treballadors");
		System.out.println("Al tram D i pertanyen " + tramD + " treballadors");
		System.out.println("El cost total dels augments es de " + costaugments + "€");
		
		teclattext.close();
		teclat.close();
	}

}
