import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner teclatnum = new Scanner(System.in);
		
		System.out.println("Introdueix un número");
		num = teclatnum.nextInt();
		
		if (num%2 == 0) {
			System.out.println("El número " + num + " és parell!");
		} else {
			System.out.println("El número " + num + " és senar!");
		}
		
		teclatnum.close();
	}

}
