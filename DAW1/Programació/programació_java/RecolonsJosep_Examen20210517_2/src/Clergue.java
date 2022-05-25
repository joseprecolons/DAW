
public class Clergue extends PersonatgeIntel_ligencia {
	private static final int INTELLIGENCIA_DEFAULT = 15, FORSA_DEFAULT = 1;
	private String nomDeu;
	
	Clergue(String nomR, int vidaR, String nomDeuR) {
		super(nomR, FORSA_DEFAULT, vidaR, INTELLIGENCIA_DEFAULT);
		this.nomDeu = nomDeuR;
	}
	
	public void curar(Personatge objP) {
		objP.setVida(objP.getVida() + 10);
	}
	
	public String toString() {
		return super.toString()
				+ "Deu: " + this.nomDeu + "\n";
	}
	
}
