import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia, mes, any;
		
		Scanner teclatnum = new Scanner(System.in);
		
		System.out.print("Introdueix el día: ");
		dia = teclatnum.nextInt();
		System.out.print("Introdueix el mes (número): ");
		mes = teclatnum.nextInt();
		System.out.print("Introdueix l'any: ");
		any = teclatnum.nextInt();
		
		if (mes == 2 && dia == 29 && (any%4) != 0) {
			System.out.println("Data incorrecta");
		} else if (mes == 2 && dia == 29 && (any%100) == 0) {
			System.out.println("Data incorrecta");
		} else if (mes == 2 && dia == 29 && (any%400) == 0) {
			System.out.println("Data correcta");
		} else if (mes == 1 && dia > 31) {
			System.out.println("Data incorrecta");
		} else if (mes == 2 && dia > 29) {
			System.out.println("Data incorrecta");
		} else if (mes == 3 && dia > 31) {
			System.out.println("Data incorrecta");
		} else if (mes == 4 && dia > 30) {
			System.out.println("Data incorrecta");
		} else if (mes == 5 && dia > 31)  {
			System.out.println("Data incorrecta");
		} else if (mes == 6 && dia > 30)  {
			System.out.println("Data incorrecta");
		} else if (mes == 7 && dia > 31)  {
			System.out.println("Data incorrecta");
		} else if (mes == 8 && dia > 31)  {
			System.out.println("Data incorrecta");
		} else if (mes == 9 && dia > 30)  {
			System.out.println("Data incorrecta");
		} else if (mes == 10 && dia > 31)  {
			System.out.println("Data incorrecta");
		} else if (mes == 11 && dia > 30)  {
			System.out.println("Data incorrecta");
		} else if (mes == 12 && dia > 31)  {
			System.out.println("Data incorrecta");
		} else {
			System.out.println("Data correcte");
		}
			
	}

}
