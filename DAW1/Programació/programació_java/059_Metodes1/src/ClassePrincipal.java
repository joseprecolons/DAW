
public class ClassePrincipal {
	public static void main(String[] args) {
		
		System.out.println("1. ");
		System.out.println("Línia abans de la crida.....");
		Salutacio();
		System.out.println("Línia despres de la crida.....");
		System.out.println("");
		
		
		System.out.println("2. ");
		System.out.print("La suma dels dos números és: ");
		Suma(2,5);
		
		
		System.out.println("");
		System.out.println("3. ");
		System.out.print("El resultat de la taula del 10 és: ");
		System.out.println(Taula10());
		
		
		System.out.println("");
		System.out.println("4. ");
		System.out.print("El resultat de la divisió és: ");
		System.out.println(Dividir(5,5));
	}
	
	
	//1. No rep cap paràmetre ni retorna cap valor
	public static void Salutacio() {
		System.out.println("Hola");
	}
	
	//2. Si rep paràmetres i no retorna cap valor
	public static void Suma(int i, int j) {
		int resultat;
		resultat = i + j;
		System.out.println(resultat);
		
	}
	
	//3. No rep cap paràmetre i si retorna valor
	public static int Taula10() {
		int resultat = 0;
		for (int i = 0; i < 10; i++) {
			resultat = resultat + (i*10);
		}
		return resultat;
	}
	
	//4. Si rep paràmetres i si retorna valor
	public static double Dividir(int i, int j) {
		double resultat = 0;
		if (j == 0) {
			System.out.println("Error. No es pot dividir entre 0");
			resultat = 0;
		} else {
			resultat = i/j;
		}
		return resultat;
	}
	
	
}
