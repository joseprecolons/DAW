import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float preucompra;
		float descompte;
		float preuambdte;
		float importiva;
		float preufinal;
		
		Scanner teclatpreu = new Scanner (System.in);
		
		System.out.println("Introdueix el preu de la compra");
		preucompra = teclatpreu.nextFloat();
		
		if (preucompra < 200) {
			
			descompte = (preucompra * 0.15f);
			
		} else {
			
			descompte = 0;
			
		}
		
		preuambdte = (preucompra - descompte);
		importiva = (preuambdte * 0.21f);
		preufinal = (preuambdte + importiva);
		
		System.out.println("El preu final es de " + preufinal);
		
		teclatpreu.close();
	}
}