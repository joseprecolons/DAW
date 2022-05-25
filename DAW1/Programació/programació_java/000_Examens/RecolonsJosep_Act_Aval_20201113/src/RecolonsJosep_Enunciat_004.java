import java.util.Scanner;
public class RecolonsJosep_Enunciat_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocitat, maximvelocitat;
		int comptadormultesB = 0, comptadormultesP = 0;
		String ciutat;
		Scanner teclatnum = new Scanner (System.in);
		Scanner teclatlletra = new Scanner (System.in);
		
		do {
			System.out.println("B per Barcelona, P per París");
			ciutat = teclatlletra.next();
			if (!ciutat.equals("#")) {
				System.out.println("Introdueix la velocitat a la que anava");
				velocitat = teclatnum.nextInt();
				System.out.println("Introdueix el màxim de velocitat");
				maximvelocitat = teclatnum.nextInt();
			
			if (velocitat < 1 || maximvelocitat < 1) {
				System.out.println("Error");
			} else if (ciutat.equals("#")) {
				}
				if (ciutat.equals("B")) {
					if (velocitat > maximvelocitat) {
						comptadormultesB++;
					}
				} else if (ciutat.equals("P")) {
					if (velocitat > maximvelocitat) {
						comptadormultesP++;
					}
				}
			
			}
			
		} while (!ciutat.equals("#") );

			System.out.println(comptadormultesB + " multes per Barcelona");
			System.out.println(comptadormultesP + " multes per París");
			if (comptadormultesB > comptadormultesP) {
				System.out.println("Conduir per les carreteres de París es més segur que per les de Barcelona");
			} else if (comptadormultesB < comptadormultesP) {
				System.out.println("Conduir per les carreteres de Barcelona es més segur que per les de París");
			} else {
				System.out.println("Tant Barcelona com París, són igual de segures!");
				
			}
		
		teclatnum.close();
		teclatlletra.close();

	}
}
