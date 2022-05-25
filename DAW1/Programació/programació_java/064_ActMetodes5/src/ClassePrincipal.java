import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String DemanarNum = ("Introdueix el número d'elements");
		i = DadesUser(DemanarNum);
		int ArrayAOmplir[] = new int [i]; 
		
		FOmplirArray(ArrayAOmplir);
		
		System.out.println();
		System.out.println("El número més gran és: " + NumMaxArray(ArrayAOmplir));
	}
	
	public static int DadesUser(String DemanarNum) {
		String Missatge = DemanarNum;
		int i;
		Scanner teclat = new Scanner(System.in);
		System.out.println(Missatge);
		i = teclat.nextInt();
		return i;
	}
	
	public static void FOmplirArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 101);
			System.out.print(array[i] + " ");
		}
	}
	
	
	public static int NumMaxArray(int array[]) {
		int resultat = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > resultat) {
				resultat = array[i];
			}
		}
		return resultat;
	}
}