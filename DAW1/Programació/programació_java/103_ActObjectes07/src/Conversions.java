import java.util.Scanner;

public class Conversions {
	
	public static Scanner teclatNum = new Scanner(System.in);
	
	public static void logintud() {
		int unitatRebuda;
		int unitatRetornar;
		double num;
		Longitud[] test1 = new Longitud [1];
		
		System.out.println("Escull quin tipus de dade vols introduir:\n"
				+ "1. mm\n"
				+ "2. cm\n"
				+ "3. m\n"
				+ "4. km\n"
				+ "5. in (polzada)\n"
				+ "6. ft (peu)\n"
				+ "7. yd (iarda)\n"
				+ "8. mi (milla)\n"
				+ "9. llegua\n");
		unitatRebuda = teclatNum.nextInt();
		
		System.out.println("Escull quin tipus de dade vols rebre:\n"
				+ "1. mm\n"
				+ "2. cm\n"
				+ "3. m\n"
				+ "4. km\n"
				+ "5. in (polzada)\n"
				+ "6. ft (peu)\n"
				+ "7. yd (iarda)\n"
				+ "8. mi (milla)\n"
				+ "9. llegua\n");
		unitatRetornar = teclatNum.nextInt();
		
		System.out.println("Escriu el valor del que vols fer la conversió");
		num = teclatNum.nextDouble();
		
		test1[0] = new Longitud(num);
		
		switch (unitatRebuda) {
			case 1:
				test1[0].setMm(num);
				System.out.println("Valor inicial: " + num + " mm");
				break;
			case 2:
				System.out.println("Valor inicial: " + num + " cm");
				test1[0].setCm(num);
				break;
			case 3:
				System.out.println("Valor inicial: " + num + " m");
				test1[0].setM(num);
				break;
			case 4: 
				System.out.println("Valor inicial: " + num + " km");
				test1[0].setKm(num);
				break;
			case 5:
				System.out.println("Valor inicial: " + num + " in");
				test1[0].setIn(num);
				break;
			case 6:
				System.out.println("Valor inicial: " + num + " ft");
				test1[0].setFt(num);
				break;
			case 7:
				System.out.println("Valor inicial: " + num + " yd");
				test1[0].setYd(num);
				break;
			case 8:
				System.out.println("Valor inicial: " + num + " mi");
				test1[0].setMi(num);
				break;
			case 9:
				System.out.println("Valor inicial: " + num + " llegües");
				test1[0].setLlegua(num);
				break;
		}
		
		switch (unitatRetornar) {
		case 1:
			System.out.println("Valor final: " + test1[0].getMm() + " mm");
			break;
		case 2:
			System.out.println("Valor final: " + test1[0].getCm() + " cm");
			break;
		case 3:
			System.out.println("Valor final: " + test1[0].getM() + " m");
			break;
		case 4:
			System.out.println("Valor final: " + test1[0].getKm() + " km");
			break;
		case 5:
			System.out.println("Valor final: " + test1[0].getIn() + " in");
			break;
		case 6:
			System.out.println("Valor final: " + test1[0].getFt() + " ft");
			break;
		case 7:
			System.out.println("Valor final: " + test1[0].getYd() + " yd");
			break;
		case 8:
			System.out.println("Valor final: " + test1[0].getMi() + " mi");
			break;
		case 9:
			System.out.println("Valor final: " + test1[0].getLlegua() + " llegües");
			break;
	}
		
		System.out.println();
		
		
	}
	
	public static void massa() {
		int unitatRebuda;
		int unitatRetornar;
		double num;
		Massa[] test1 = new Massa [1];
		
		System.out.println("Escull quin tipus de dade vols introduir:\n"
				+ "1. mg\n"
				+ "2. gr\n"
				+ "3. kg\n"
				+ "4. ton\n"
				+ "5. lb (lliure)\n"
				+ "6. oz (onza)\n");
		unitatRebuda = teclatNum.nextInt();
		
		System.out.println("Escull quin tipus de dade vols rebre:\n"
				+ "1. mg\n"
				+ "2. gr\n"
				+ "3. kg\n"
				+ "4. ton\n"
				+ "5. lb (lliure)\n"
				+ "6. oz (onza)\n");
		unitatRetornar = teclatNum.nextInt();
		
		System.out.println("Escriu el valor del que vols fer la conversió");
		num = teclatNum.nextDouble();
		
		test1[0] = new Massa(num);
		
		switch (unitatRebuda) {
		case 1:
			test1[0].setMg(num);
			System.out.println("Valor inicial: " + num + " mg");
			break;
		case 2:
			System.out.println("Valor inicial: " + num + " gr");
			test1[0].setGr(num);
			break;
		case 3:
			System.out.println("Valor inicial: " + num + " kg");
			test1[0].setKg(num);
			break;
		case 4: 
			System.out.println("Valor inicial: " + num + " ton");
			test1[0].setTon(num);
			break;
		case 5:
			System.out.println("Valor inicial: " + num + " lb");
			test1[0].setLb(num);
			break;
		case 6:
			System.out.println("Valor inicial: " + num + " oz");
			test1[0].setOz(num);
			break;
	}
	
	switch (unitatRetornar) {
	case 1:
		System.out.println("Valor final: " + test1[0].getMg() + " mg");
		break;
	case 2:
		System.out.println("Valor final: " + test1[0].getGr() + " gr");
		break;
	case 3:
		System.out.println("Valor final: " + test1[0].getKg() + " kg");
		break;
	case 4:
		System.out.println("Valor final: " + test1[0].getTon() + " ton");
		break;
	case 5:
		System.out.println("Valor final: " + test1[0].getLb() + " lb");
		break;
	case 6:
		System.out.println("Valor final: " + test1[0].getOz() + " oz");
		break;
	}
	
	System.out.println();
	}
	
	public static void temperatura() {
		int unitatRebuda;
		int unitatRetornar;
		double num;
		Temperatura[] test1 = new Temperatura [1];
		
		System.out.println("Escull quin tipus de dade vols introduir:\n"
				+ "1. celsius\n"
				+ "2. fahrenheits\n"
				+ "3. kelvin\n");
		unitatRebuda = teclatNum.nextInt();
		
		System.out.println("Escull quin tipus de dade vols rebre:\n"
				+ "1. celsius\n"
				+ "2. fahrenheits\n"
				+ "3. kelvin\n");
		unitatRetornar = teclatNum.nextInt();
		
		System.out.println("Escriu el valor del que vols fer la conversió");
		num = teclatNum.nextDouble();
		
		test1[0] = new Temperatura(num);
		
		switch (unitatRebuda) {
		case 1:
			test1[0].setCelsius(num);
			System.out.println("Valor inicial: " + num + " celsius");
			break;
		case 2:
			System.out.println("Valor inicial: " + num + " fahrenheits");
			test1[0].setFarhenheits(num);
			break;
		case 3:
			System.out.println("Valor inicial: " + num + " kelvin");
			test1[0].setKelvins(num);
			break;
	}
	
	switch (unitatRetornar) {
	case 1:
		System.out.println("Valor final: " + test1[0].getCelsius() + " mg");
		break;
	case 2:
		System.out.println("Valor final: " + test1[0].getFarhenheits() + " gr");
		break;
	case 3:
		System.out.println("Valor final: " + test1[0].getKelvins() + " kg");
		break;
	}
	
	System.out.println();
	
	}
	
	public static void temps() {
	
		int unitatRebuda;
		int unitatRetornar;
		double num;
		Temps[] test1 = new Temps [1];
		
		System.out.println("Escull quin tipus de dade vols introduir:\n"
				+ "1. hores\n"
				+ "2. minuts\n"
				+ "3. segons\n"
				+ "4. milisegons\n");
		unitatRebuda = teclatNum.nextInt();
		
		System.out.println("Escull quin tipus de dade vols rebre:\n"
				+ "1. hores\n"
				+ "2. minuts\n"
				+ "3. segons\n"
				+ "4. milisegons\n");
		unitatRetornar = teclatNum.nextInt();
		
		System.out.println("Escriu el valor del que vols fer la conversió");
		num = teclatNum.nextDouble();
		
		test1[0] = new Temps(num);
		
		switch (unitatRebuda) {
		case 1:
			test1[0].setH(num);
			System.out.println("Valor inicial: " + num + " h");
			break;
		case 2:
			System.out.println("Valor inicial: " + num + " min");
			test1[0].setM(num);
			break;
		case 3:
			System.out.println("Valor inicial: " + num + " secs");
			test1[0].setS(num);
			break;
		case 4: 
			System.out.println("Valor inicial: " + num + " ms");
			test1[0].setMS(num);
			break;
	}
	
	switch (unitatRetornar) {
	case 1:
		System.out.println("Valor final: " + test1[0].getH() + " h");
		break;
	case 2:
		System.out.println("Valor final: " + test1[0].getM() + " min");
		break;
	case 3:
		System.out.println("Valor final: " + test1[0].getS() + " secs");
		break;
	case 4:
		System.out.println("Valor final: " + test1[0].getMS() + " ms");
		break;
	}
	
	System.out.println();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sortir = false;
		
		
		while (!sortir) {
			
			System.out.println("Escull quin tipus de conversió vols:\n"
					+ "1. Longitud\n"
					+ "2. Massa\n"
					+ "3. Temperatura\n"
					+ "4. Temps\n"
					+ "5. Sortir\n");
			int opcio = teclatNum.nextInt();
			
			switch(opcio) {
				case 1: 
					logintud();
					break;
					
				case 2:
					massa();
					break;
					
				case 3:
					temperatura();
					break;
		
				case 4:
					temps();
					break;
				case 5:
					sortir = true;
					break;
			}
		}
	}

}
