import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String DemanarNum = ("Introdueix el número d'elements");
		i = DadesUser(DemanarNum);
		int num = i; 
		
		System.out.println("El doble de " + num + " és: " + NumDoble(num));
	}
	
	public static int DadesUser(String DemanarNum) {
		String Missatge = DemanarNum;
		int i;
		Scanner teclat = new Scanner(System.in);
		System.out.println(Missatge);
		i = teclat.nextInt();
		return i;
	}
	
	public static int NumDoble(int num) {
		int resultat = 0;
		resultat = num * 2;
		
		return resultat;
	}
}