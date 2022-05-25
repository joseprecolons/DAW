
public class Aeri extends Vehicle{
	private int seients;
	
	Aeri(String matriculaR, String modelR, int seientsR) {
		super(matriculaR, modelR);
		this.seients = seientsR;
		comprovarMatricula();
	}
	
	public void setSeients(int seientsR) {
		this.seients = seientsR;
	}
	
	public int getSeients() {
		return this.seients;
	}
	
	public void comprovarMatricula() {
		String matricula = super.getMatricula();
		if (matricula.length() > 10 || matricula.length() < 10) {
			super.setMatricula("BBBB111111");
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
			
			if (contadorLletres > 4 || contadorNumeros > 6) {
				super.setMatricula("BBBB111111");
			}
		}
	}
	
	public String toString() {
		return super.toString() + 
				"Número de Seients: " + this.seients + "\n";
	}
}
