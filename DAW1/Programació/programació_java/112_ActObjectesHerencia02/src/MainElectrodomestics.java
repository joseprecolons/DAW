
public class MainElectrodomestics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestic[] objArray = new Electrodomestic [10];
		
		objArray[0] = new Rentadora(198, 87, "negre", 'B', 35);
		objArray[1] = new Televisio(400, 30, "blanc", 'D', 40, true);
		objArray[2] = new Televisio(230, 15, "negre", 'F', 50, false);
		objArray[3] = new Rentadora(300, 120, "blau", 'B', 19);
		objArray[4] = new Televisio(700, 25, "vermell", 'E', 28, true);
		objArray[5] = new Rentadora(340, 90, "negre", 'A', 36);
		objArray[6] = new Rentadora(299, 76, "gris", 'D', 40);
		objArray[7] = new Televisio(180, 15, "blanc", 'F', 34, false);
		objArray[8] = new Rentadora(500, 230, "vermell", 'A', 27);
		objArray[9] = new Televisio(852, 34, "gris", 'C', 62, true);
		
		for (int i = 0; i < objArray.length; i++) {
			System.out.println(objArray[i]);
		}
		
		int contadorPreu = 0;
		
		for (int i = 0; i < objArray.length; i++) {
			contadorPreu += objArray[i].preuFinal();
		}
		
		System.out.println("Suma del preu de tots els electrodomestics: " + contadorPreu + "€");
	}

}
