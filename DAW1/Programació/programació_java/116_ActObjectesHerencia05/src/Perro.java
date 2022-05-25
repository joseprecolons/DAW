
public class Perro extends Mascotas{
	private String raza;
	private boolean pulgas;
	
	Perro(String nombreR, String estadoR, int edadR, int fechaNacimientoR, String razaR, boolean pulgasR) {
		super(nombreR, estadoR, edadR, fechaNacimientoR);
		this.raza = razaR;
		this.pulgas = pulgasR;
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
				"Raza: " + this.raza + "\n"
				+ "Pulgas: " + this.pulgas + "\n";
	}
}
