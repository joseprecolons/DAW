
public class Empleado extends Persona {
	private String jefe;
	
	Empleado() {
		this.jefe = "-";
	}
	
	Empleado(String nombreR, String domicilioR, String horarioR, String jefeR) {
		super(nombreR, domicilioR, horarioR);
		this.jefe = jefeR;
	}
	
	public void cobrar() {
		
	}
	
	public String toString() {
		return "Empleat----\n"
				+ super.toString()
				+ "Nom del jefe = " + this.jefe + "\n";
	}
}
