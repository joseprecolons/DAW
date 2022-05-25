
public class Submari extends Aquatic{
	private int profunditatMax;
	
	Submari(String modelR, String matriculaR, int esloraR, int profunditatMaxR) {
		super(modelR, matriculaR, esloraR);
		this.profunditatMax = profunditatMaxR;
	}
	
	public void setProfunditatMax(int profunditatMaxR) {
		this.profunditatMax = profunditatMaxR;
	}
	
	public int getProfunditatMax() {
		return this.profunditatMax;
	}
	
	public String toString() {
		return super.toString() + 
				"Profunditat Màxima: " + this.profunditatMax + "\n";
	}
}
