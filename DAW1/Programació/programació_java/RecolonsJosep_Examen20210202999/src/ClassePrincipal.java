
public class ClassePrincipal {

	public static int numRandom() {
		int numGran = 1000;
		int numPetit = 0;
		
		return (int) (Math.random() * (numGran+1 - numPetit) + numPetit);
	}
	
	public static void omplirMatriu(int[][] matriu) {
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
					matriu[i][j] = numRandom();
			}
		}
	}
	
	public static int posNumGran (int[][] matriu, int [] arrayPos) {
		int num = -1;
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (num < matriu[i][j]) {
					arrayPos[0] = i;
					arrayPos[1] = j;
					num = matriu[i][j];
				}
			}
		}
		
		return num;
	}
	
	public static int posNumPetit (int[][] matriu, int [] arrayPos) {
		int num = 1001;
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (num > matriu[i][j]) {
					arrayPos[0] = i;
					arrayPos[1] = j;
					num = matriu[i][j];
				}
			}
		}
		
		return num;
	}
	
	public static int comptaValorsMesGransDe500 (int[][] matriu) {
		int num = 0;
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (matriu[i][j] > 500) {
					num++;
				}
			}
		}
		
		return num;
	}
	
	public static int comptaValorsMesPetitsDe500 (int[][] matriu) {
		int num = 0;
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (matriu[i][j] < 500) {
					num++;
				}
			}
		}
		
		return num;
	}
	
	public static int sumaValorsMesGransDe500 (int[][] matriu) {
		int num = 0;
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (matriu[i][j] > 500) {
					num = num + matriu[i][j];
				}
			}
		}
		
		return num;
	}
	
	public static int sumaValorsMesPetitsDe500 (int[][] matriu) {
		int num = 0;
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (matriu[i][j] < 500) {
					num = num + matriu[i][j];
				}
			}
		}
		
		return num;
	}
	
	public static double mitjanaValorsMesGransDe500 (int[][] matriu) {
		int num = 0;
		int comptador = 0;
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (matriu[i][j] > 500) {
					num = num + matriu[i][j];
					comptador++;
				}
			}
		}
		
		num = num / comptador;
		
		return num;
	}
	
	public static double mitjanaValorsMesPetitsDe500 (int[][] matriu) {
		int num = 0;
		int comptador = 0;
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (matriu[i][j] < 500) {
					num = num + matriu[i][j];
					comptador++;
				}
			}
		}
		
		num = num / comptador;
		
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriuNumeros = new int [6][15];
		int[] posNumMesGran = new int [2];	
		int[] posNumMesPetit = new int [2];	
		omplirMatriu(matriuNumeros);
		posNumGran(matriuNumeros, posNumMesGran);
		posNumPetit(matriuNumeros, posNumMesPetit);
		comptaValorsMesGransDe500(matriuNumeros);
				
		System.out.println("La posici� del n�mero m�s gran es troba a la fila " + posNumMesGran[0] + " i la columna " + posNumMesGran[1]);
		System.out.println("El n�mero m�s gran es el " + posNumGran(matriuNumeros, posNumMesGran));
		
		System.out.println("La posici� del n�mero m�s petit es troba a la fila " + posNumMesPetit[0] + " i la columna " + posNumMesPetit[1]);
		System.out.println("El n�mero m�s petit es el " + posNumPetit(matriuNumeros, posNumMesPetit));
		
		System.out.println("La quantitat de n�meros majors a 500 �s de " + comptaValorsMesGransDe500(matriuNumeros));
		System.out.println("La quantitat de n�meros menors a 500 �s de " + comptaValorsMesPetitsDe500(matriuNumeros));
		
		System.out.println("La suma dels n�meros majors a 500 �s de " + sumaValorsMesGransDe500(matriuNumeros));
		System.out.println("La suma dels n�meros menors a 500 �s de " + sumaValorsMesPetitsDe500(matriuNumeros));
		
		System.out.println("La mitjana dels n�meros majors a 500 �s de " + mitjanaValorsMesGransDe500(matriuNumeros));
		System.out.println("La mitjana dels n�meros menors a 500 �s de " + mitjanaValorsMesPetitsDe500(matriuNumeros));
	}

}
