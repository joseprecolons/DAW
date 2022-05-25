
public class Poble extends Personatge{
	private int ovelles;
	
	Poble(String nomR, int forsaR, int vidaR, int ovellesR) {
		super(nomR, forsaR, vidaR);
		this.ovelles = ovellesR;
	}
	
	public String toString() {
		return super.toString()
				+ "Ovelles: " + this.ovelles + "\n";
	}
}
