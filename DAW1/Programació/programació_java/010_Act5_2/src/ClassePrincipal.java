import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num;
		float numgran, numpetit;
		float suma, mitjana;
		int comptador;
		
		Scanner teclatnum = new Scanner (System.in);
		
		comptador = 0;
		suma = 0;
		numgran = 0;
		numpetit = 0;
		
		while (comptador < 5) {
			System.out.println("Introdueix un numero");
			num = teclatnum.nextFloat();
			
			if (comptador == 0); {
				numgran = num;
				numpetit = num;
			}
			
			if (num > numgran) {
				numgran = num;
			} else if (num < numpetit) {
				numpetit = num;
			}
			comptador = (comptador + 1);
			suma = (suma + num);
		}
		
		suma = (suma - numgran - numpetit);
		mitjana = (suma / 3f);
			
		System.out.println("Aquest es el resultat de la suma sense el numero mes gran y el mes petit " + suma);
		System.out.println("Aquesta es la mitja sense el numero mes gran i sense el mes petit " + mitjana);
		
		teclatnum.close();
	}

}
