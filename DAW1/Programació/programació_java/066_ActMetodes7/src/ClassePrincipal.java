import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		String DemanarNum = ("Introdueix el número d'elements");
		n1 = DadesUser(DemanarNum);
		int num = n1; 
		if (NumPrimerONo(num) == true) {
			System.out.println("Es primer");
		} else {
			System.out.println("No es primer");
		}
	}
	
	public static int DadesUser(String DemanarNum) {
		String Missatge = DemanarNum;
		int i;
		Scanner teclat = new Scanner(System.in);
		System.out.println(Missatge);
		i = teclat.nextInt();
		return i;
	}
	
	public static boolean NumPrimerONo(int num) {
		boolean primer = true;
		if (num < 2) {
			primer = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					primer = false;	
					break;
				}
			}
		}
		
		return primer;
	}
}