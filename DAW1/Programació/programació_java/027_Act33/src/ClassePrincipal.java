import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int esteriscs;
		
		Scanner teclatnum = new Scanner(System.in);
		
		System.out.println("Introdueix un número");
		n = teclatnum.nextInt();
		
			esteriscs = 1;
			
			for (int i = 0; i != n;) {
				i = 0;
				
				while (i != esteriscs) {
					System.out.print("*");
					i++;
				}
					
				System.out.println();
				
				esteriscs++;
			}
		
		teclatnum.close();
	}

}