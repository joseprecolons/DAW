import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, comptador;
		
		Scanner teclatnum = new Scanner(System.in);
		
		System.out.println("Introdueix un n?mero");
		
		num = teclatnum.nextInt();
		
		comptador = num;
		
		if (num != 0) {
			while (comptador > 0) {
				comptador = (comptador - 2);
			}
			
			if (comptador == 0) {
				System.out.println("El nombre " + num + " ?s parell!");
			} else {
				System.out.println("El nombre " + num + " ?s senar!");
			}
		} else {
			System.out.println("El nombre " + num + " no es ni parell ni senar.");
		}
		
		teclatnum.close();
	}

}
