package RecolonsJosep;

public class ProvaBiblioteca {

	private static void missatgeAfegir(int error, Fitxa fitxaRebuda) {
		System.out.println("Afegir l'objecte " + fitxaRebuda);
		if (error == -1) System.out.println("  Afegir.");
		else if(error == -2) System.out.println(" No afegit per ser null.");
		else if(error == -3) System.out.println(" No afegit per ser manca d'espai.");
		else System.out.println(" Referència " + fitxaRebuda.getReferencia() + " existent a la posició " + error);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Biblioteca biblioteca = new Biblioteca(50);
		Revista revista = new Revista ("MC001", "Mundo Científico", (short) 2005, (short) 1);
		Obra obra = new Obra ("EQ001", "El Quixot", "Miguel de Cervantes", (short) 1000);
		Volum volum1 = new Volum ("EC001", "Enciclopèdia Catalana", "Varis", (short) 573, (short) 1);
		Volum volum2 = new Volum ("EC002", "Enciclopèdia Catalana", "Varis", (short) 602, (short) 2);
		
		Fitxa fitxa;
		
		System.out.println("La biblioteca té una capacitat per a " + biblioteca.capacitat() + " exemplars");
		System.out.println("La biblioteca té " + biblioteca.nreElements() + " exemplars");

		missatgeAfegir(biblioteca.afegir(revista), revista);
		missatgeAfegir(biblioteca.afegir(obra), obra);
		missatgeAfegir(biblioteca.afegir(volum1), volum1);
		missatgeAfegir(biblioteca.afegir(volum2), volum2);
		
		System.out.println("\nLa biblioteca té " + biblioteca.nreElements() + " exemplars");
		
		System.out.println("\nAnem a extreure la fitxa de referència 'EC001'");
		fitxa = biblioteca.extreure("EC001");
		
		if (fitxa == null) System.out.println("No s'ha trobat");
		else {
			System.out.println("S'ha trobat i s'ha extret. Vegem-lo:");
			fitxa.visualitzar();
		}
		
		System.out.println("\nLa biblioteca té " + biblioteca.nreElements() + " exemplars.\n");
		
		fitxa = new Volum("MC001", "El Quixot", "Miguel de Cervantes", (short) 500, (short) 1);
		missatgeAfegir(biblioteca.afegir(fitxa), fitxa);
		System.out.println();
		biblioteca.visualitzar();
	}

}
