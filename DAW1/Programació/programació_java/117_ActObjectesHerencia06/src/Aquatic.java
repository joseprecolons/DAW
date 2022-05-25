
public class Aquatic extends Vehicle{

	private int eslora;
	
	Aquatic(String matriculaR, String modelR, int esloraR) {
		super(matriculaR, modelR);
		this.eslora = esloraR;
		comprovarMatricula();
	}
	
	public void comprovarMatricula() {
		String matricula = super.getMatricula();
		if (matricula.length() < 3 || matricula.length() > 10) {
			super.setMatricula("BBBBBBB");
		} else {
			int contadorLletres = 0;
			char[] caractersMatricula = new char [matricula.length()];
			for (int i = 0; i < matricula.length(); i++) {
				caractersMatricula[i] = matricula.charAt(i);
			}
			
			for (int i = 0; i < caractersMatricula.length; i++) {
				if (caractersMatricula[i] >= 65 && caractersMatricula[i] <= 90) {
					contadorLletres++;
				}
			}
			
			if(contadorLletres != caractersMatricula.length) {
				super.setMatricula("BBBBBBB");
			}
		}
	}
	
	public String toString() {
		return super.toString() + 
				"Metres de eslora: " + this.eslora + "\n";
	}
}
