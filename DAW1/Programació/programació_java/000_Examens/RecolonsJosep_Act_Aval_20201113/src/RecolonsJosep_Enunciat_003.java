import java.util.Scanner;
public class RecolonsJosep_Enunciat_003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, numtest = 0;
		int comptador1 = 0, comptador2 = 0;
		boolean alternar = true;
		boolean sortir = true;
		Scanner teclatnum = new Scanner (System.in);
		do {
			System.out.println("Introdueix un número");
				num = teclatnum.nextInt();
				numtest = num;
				if (numtest != 0) {
					while (sortir == true) {
						
						if (alternar == true) {
							comptador1 = comptador1 + (num%10);
							num = num/10;
							alternar = false;
						} else {
							comptador2 = comptador2 + (num%10);
							num = num/10;
							alternar = true;
						}
						
						if (num == 0) {
							sortir = false;
						}
						
					}
					
					if (comptador1 == comptador2) {
						System.out.println("El " + numtest + " és un número balencejat");
					} else {
						System.out.println("El " + numtest + " no és un número balencejat");
					}
				} else {
					System.out.println("Fi");
				}
		} while (numtest != 0);
				
		teclatnum.close();
		
	}

}
