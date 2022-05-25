
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int qMetres = 200;
		
		Cursa[] objArrayCurses = new Cursa[3];
		for (int i = 0; i < objArrayCurses.length; i++) {
			objArrayCurses[i] = new Cursa(qMetres);
			qMetres = qMetres * 2;
		}
		
		for (int i = 0; i < objArrayCurses.length; i++) {
			int voltes = (int) ((Math.random() * 50) + 1);
			System.out.println("Número de voltes per a la cursa " + (i+1) + " : " + voltes);
			objArrayCurses[i].setVoltes(voltes);
			System.out.println("El número de metres recorreguts es de " + objArrayCurses[i].distanciaRecorreguda() + "\n");
		}
	}

}
