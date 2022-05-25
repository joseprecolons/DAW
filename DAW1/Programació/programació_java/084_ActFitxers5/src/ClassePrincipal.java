import java.io.File;
import java.io.FileWriter;
public class ClassePrincipal {

	public static boolean esPrimer(int num) {
		boolean primer = true;
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				primer = false;
				break;
			}
		} 
		
		return primer;
	}
	
	public static void lecturaFitxer(String nomFitxer) {
		try {
			FileWriter fitxerSortida = new FileWriter(nomFitxer);
			for (int i = 0, j = 2; i < 100; j++) {
				if (esPrimer(j)) {
					fitxerSortida.write(j + ",");
					i++;
				}
			}
			fitxerSortida.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "lib/fileOut.txt";
		lecturaFitxer(nomFitxer);
		
	}
}