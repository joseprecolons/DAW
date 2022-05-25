public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int numeros1[][] = new int[5][5];
		 int numeros2[][] = new int[5][5];
		 
		 for (int i = 0; i < numeros1.length; i++) {
			 for (int j = 0; j < numeros1[i].length; j++) {
				 numeros1[i][j] = i*2;
			 } 
		 }
		 
		 for (int i = 0; i < numeros2.length; i++) {
			 for (int j = 0; j < numeros2[i].length; j++) {
				 numeros2[i][j] = (j+i) * 2;
			 } 
		 }
		 
		 
		 for (int i = 0; i < numeros1.length; i++) {
			 for (int j = 0; j < numeros1.length; j++) {
				 System.out.print("  ");
				 System.out.print(numeros1[i][j]);
				 System.out.print("  ");
			 }
			 System.out.println("");
		 }
		 
		 System.out.println("");
		 
		 for (int i = 0; i < numeros2.length; i++) {
			 for (int j = 0; j < numeros2.length; j++) {
				 System.out.print("    ");
				 System.out.print(numeros2[i][j]);
				 System.out.print("    ");
			 } 
			 System.out.println("");
		 }

	}
}