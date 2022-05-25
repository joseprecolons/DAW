import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int m;
		int comptador1 = 1, comptador2 = 1;
		int num1, num2;
		
		Scanner teclatnum = new Scanner(System.in);
		
		System.out.println("Introdueix el primer número");
		n = teclatnum.nextInt();
		System.out.println("Introdueix el segon número");
		m = teclatnum.nextInt();
		
		if (n>m ) {
			num2 = n;
			num1 = m;
		} else {
			num2 = m;
			num1 = n;
		}
		
		while (num1 >= comptador1) {
			while (num2 >= comptador2) {
				System.out.print("*");
				comptador2++;
			}
		System.out.println();
		comptador1++;
		comptador2 = 1;
		}
	}

}