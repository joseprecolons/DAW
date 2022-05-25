import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		
		n1 = DadesUser("Introdueix el primer número");
		n2 = DadesUser("Introdueix el segon número");
		
		System.out.println("El número més gran és: " + NumGran(n1, n2));
	}
	
	public static int DadesUser(String DemanarNum) {
		String Missatge = DemanarNum;
		int i;
		Scanner teclat = new Scanner(System.in);
		System.out.println(Missatge);
		i = teclat.nextInt();
		return i;
	}
	
	public static int NumGran(int n1, int n2) {
		int resultat = 0;
		if (n1 >= n2) {
			resultat = n1;
		} else {
			resultat = n2;
		}
		return resultat;
	}

}
