
public class Profesor extends Empleado {
	private String carrera;
	
	Profesor() {
		this.carrera = "";
	}
	
	Profesor(String nombreR, String domicilioR, String horarioR, String jefeR, String carreraR) {
		super(nombreR, domicilioR, horarioR, jefeR);
		this.carrera = carreraR;
	}
	
	public void administrar() {
		
	}
	
}