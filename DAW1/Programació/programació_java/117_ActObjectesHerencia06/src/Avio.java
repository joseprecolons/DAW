
public class Avio extends Aeri{
	private int tempsMaximVol;
	
	Avio(String matriculaR, String modelR, int seientsR, int tempsMaximVolR) {
		super(matriculaR, modelR, seientsR);
		this.tempsMaximVol = tempsMaximVolR;
	}
	
	public void setTempsMaximVol(int tempsMaximVolR) {
		this.tempsMaximVol = tempsMaximVolR;
	}
	
	public int getTempsMaximVol() {
		return this.tempsMaximVol;
	}
	
	public String toString() {
		return super.toString() + 
				"Profunditat Màxima: " + this.tempsMaximVol + "\n";
	}
}
