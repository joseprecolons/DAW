import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner teclatnum = new Scanner (System.in);
		
		System.out.println("Introdueix un numero");
		num = teclatnum.nextInt();
		
		if (num < 0) {
			
			System.out.println("El n?mero entrat ?s negatiu");
			
		} else if (num > 0) {
			
			System.out.println("El n?mero entrat ?s positiu");
			
		} else {
			
			System.out.println("El n?mero entrat ?s zero");
		}
		
		teclatnum.close();
	}
}
