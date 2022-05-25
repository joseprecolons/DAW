public class ClassePrincipal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numposicions = 3;
		boolean sortir = false;
		int m = 0, n = 0, contador = 0, contador2 = 0;
		int matriu1[][] = {{38,182,196}, {17,197,175}, {22,176,160}};
		int array[] = new int [numposicions];
		 
		
		for (int i = 0; i < matriu1.length && sortir == false; i++) {
			contador = 0;
			for (int j = 0, k = 0; k < matriu1[i].length; j++) {
				if (matriu1[i][k] <= matriu1[i][j]) {
					contador++;
				} else {
					j = -1;
					contador = 0;
					k++;
				}
				
				if (contador == numposicions) {
					for (int l = 0; l < array.length; l++) {
						contador2 = 0;
						if (matriu1[i][k] >= matriu1[l][k]) {
							contador2++;
						} else {
							contador2 = 0;
						}
					}
					
					if (contador2 == numposicions) {
						array[i] = k;
						sortir = true;
					}
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		

	}
}