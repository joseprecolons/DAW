import java.io.File;
import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea;
		try {
			File fitxer = new File("lib/file.txt");
			Scanner fileScanner = new Scanner(fitxer);
			while (fileScanner.hasNextLine()) {
				linea = fileScanner.nextLine();
				System.out.println(linea);
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error lectura fitxer");
		}
		
		
		
		
		
	}
}