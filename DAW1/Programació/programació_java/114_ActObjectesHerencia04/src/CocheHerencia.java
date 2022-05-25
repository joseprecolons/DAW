
public class CocheHerencia extends VehicleHerencia {
	private int cv;
	
	CocheHerencia(String colorR, String marcaR, int cvR) {
		super(colorR, marcaR);
		this.cv = cvR;
	}
	
	public int getCv() {
		return this.cv;
	}
	
	public void setCv(int cvR) {
		this.cv = cvR;
	}
	
}
