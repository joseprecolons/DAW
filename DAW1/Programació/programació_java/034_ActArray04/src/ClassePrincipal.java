public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[] = new int[10];
		int num = 2;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = num;
			for (int j = 0; j < i; j++) {
			numeros[i] = numeros[i] * num;
			}
			
		System.out.println("El resultat del valor " + i + " és " + numeros[i]);
		
		}
			
	}

}
