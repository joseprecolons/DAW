
public class Estudiante extends Persona {
	private int grado;
	private char grupo;
	
	Estudiante() {
		this.grado = 0;
		this.grupo = ' ';
	}
	
	Estudiante(String nombreR, String domicilioR, String horarioR, int gradoR, char grupoR) {
		super(nombreR, domicilioR, horarioR);
		this.grado = gradoR;
		this.grupo = grupoR;
	}
	
	public void estudiar() {
		
	}
	
	public String toString() {
		return "Estudiant----\n"
				+ super.toString()
				+ "Grau = " + this.grado + "\n"
				+ "Grup = " + this.grupo + "\n";
	}
}
