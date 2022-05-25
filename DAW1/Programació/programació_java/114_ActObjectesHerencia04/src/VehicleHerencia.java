
public class VehicleHerencia {

	private static final boolean REPARAT = false;
	
	private String color, marca;
	private boolean reparat;
	
	VehicleHerencia(String colorR, String marcaR) {
		this.color = colorR;
		this.marca = marcaR;
		this.reparat = REPARAT;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public boolean getReparat() {
		return this.reparat;
	}
	
	public void setColor(String colorR) {
		this.color = colorR;
	}
	
	public void setMarca(String marcaR) {
		this.marca = marcaR;
	}
	
	public void setReparat(boolean reparatR) {
		this.reparat = reparatR;
	}
	
	public void reparar() {
		this.reparat = true;
	}
	
}
