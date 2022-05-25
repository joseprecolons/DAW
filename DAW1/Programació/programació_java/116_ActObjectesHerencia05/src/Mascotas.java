
public class Mascotas {
	private String nombre, estado;
	private int edad, fechaNacimiento;
	
	Mascotas(String nombreR, String estadoR, int edadR, int fechaNacimientoR) {
		this.nombre = nombreR;
		this.estado = estadoR;
		this.edad = edadR;
		this.fechaNacimiento = fechaNacimientoR;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int cumpleaños() {
		return this.fechaNacimiento;
	}
	
	public boolean morir(boolean muerto) {
		if (muerto) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean habla(boolean habla) {
		if (habla) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Nom: " + this.nombre + "\n"
				+ "Estado: " + this.estado + "\n"
				+ "Edad: " + this.edad + "\n"
				+ "Fecha de nacimiento: " + this.fechaNacimiento + "\n";
	}
}
