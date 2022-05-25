import java.io.FileWriter;
public class ClassePrincipal {

	public static void omplirArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
	}
	
	public static void arrayAText(int array[], String nomFitxer) {
		FileWriter fitxer = null;
		try {
			fitxer = new FileWriter(nomFitxer);
			for (int i = 0; i < array.length; i++) {
				fitxer.write(array[i] + " | ");
			
			}
			fitxer.close();
		} catch (Exception e) {
			System.out.println("Error inesperat. " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/file.txt";
		int [] arrayNumeros = new int [10];
		omplirArray(arrayNumeros);
		arrayAText(arrayNumeros, nomFitxer);
		
	}

}
