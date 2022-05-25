import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, num4, suma, resta;
		Scanner teclatnum = new Scanner(System.in);
		
		System.out.println("Introdueix el primer número");
		num1 = teclatnum.nextInt();
		System.out.println("Introdueix el segon número");
		num2 = teclatnum.nextInt();
		System.out.println("Introdueix el tercer número");
		num3 = teclatnum.nextInt();
		System.out.println("Introdueix el quart número");
		num4 = teclatnum.nextInt();
		
		suma = (num1 + num2);
		resta = (num3 - num4);
		
		if (suma > resta) {
			System.out.println("La suma es superior a la resta!");
		} else if (resta > suma){
			System.out.println("La resta es superior a la suma!");
		} else {
			System.out.println("El resultat de les dues operacions es igual");
		}
		
		teclatnum.close();
	}

}
