public class ClassePrincipal {
	
	public static int numRandom() {
		int numGran = 150;
		int numPetit = 0;
		
		return (int) (Math.random() * (numGran+1 - numPetit) + numPetit);
	}
	

	public static void omplirMatriu(int[][] matriu) {
		
		for (int i = 0; i < matriu.length - 1; i++) {
			for (int j = 0; j < matriu[i].length - 1; j++) {
					matriu[i][j] = numRandom();
			}
		}
	}
	
	public static void sumaFilesMatriu(int[][] matriu) {
		
		for (int i = 0; i < matriu.length - 1; i++) {
			for (int j = 0; j < matriu[i].length - 1; j++) {
				matriu[i][matriu[i].length-1] = matriu[i][matriu[i].length-1] + matriu[i][j];
			}
		}
	}
	
	public static void sumaColumnesMatriu(int[][] matriu) {
		
		for (int i = 0; i < matriu.length - 1; i++) {
			for (int j = 0; j < matriu[i].length - 1; j++) {
				matriu[matriu.length-1][j] = matriu[matriu.length-1][j] + matriu[i][j];
			}
		}
	}
	
	public static void sumaTotal(int[][] matriu) {
		
		for (int i = 0; i < matriu.length - 1; i++) {
			matriu[matriu.length-1][matriu[i].length-1] = matriu[matriu.length-1][matriu[i].length-1] + matriu[i][matriu[i].length-1];
		}
		
		for (int i = 0; i < matriu[0].length - 1; i++) {
			matriu[matriu.length-1][matriu[0].length-1] = matriu[matriu.length-1][matriu[0].length-1] + matriu[matriu.length-1][i];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriuNumeros = new int [5][7];
		
		omplirMatriu(matriuNumeros);
		sumaFilesMatriu(matriuNumeros);
		sumaColumnesMatriu(matriuNumeros);
		sumaTotal(matriuNumeros);
		
		for (int i = 0; i < matriuNumeros.length; i++) {
			for (int j = 0; j < matriuNumeros[i].length; j++) {
				System.out.print(" | " + matriuNumeros[i][j] + " | ");
			}
			System.out.println();
		}
		
	}

}