
public class ClassePrincipalActivitat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle1 = new Rectangle(0, 0, 5, 5);
		Rectangle rectangle2 = new Rectangle(7, 9, 2, 3);
		
		System.out.println("Informaci� rectangle 1");
		System.out.println("Coordenades: " + rectangle1.imprimirPunt());
		System.out.println("Per�metre: " + rectangle1.getPerimetre());
		System.out.println("�rea: " + rectangle1.getArea() + "\n");
		
		System.out.println("Informaci� rectangle 2");
		System.out.println("Coordenades: " + rectangle2.imprimirPunt());
		System.out.println("Per�metre: " + rectangle2.getPerimetre());
		System.out.println("�rea: " + rectangle2.getArea() + "\n");
		
		rectangle1.setAll(1, 2, 4, 3);
		rectangle2.setAll(2, 3, 9, 7);
		
		System.out.println("Informaci� rectangle 1 modificat");
		System.out.println("Coordenades: " + rectangle1.imprimirPunt());
		System.out.println("Per�metre: " + rectangle1.getPerimetre());
		System.out.println("�rea: " + rectangle1.getArea() + "\n");
		
		System.out.println("Informaci� rectangle 2 modificat");
		System.out.println("Coordenades: " + rectangle2.imprimirPunt());
		System.out.println("Per�metre: " + rectangle2.getPerimetre());
		System.out.println("�rea: " + rectangle2.getArea() + "\n");
	}

}
