import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int comptador1 = 1, comptador2 = 1;
		
		Scanner teclatnum = new Scanner(System.in);
		
		System.out.println("Introdueix un n�mero");
		n = teclatnum.nextInt();
		
		while (n >= comptador1) {
			while (n >= comptador2) {
				System.out.print("*");
				comptador2++;
			}
		System.out.println();
		comptador1++;
		comptador2 = 1;
		}
	}

}
