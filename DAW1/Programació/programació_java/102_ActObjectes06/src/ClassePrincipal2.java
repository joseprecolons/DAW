import java.util.Scanner;

public class ClassePrincipal2 {
	
	public static Scanner teclatNum = new Scanner(System.in);
	
	
	
	public static void crearCursa(Cursa[] objArrayCurses, int pArray) {
		System.out.println("Introdueix el n�mero de voltes que vols per aquesta cursa");
		int nVoltes = teclatNum.nextInt();
		System.out.println("Introdueix el n�mero de metres que vols per aquesta cursa");
		int nMetres = teclatNum.nextInt();
		objArrayCurses[pArray] = new Cursa(nMetres);
		objArrayCurses[pArray].setVoltes(nVoltes);
	}
	
	public static void incrementarVoltes(Cursa[] objArrayCurses) {
		System.out.println("Introdueix quina cursa vols modificar");
		int nCursa = teclatNum.nextInt();
		
		if (objArrayCurses[nCursa] != null && nCursa <= objArrayCurses.length) {
			System.out.println("Introdueix el n�mero de voltes que vols afegir");
			int nVoltes = teclatNum.nextInt();
			
			objArrayCurses[nCursa].incrementarVolta(nVoltes);
		} else {
			System.out.println("No pots incrementar voltes a una cursa que no ha estat creada");
		}
	}
	
	public static void decrementarVoltes(Cursa[] objArrayCurses) {
		System.out.println("Introdueix quina cursa vols modificar");
		int nCursa = teclatNum.nextInt();
		
		if (objArrayCurses[nCursa] != null && nCursa <= objArrayCurses.length) {
			System.out.println("Introdueix el n�mero de voltes que vols treure");
			int nVoltes = teclatNum.nextInt();
			
			objArrayCurses[nCursa].decrementarVolta(nVoltes);
		} else {
			System.out.println("No pots decrementar voltes a una cursa que no ha estat creada");
		}
	}
	
	public static void mostrarInfo(Cursa[] objArrayCurses) {
		System.out.println("Introdueix de quina cursa vols mostrar la informaci�");
		int nCursa = teclatNum.nextInt();
		
		if (objArrayCurses[nCursa] != null && nCursa <= objArrayCurses.length) {
			System.out.println("INFORMACI� DE LA CURSA " + (nCursa+1));
			System.out.println(objArrayCurses[nCursa].toString());
		} else {
			System.out.println("No pots mostrar la informaci� d'una cursa que no ha sigut crada");
		}
	}
	
	public static void mostrarFullInfo(Cursa[] objArrayCurses) {
		boolean mostrar = true;
		
		for (int i = 0; i < objArrayCurses.length; i++) {
			if (objArrayCurses[i] == null) {
				mostrar = false;
				break;
			}
		}
		
		if (mostrar) {
			for (int i = 0; i < objArrayCurses.length; i++) {
				System.out.println("INFORMACI� DE LA CURSA " + (i+1));
				System.out.println(objArrayCurses[i].toString());
			}
			
		} else {
			System.out.println("No pots mostrar tota la informaci� perque hi han curses sense crear");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		boolean sortir = false;
		
		System.out.println("Quantes curses vols crear com a m�xim");
		int numCurses = teclatNum.nextInt();
		
		
		Cursa[] objArrayCurses = new Cursa[numCurses];
		
		while (!sortir) {
			System.out.println("Escull quina opci� vols:\n"
					+ "1. Crear cursa, num voltes i num metres\n"
					+ "2. Incrementar volta, num voltes i num cursa\n"
					+ "3. Decrementar volta, num voltes i num cursa\n"
					+ "4. Mostrar informaci� cursa, num cursa\n"
					+ "5. Mostrat tota la informaci�\n"
					+ "6. Sortir\n");
			int opcio = teclatNum.nextInt();
			
			switch(opcio) {
			
			case 1:
				int pArrayNull = -1;
				for (int i = 0; i < objArrayCurses.length; i++) {
					if (objArrayCurses[i] == null) {
						pArrayNull = i;
						break;
					}
				}
				
				if (pArrayNull == -1) {
					System.out.println("No pots crear m�s curses");
					break;
				} else {
					crearCursa(objArrayCurses, pArrayNull);
				}
				break;
				
			case 2:
				incrementarVoltes(objArrayCurses);
				break;
				
			case 3:
				decrementarVoltes(objArrayCurses);
				break;
				
			case 4:
				mostrarInfo(objArrayCurses);
				break;
				
			case 5:
				mostrarFullInfo(objArrayCurses);
				break;
				
			case 6:
				sortir = true;
				break;
				
			}
			
		}

	}
}
