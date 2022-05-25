
public class Ave extends Mascotas{
	private String pico;
	private boolean vuela;
	
	Ave(String nombreR, String estadoR, int edadR, int fechaNacimientoR, String picoR, boolean vuelaR) {
		super(nombreR, estadoR, edadR, fechaNacimientoR);
		this.pico = picoR;
		this.vuela = vuelaR;
	}
	
	public void volar(boolean vuelaR) {
		if (vuelaR) {
			this.vuela = vuelaR;
		}
	}
	
	public String toString() {
		return super.toString() 
				+ "Pico: " + this.pico + "\n"
				+ "Vuela: " + this.vuela + "\n";
	}
}
