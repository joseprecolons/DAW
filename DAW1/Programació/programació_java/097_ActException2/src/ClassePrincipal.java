
public class ClassePrincipal {

	public static void omplirArrays(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
	}
	
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int numRandom() {
		int num = (int) ((Math.random() * 100 + 1));
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayNumerosParells = new int [5];
		int[] arrayNumerosSenars = new int [5];
		int n1, n2, n3, aux; 
		int contador;
		
		omplirArrays(arrayNumerosParells);
		omplirArrays(arrayNumerosSenars);
		
		do {
			contador = 0;
			try {
				n1 = numRandom();
				n2 = numRandom();
				n3 = (int) ((Math.random() * 5));
				aux = n1/n2;
				
				if (aux%2 == 0 && arrayNumerosParells[n3] == -1) {
					arrayNumerosParells[n3] = aux;
				} else if (aux%2 != 0 && arrayNumerosSenars[n3] == -1) {
					arrayNumerosSenars[n3] = aux;
				}
				
			} catch (ArithmeticException e) {
				System.out.println("No es pot dividir entre 0");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("La posició de l'array ha de ser entre 0 i 4");
			} catch (Exception e) {
				System.out.println("Error general!" + e.getMessage());
			}
			
			for (int i = 0; i < arrayNumerosParells.length; i++) {
				if (arrayNumerosParells[i] == -1) {
					contador++;
				}
				if (arrayNumerosSenars[i] == -1) {
					contador++;
				}
			}
		} while (contador > 0 );
		
		System.out.println("Array de parells: ");
		mostrarArray(arrayNumerosParells);
		System.out.println();
		System.out.println("Array de senars: ");
		mostrarArray(arrayNumerosSenars);
		System.out.println();
		
		System.out.println("Fi del programa");
	}

}
