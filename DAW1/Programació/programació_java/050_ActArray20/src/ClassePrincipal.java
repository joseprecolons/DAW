import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int numeros[] = new int[10];
		 int comptp = 0;
		 
		 Scanner teclat = new Scanner(System.in);
		 
		 for (int i = 0; i < numeros.length; i++) {
			 System.out.println("Introdueix el vector " + i);
			 numeros[i] = teclat.nextInt();
		 }
		 
		 for (int i = 0; i < numeros.length; i++) {
			 if (numeros[i] > 0) {
				 comptp++;
			 } 
		 }
		 
		 System.out.println("Quantitat de positius " + comptp);
		 System.out.println("Quantitat de negatius o 0 " + (numeros.length - comptp));
		 
		 if (comptp > numeros.length/2) {
			 System.out.println("Vector de sencers funciona");
		 } else {
			 System.out.println("Vector de sencers no funciona");
		 }
		 
		 teclat.close();
	}
}