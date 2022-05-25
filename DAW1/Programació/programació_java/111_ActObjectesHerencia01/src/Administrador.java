
public class Administrador extends Empleado {
	private String puesto;
	
	Administrador() {
		this.puesto = "";
	}
	
	Administrador(String nombreR, String domicilioR, String horarioR, String jefeR, String puestoR) {
		super(nombreR, domicilioR, horarioR, jefeR);
		this.puesto = puestoR;
	}
	
	public void administrar() {
		
	}
	
}
