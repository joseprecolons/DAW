import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		i = DadesUser();
		j = DadesUser();
		
		if (i <= j) {
			System.out.println();
			Ascendent(i, j);
		} else {
			System.out.println();
			Descendent(i, j);
		}
	}
	
	public static int DadesUser() {
		int i;
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix un número");
		i = teclat.nextInt();
		return i;
	}
	
	public static void Ascendent(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static void Descendent(int n1, int n2) {
		for (int i = n1; i >= n2; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	

}
