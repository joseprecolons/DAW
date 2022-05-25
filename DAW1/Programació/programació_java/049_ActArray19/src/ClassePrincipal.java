public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String paraula = "programacio";
		 char cadenacaracters[] = {'p', 'r', 'n', 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'c', 'i', 'o', 'u', 'u', 'g'};
		 boolean trobada = false;
		 int pos1 = -1, pos2 = -1;
		 
		 for (int i = 0, j = 0; i < cadenacaracters.length; i++) {
			 if (paraula.charAt(j) == cadenacaracters[i]) {
				 j++;
				 if (pos1 == -1) {
					 pos1 = i;
				 }
			 } else if (paraula.charAt(j) != cadenacaracters[i]) {
				 j = 0;
				 pos1 = -1;
			 }
			 if (j == paraula.length() - 1) {
				 pos2 = pos1 + j;
				 trobada = true;
				 break;
			 }
		 }
		 
		 if (trobada) {
			 System.out.println(pos1+ " " + pos2);
		 } else {
			 System.out.println("");
		 }
	}
}
