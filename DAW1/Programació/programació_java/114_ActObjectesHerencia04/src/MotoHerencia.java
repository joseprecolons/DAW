
public class MotoHerencia extends VehicleHerencia {
	private int centimetresCubics;
	
	MotoHerencia(String colorR, String marcaR, int centimetresCubicsR) {
		super(colorR, marcaR);
		this.centimetresCubics = centimetresCubicsR;
	}
	
	public int getCv() {
		return this.centimetresCubics;
	}
	
	public void setCv(int cvR) {
		this.centimetresCubics = cvR;
	}
	
}
