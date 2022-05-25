
public class Persona {
	private String nom = "", dni;
	private int edat = 0;
	private char sexe = ' ';
	private double pes = 0, alsada = 0;
	
	Persona(String nomR, int edatR, char sexeR, double pesR, double alsadaR) {
		this.nom = nomR;
		this.edat = edatR;
		this.sexe = sexeR;
		this.pes = pesR;
		this.alsada = alsadaR;
	}
	
	Persona(String nomR, int edatR, char sexeR) {
		this.nom = nomR;
		this.edat = edatR;
		this.sexe = sexeR;
	}
	
	Persona() {
		
	}
	
	public void setNom(String nomR) {
		this.nom = nomR;
	}
	public void setEdat(int edatR) {
		this.edat = edatR;
	}
	public void setSexe(char sexeR) {
		this.sexe = sexeR;
	}
	public void setPes(double pesR) {
		this.pes = pesR;
	}
	public void setAlsada(double alsadaR) {
		this.alsada = alsadaR;
	}
	
	public String getNom() {
		return this.nom;
	}
	public int getEdat() {
		return this.edat;
	}
	public char getSexe() {
		return this.sexe;
	}
	public double getPes() {
		return this.pes;
	}
	public double getAlsada() {
		return this.alsada;
	}

	public int calcularIMC() {
		if (this.pes / Math.pow(this.alsada, 2) < 20) {
			return -1;
		} else if (this.pes / Math.pow(this.alsada, 2) > 25) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public boolean esMajorDEdat() {
		if (this.edat >= 18) {
			return true;
		} else {
			return false;	
		}
	}
	
	public String generarDni() {
		int num = (int) (Math.random() * 100000000);
		int resultado = num % 23;
		this.dni = String.valueOf((int) (Math.random() * 100000000));
		char[] lletres = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		for (int i = 0; i < lletres.length; i++) {
			if (resultado == i) {
				this.dni += lletres[i];
			}
		}
		return this.dni;
	}
	
	public void comprovarSexe() {
		if (this.sexe != 'H' && this.sexe != 'D') {
			this.sexe = 'H';
		}
	}
	
	public String toString() {
		return "Nom: " + this.nom + "\n"
				+ "Edat: " + this.edat + "\n"
				+ "DNI: " + generarDni() + "\n"
				+ "Sexe: " + this.sexe + "\n"
				+ "Pes: " + this.pes + " kg \n"
				+ "Alçada " + this.alsada + " metres \n";
	}
}




