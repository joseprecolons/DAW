
public class Gato extends Mascotas {
	private String color;
	private boolean peloLargo;
	
	Gato(String nombreR, String estadoR, int edadR, int fechaNacimientoR, String colorR, boolean peloLargoR) {
		super(nombreR, estadoR, edadR, fechaNacimientoR);
		this.color = colorR;
		this.peloLargo = peloLargoR;
	}
	
	public boolean habla(boolean habla) {
		if (habla) {
			return true;
		} else {
			return false;
		}
	}
	
	public String info() {
		return "Tipo: " + this.getClass().getSimpleName()
				+ " - Nombre: " + super.getNombre();
	}
	
	public String toString() {
		return super.toString() + 
				"Raza: " + this.color + "\n"
				+ "Pulgas: " + this.peloLargo + "\n";
	}
}
