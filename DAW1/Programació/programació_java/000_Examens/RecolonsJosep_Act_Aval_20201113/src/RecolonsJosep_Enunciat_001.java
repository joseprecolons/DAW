import java.util.*;
public class RecolonsJosep_Enunciat_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2;
		String ordre;
		Scanner teclatnum = new Scanner (System.in);
		Scanner teclatlletra = new Scanner (System.in);
		
		System.out.println("Introdueix el primer número");
		n1 = teclatnum.nextInt();
		System.out.println("Introdueix el segon número");
		n2 = teclatnum.nextInt();
		System.out.println("Introdueix l'ordre en que vols que es mostrin, per Ascendent escriu una A i per Descendent escriu una D");
		ordre = teclatlletra.nextLine();
		
		if (n1 > n2 && ordre.equals("A")) {
			System.out.println(n2 + " -> " + n1);
		} else if (n1 < n2 && ordre.equals("A")) {
			System.out.println(n1 + " -> " + n2);
		} else if ( n1 > n2 && ordre.equals("D")) {
			System.out.println(n1 + " -> " + n2);
		} else if ( n1 < n2 && ordre.equals("D")){
			System.out.println(n2 + " -> " + n1);
		} else {
			System.out.println("Error. Opció incorrecta");
		}
		
		teclatnum.close();
		teclatlletra.close();

	}
}
