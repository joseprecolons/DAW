
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int comptes[];
		comptes = new int[7];
		
		comptes[2] = 5;
		comptes[6] = 26;
		
		for (int i = 0; i < comptes.length; i++) {
			System.out.println("El valor a la posició" + i + " es " + comptes[i]);
		}
			
	}

}
