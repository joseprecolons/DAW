
public class ClassePrincipalActivitat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Article[] arrayArticles = new Article[3];
		
		System.out.println("Llista de articles");
		arrayArticles[0] = new Article("Pijama", 10, 21, 50);
		arrayArticles[1] = new Article("Pantaló", 23, 21, 120);
		arrayArticles[2] = new Article("Samarreta", 16, 21, 32);
		
		for (int i = 0; i < arrayArticles.length; i++) {
			System.out.println(arrayArticles[i].imprimirPrenda());
			System.out.println(" PVP: " + arrayArticles[i].getPVP() + "€");
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Llista de articles amb el preu modificat");
		arrayArticles[0].setPreu(12);
		arrayArticles[1].setPreu(25);
		arrayArticles[2].setPreu(18);
		
		for (int i = 0; i < arrayArticles.length; i++) {
			System.out.println(arrayArticles[i].imprimirPrenda());
			System.out.println(" PVP: " + arrayArticles[i].getPVP() + "€");
			System.out.println();
		}
		System.out.println();
		
		arrayArticles[2].setPreu(21);
		System.out.println("Preu de la samarreta amb un descompte: ");
		System.out.println(arrayArticles[2].getPVPDescuento(20) + "€ \n");
		
		System.out.println("Llista de articles amb algunes ventes i algun moviment al magatzem");
		arrayArticles[0].vendre(5);
		arrayArticles[1].emmagatzemar(200);
		arrayArticles[2].emmagatzemar(300);
		
		for (int i = 0; i < arrayArticles.length; i++) {
			System.out.println(arrayArticles[i].imprimirPrenda());
			System.out.println(" PVP: " + arrayArticles[i].getPVP() + "€");
			System.out.println();
		}
	}

}
