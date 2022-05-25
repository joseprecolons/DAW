
public class Terrestre extends Vehicle{
	private int numRodes;
	
	Terrestre(String modelR, String matriculaR, int numRodesR) {
		super(modelR, matriculaR);
		this.numRodes = numRodesR;
		comprovarMatricula();
	}
	
	public void setNumRodes(int numRodesR) {
		this.numRodes = numRodesR;
	}
	
	public int getNumRodes() {
		return this.numRodes;
	}
	
	public void comprovarMatricula() {
		String matricula = super.getMatricula();
		if (matricula.length() > 7 || matricula.length() < 7) {
			super.setMatricula("1111BBB");
		} else {
			int contadorNumeros = 0, contadorLletres = 0;
			char[] caractersMatricula = new char [matricula.length()];
			for (int i = 0; i < matricula.length(); i++) {
				caractersMatricula[i] = matricula.charAt(i);
			}
			
			for (int i = 0; i < caractersMatricula.length; i++) {
				if (caractersMatricula[i] >= 65 && caractersMatricula[i] <= 90) {
					contadorLletres++;
				} else if (caractersMatricula[i] >= 48 && caractersMatricula[i] <= 57) {
					contadorNumeros++;
				}
			}
			
			if (contadorLletres > 3 || contadorNumeros > 4) {
				super.setMatricula("1111BBB");
			}
		}
	}
	
	public String toString() {
		return super.toString() + 
				"Número de Rodes: " + this.numRodes + "\n";
	}
}
