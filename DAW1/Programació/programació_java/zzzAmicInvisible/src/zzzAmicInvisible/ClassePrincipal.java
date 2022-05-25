package zzzAmicInvisible;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Josep Recolons i Pol Pavon
		
		
		int numeros[] = new int [21];
		int numerosComprovacio[] = new int [21]; 
		String noms[] = {"Daniel Barbancho Montero", "Xavier Bermudez Molgo", "Joel Berrocal Urbina", "Marc Bouzas Guadalupe", "Nil Carvajal Playa", 
				"Quim Comas Navarro", "Aleix Deumal Tripiana", "Pau Domenech Pacheco", "Gerard Fernandez Requena", "Sergio Garcia Ruiz", "Adrian Gil Moreno", 
				"Oriol Pacheco Acevedo", "Marcel Josep Pauli Lara", "Joan Pardo", "Pol Pavon Pozo", "Gerard Pedrero Carbonell", "Marti Puig Martin", 
				"Ruben Recolons Reig", "Josep Recolons Rodriguez", "Pau Riera Mas", "Carlos Abel Silva Teixeira"};
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.floor(Math.random() * 22);
			for (int j = 0; j < numerosComprovacio.length; j++) {
				if (numerosComprovacio[j] == numeros[i] || numeros[i] -1 == i) {
					i--;
					break;
				} else if (numerosComprovacio[j] != numeros[i] && j == i) {
					numerosComprovacio[j] = numeros[i];
				}
			}
		}
		
		for (int i = 0; i < noms.length; i++) {
			System.out.println(noms[i] + " -- " + noms[numeros[i] -1]);
		}

	}
}