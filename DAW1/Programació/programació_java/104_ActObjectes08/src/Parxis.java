import java.util.Scanner;

public class Parxis {

	public static Scanner teclatNum = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DauParxis dausPerJugarParxis = new DauParxis();
		int tiradesDau = 3;
		
		for (int i = 0; i < tiradesDau; i++) {
			dausPerJugarParxis.tirar();
			System.out.println("Valor de la tirada número: " + (i+1));
			System.out.println("El valor del dau 1, és de " + dausPerJugarParxis.getTiradaDau1() + "\n"
					+ "El valor del dau 2, és de " + dausPerJugarParxis.getTiradaDau2());
			System.out.println("El resultat de la tirada és " + dausPerJugarParxis.getTirada());
			
			if (dausPerJugarParxis.dobles()) {
				System.out.println("Han sortit dobles, per tant et toca tornar a tirar");
			}
			
			if (dausPerJugarParxis.dobleCinc()) {
				System.out.println("Han sortit dobles, i ha sobre doble 5 per tant et toca tornar a tirar i pots treure 2 fitxes");
			} else if (dausPerJugarParxis.cinc()) {
				System.out.println("Ha sortit un cinc, per tant pots treure una fitxa");
			}
			
			if (dausPerJugarParxis.sumaDausCinc()) {
				System.out.println("La suma dels daus es 5, però no serveix de res");
			}
			
			System.out.println("------");
		}
		
	}

}
