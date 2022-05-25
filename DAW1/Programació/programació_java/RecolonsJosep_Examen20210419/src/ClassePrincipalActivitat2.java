
public class ClassePrincipalActivitat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle1 = new Rectangle(0, 0, 5, 5);
		Rectangle rectangle2 = new Rectangle(7, 9, 2, 3);
		
		System.out.println("Informació rectangle 1");
		System.out.println("Coordenades: " + rectangle1.imprimirPunt());
		System.out.println("Perímetre: " + rectangle1.getPerimetre());
		System.out.println("Àrea: " + rectangle1.getArea() + "\n");
		
		System.out.println("Informació rectangle 2");
		System.out.println("Coordenades: " + rectangle2.imprimirPunt());
		System.out.println("Perímetre: " + rectangle2.getPerimetre());
		System.out.println("Àrea: " + rectangle2.getArea() + "\n");
		
		rectangle1.setAll(1, 2, 4, 3);
		rectangle2.setAll(2, 3, 9, 7);
		
		System.out.println("Informació rectangle 1 modificat");
		System.out.println("Coordenades: " + rectangle1.imprimirPunt());
		System.out.println("Perímetre: " + rectangle1.getPerimetre());
		System.out.println("Àrea: " + rectangle1.getArea() + "\n");
		
		System.out.println("Informació rectangle 2 modificat");
		System.out.println("Coordenades: " + rectangle2.imprimirPunt());
		System.out.println("Perímetre: " + rectangle2.getPerimetre());
		System.out.println("Àrea: " + rectangle2.getArea() + "\n");
	}

}
