
public class Moto extends Terrestre{
	private String color;
	
	Moto(String modelR, String matriculaR, int numRodesR, String colorR) {
		super(modelR, matriculaR, numRodesR);
		this.color = colorR;
	}
	
	public void setColor(String colorR) {
		this.color = colorR;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String toString() {
		return super.toString() + 
				"Color: " + this.color + "\n";
	}
}
