import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, div;
		
		Scanner teclatnum = new Scanner(System.in);
		
		div = 1;
		
		System.out.println("De fins a quin n�mero vols calcular els m�ltiples de 6?");

		num = teclatnum.nextInt(); 
		
		while ( div <= num) {
			if (div% 6 == 0) {
				System.out.println(div + " es multiple de 6");
			}
			div = div + 1;
		}
		
		teclatnum.close();
	}

}
