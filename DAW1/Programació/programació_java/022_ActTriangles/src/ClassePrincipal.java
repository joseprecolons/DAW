import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int comptadorespais = 0, comptadoresteriscs = 0;
		int espais;
		int esteriscs;
		
		Scanner teclatnum = new Scanner(System.in);
		
		System.out.println("Introdueix un número senar");
		n = teclatnum.nextInt();
		
		if (n%2 == 0) {
			System.out.println("Aquests número no es senar");
		} else {
			esteriscs = 1;
			espais = (n - 1) /2;
			
			while (comptadoresteriscs != n) {
				comptadorespais = 0;
				comptadoresteriscs = 0;
				
				while (comptadorespais != espais) {
					System.out.print(" ");
					comptadorespais++;
				}
				
				while (comptadoresteriscs != esteriscs) {
					System.out.print("*");
					comptadoresteriscs++;
				}
					
				System.out.println();
						
				espais--;
				esteriscs = esteriscs + 2;
			}
		}
		
		teclatnum.close();
	}

}