
public class Cotxe extends Terrestre{
	private boolean aireAcondicionat;
	
	Cotxe(String modelR, String matriculaR, int numRodesR, boolean aireAcondicionatR) {
		super(modelR, matriculaR, numRodesR);
		this.aireAcondicionat = aireAcondicionatR;
	}
	
	public void setAireAcondicionat(boolean aireAcondicionatR) {
		this.aireAcondicionat = aireAcondicionatR;
	}
	
	public boolean getAireAcondicionat() {
		return this.aireAcondicionat;
	}
	
	public String toString() {
		return super.toString() + 
				"Aire Acondicionat: " + this.aireAcondicionat + "\n";
	}
}
