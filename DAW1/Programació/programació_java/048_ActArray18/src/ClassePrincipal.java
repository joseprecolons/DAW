import java.util.Arrays;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 5;
		int n = 8;
		int numeros[] = new int[m];
		int numeros2[] = new int[n];
		
		
		
			for (int i = 0; i < m; i++) { //Valors al primer array
				int x = (int) (100 * Math.random()+1);
				numeros[i] = x;
			}
			
			Arrays.sort(numeros);
			
			for (int i = 0; i < n; i++) { //Valors al segón array
				int x = (int) (100 * Math.random()+1);
				numeros2[i] = x;
			}
			
			Arrays.sort(numeros2);
			
			for (int j = 0; j < m; j++) { //Mostra valors del primer array ordenats
				System.out.print(numeros[j] + " ");
			}
			
			System.out.println();
			
			for (int j = 0; j < n; j++) { //Mostra valors del segón array ordenats
				System.out.print(numeros2[j] + " ");
			}
			
			int numeros3[] = new int[m+n];
			
			for (int p = 0; p < numeros.length; p++) { //Suma el primer array al tercer array
				numeros3[p] = numeros[p];
				}
			
			for (int p = numeros.length, z = 0; p < (numeros.length + numeros2.length); p++, z++) { //Suma el segón array al tercer array
				numeros3[p] = numeros2[z];
				}
			
			Arrays.sort(numeros3);
			
			System.out.println();
			
			for (int j = 0; j < numeros3.length; j++) { //Mostra valors del tercer array ordenats
				System.out.print(numeros3[j] + " ");
			}
		
	}

}