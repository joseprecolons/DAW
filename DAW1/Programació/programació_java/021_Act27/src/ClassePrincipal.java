import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		int num;
		int comptador;
		
		Scanner teclatnum = new Scanner (System.in);
		System.out.println("Introdueix un numero");
		num = teclatnum.nextInt();
		comptador = 2;
		
		if (num > 0) {
			while (num != 1) {
				if (num % comptador == 0) {
					System.out.println(num + "|" + comptador);
					num = num / comptador;
				} else {
					comptador ++;
				}
			}
			
			if (num != 0) {
				System.out.println("1");
			}
			
		} else {
			System.out.println("Error");
		}
		
		teclatnum.close();
	}

}
