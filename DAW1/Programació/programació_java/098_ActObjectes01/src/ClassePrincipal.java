import java.util.Scanner;

public class ClassePrincipal {
	public static Scanner teclatText = new Scanner(System.in);
	
	public static void introduirDadesObjectes(String titolObj, Cotxe objCotxe) {
		
		String marca, model, color, matricula = "";
		
		System.out.println("DADES PER " + titolObj.toUpperCase());
		System.out.println("Introdueix la marca del " + titolObj);
		marca = teclatText.nextLine();
		
		System.out.println("Introdueix el model de l'objecte 1");
		model = teclatText.nextLine();
		
		System.out.println("Introdueix el color de l'objecte 1");
		color = teclatText.nextLine();
		
		objCotxe.setMarca(marca);
		objCotxe.setModel(model);
		objCotxe.setColor(color);
		objCotxe.matricular();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclatNum = new Scanner(System.in);
		int numCotxes;
		
		System.out.println("Introdueix el número de cotxes que vols crear");
		numCotxes = teclatNum.nextInt();
		Cotxe[] objArr = new Cotxe[numCotxes];
		for (int i = 0; i < objArr.length; i++) {
			objArr[i] = new Cotxe();
			introduirDadesObjectes("Objecte " + (i+1), objArr[i]);
		}
		
		System.out.println("Visualitzar informació dels objectes");
		for (int i = 0; i < objArr.length; i++) {
			System.out.println("Objecte " + (i+1));
			objArr[i].visualitzar();
		}
		
	}

}