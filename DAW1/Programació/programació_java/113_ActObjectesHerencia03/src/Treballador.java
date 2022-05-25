
public class Treballador extends PersonaHerencia {
	
	private static final double SOU_MINIM = 950;
	private double salari;
	
	Treballador(String nomR, int edatR) {
		super(nomR, edatR);
		this.salari = SOU_MINIM;
	}
	
	Treballador(String nomR, int edatR, double salariR) {
		super(nomR, edatR);
		if (salariR < SOU_MINIM) {
			this.salari = SOU_MINIM;
		} else {
			this.salari = salariR;
		}
	}
	
	public double getSalari() {
		return this.salari;
	}
	
	public void setSalari(double salariR) {
		if (salariR < SOU_MINIM) {
			this.salari = SOU_MINIM;
		} else {
			this.salari = salariR;
		}
	}
	
	public void augmentarSalari(double augmentSalariR) {
		this.salari += augmentSalariR;
	}

	public String toString() {
		return super.toString() +
				"Salari: " + this.salari + "\n";
	}

}
