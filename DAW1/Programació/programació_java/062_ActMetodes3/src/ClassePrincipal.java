import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		String DemanarNum = ("Introdueix un número");
		
		i = DadesUser(DemanarNum);
		j = DadesUser(DemanarNum);
		
		System.out.println("El número més petit és: " + NumGran(i, j));
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
		if (n1 <= n2) {
			resultat = n1;
		} else {
			resultat = n2;
		}
		return resultat;
	}

}