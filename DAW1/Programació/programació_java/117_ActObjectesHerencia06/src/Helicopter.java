
public class Helicopter extends Aeri{
	private int numHelixs;
	
	Helicopter(String matriculaR, String modelR, int seientsR, int numHelixsR) {
		super(matriculaR, modelR, seientsR);
		this.numHelixs = numHelixsR;
	}
	
	public void setNumHelixs(int numHelixsR) {
		this.numHelixs = numHelixsR;
	}
	
	public int getNumHelixs() {
		return this.numHelixs;
	}
	
	public String toString() {
		return super.toString() + 
				"Profunditat Màxima: " + this.numHelixs + "\n";
	}
}
