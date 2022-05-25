
public class ClassePrincipalActivitat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punt punt1 = new Punt(5,0);
		Punt punt2 = new Punt(10,10);
		Punt punt3 = new Punt(-3,7);
		
		System.out.println("Els tres primer punts");
		System.out.println(punt1.imprimirPunt());
		System.out.println(punt2.imprimirPunt());
		System.out.println(punt3.imprimirPunt() + "\n");
		
		punt1.setXY(7, 4);
		punt2.setXY(8, 0);
		punt3.setXY(-1, 5);
		
		System.out.println("Els tres primer punts modificats");
		System.out.println(punt1.imprimirPunt());
		System.out.println(punt2.imprimirPunt());
		System.out.println(punt3.imprimirPunt() + "\n");
		
		Punt punt4 = new Punt(20,20);
		
		System.out.println("El quart punt");
		System.out.println(punt4.imprimirPunt() + "\n");
		
		punt4.setXY(5, 5);
		punt4.desplaza(2, 2);
		
		System.out.println("El quart punt modificat y despleçat");
		System.out.println(punt4.imprimirPunt() + "\n");
		
		System.out.println("La distància entre el punt1 i el punt2");
		System.out.println(punt1.distancia(punt2));
	}

}
