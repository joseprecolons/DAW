
public class Canario extends Ave{
	private String color;
	private boolean canta;
	
	Canario(String nombreR, String estadoR, int edadR, int fechaNacimientoR, String picoR, boolean vuelaR, String colorR, boolean cantaR) {
		super(nombreR, estadoR, edadR, fechaNacimientoR, picoR, vuelaR);
		this.color = colorR;
		this.canta = cantaR;
	}
	
	public boolean habla(boolean hablaR) {
		if (hablaR) {
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
				"Color: " + this.color + "\n"
				+ "Canta: " + this.canta + "\n";
	}
}
