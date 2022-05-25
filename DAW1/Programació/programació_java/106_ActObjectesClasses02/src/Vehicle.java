
public class Vehicle {
	private String marca, model, matricula;
	private int any;
	private float consum;
	
	public Vehicle(String marcaR, String modelR, String matriculaR, int anyR, float consumR) {
		this.marca = marcaR;
		this.model = modelR;
		this.matricula = matriculaR;
		this.any = anyR;
		this.consum = consumR;
	}
	
	public String getMarca() {
		return this.marca;
	}
	public String getModel() {
		return this.model;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public int getAny() {
		return this.any;
	}
	public float getConsum() {
		return this.consum;
	}
	
	public void setMarca(String marcaR) {
		this.marca = marcaR;
	}
	public void setModel(String modelR) {
		this.model = modelR;
	}
	public void setMatricula(String matriculaR) {
		this.matricula= matriculaR;
	}
	public void setAny(int anyR) {
		this.any = anyR;
	}
	public void setConsum(float consumR) {
		this.consum = consumR;
	}
	
	public float autonomia(int litres) {
		return (litres/this.consum) * 100;
	}
	
	public String toString() {
		return "La marca d'aquest vehicle és: " + this.marca + "\n"
				+ "El model d'aquest vehicle és: " + this.model + "\n"
				+ "La matricula d'aquest vehicle és: " + this.matricula + "\n"
				+ "L'any de fabricació d'aquest vehicle és: " + this.any + "\n"
				+ "El consum cada 100km d'aquest vehicle en litres és de: " + this.consum + " litres\n";
				
	}
}
