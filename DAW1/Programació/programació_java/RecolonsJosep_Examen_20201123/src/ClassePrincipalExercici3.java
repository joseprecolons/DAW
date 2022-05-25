import java.util.*;
public class ClassePrincipalExercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int numeros[] = new int[4];
		 Scanner teclatnum = new Scanner(System.in);
		 Scanner teclatlletra = new Scanner(System.in);
		 
		 for (int i = 0; i > numeros.length; i++) {
			 System.out.println("Escriu el numero de la carta " + (i+1));
			 numeros[i] = teclatnum.nextInt();
			 
		 }
		 teclatnum.close();
	}

}
