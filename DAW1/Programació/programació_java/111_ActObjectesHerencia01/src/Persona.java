
public class Persona {
	private String nombre, domicilio, horario;
	
	Persona() {
		this.nombre = "-";
		this.domicilio = "-";
		this.horario = "-";
	}
	
	Persona(String nombreR, String domicilioR, String horarioR) {
		this.nombre = nombreR;
		this.domicilio = domicilioR;
		this.horario = horarioR;
	}
	
	public void asistir() {
		
	}
	
	public String toString() {
		return "Persona----\n"
				+ "Nom = " + this.nombre + "\n"
				+ "Domicili = " + this.domicilio + "\n"
				+ "Horari = " + this.horario + "\n";
	}
}
