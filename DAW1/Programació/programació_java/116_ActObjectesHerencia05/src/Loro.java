
public class Loro extends Ave{
	private String origen;
	private boolean habla;
	
	Loro(String nombreR, String estadoR, int edadR, int fechaNacimientoR, String picoR, boolean vuelaR, String origenR, boolean hablaR) {
		super(nombreR, estadoR, edadR, fechaNacimientoR, picoR, vuelaR);
		this.origen = origenR;
		this.habla = hablaR;
	}
	
	public boolean saluda(boolean saludaR) {
		if (saludaR) {
			return true;
		} else {
			return false;
		}
	}
	
	public void volar(boolean vuelaR) {
		super.volar(vuelaR);
	}
	
	public String info() {
		return "Tipo: " + this.getClass().getSimpleName()
				+ " - Nombre: " + super.getNombre();
	}
	
	public String toString() {
		return super.toString() + 
				"Origen: " + this.origen + "\n"
				+ "Habla: " + this.habla + "\n";
	}
}
