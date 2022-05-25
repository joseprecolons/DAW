import java.util.Scanner;

public class ProgramaAutonomia {
	static Scanner teclat = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String marcaV1, modelV1, matriculaV1;
		int anyV1; 
		float consumV1;
		Vehicle coche1;
		
		if (args.length == 0) {
			System.out.println("Introdueix la marca");
			marcaV1 = teclat.next();
			System.out.println("Introdueix el model");
			modelV1 = teclat.next();
			System.out.println("Introdueix la matricula");
			matriculaV1 = teclat.next();
			System.out.println("Introdueix l'any de fabricació");
			anyV1 = teclat.nextInt();
			System.out.println("Introdueix el consum de carburant per 100 km");
			consumV1 = teclat.nextFloat();
			coche1 = new Vehicle(marcaV1, modelV1, matriculaV1, anyV1, consumV1);
		} else {
			System.out.println("Introdueix el consum de carburant per 100 km");
			consumV1 = teclat.nextFloat();
			coche1 = new Vehicle(args[0], args[1], args[2], Integer.parseInt(args[3]), consumV1);
		}
		
		int litres;
		System.out.println("Amb cuants litres vols omplir el diposit del vehicle?");
		litres = teclat.nextInt();
		
		System.out.println(coche1);
		System.out.println("Per tant, aquest vehicle amb la quantitat de " + litres + " podrá recórrer " + coche1.autonomia(litres) + "km");
		
	}

}
