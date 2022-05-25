import java.util.Scanner;

public class ClassePrincipal {
	
	public static int demanarNums(String demanarDades) {
		int num;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println(demanarDades);
		num = teclat.nextInt();
		
		return num;
	}
	
	public static int numRandom() {
		int numGran = demanarNums("Escriu el primer número");
		int numPetit = demanarNums("Escriu el segon número");
		int aux;
		
		if (numGran < numPetit) {
			aux = numGran;
			numGran = numPetit;
			numPetit = aux;
		}
		return (int) (Math.random() * (numGran+1 - numPetit) + numPetit);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("El nombre aleatori es " + numRandom());
		
	}

}