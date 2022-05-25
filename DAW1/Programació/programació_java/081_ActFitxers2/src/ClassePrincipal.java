import java.io.File;
import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea;
		int contador = 0;
		try {
			File fitxer = new File("lib/file.txt");
			Scanner fileScanner = new Scanner(fitxer);
			while (fileScanner.hasNextLine()) {
				linea = fileScanner.nextLine();
				System.out.println(linea);
				contador++;
				System.out.println(contador);
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
	}
}