
public class Nif 
		extends Dni {
	private String nif;
	public Nif(int dniR) {
		super(dniR);
		this.nif = "" + dni;
		calculLletra(dni);
	}
	
	
	public char calculLletra(int num) {
		int resultado = num % 23;
		char lletra = ' ';
		char[] lletres = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		for (int i = 0; i < lletres.length; i++) {
			if (resultado == i) {
				lletra = lletres[i];
			}
		}
		this.nif += lletra;
		return lletra;
	}
	
	public String toString() {
		return "El Nif complert és: " + this.nif;
	}
}
