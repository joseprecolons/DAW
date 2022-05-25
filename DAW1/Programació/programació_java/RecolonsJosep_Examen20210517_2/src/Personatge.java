
public class Personatge {
	private String nom;
	private int forsa, vida;
	
	// CONSTRUCTOR
	Personatge(String nomR, int forsaR, int vidaR) {
		this.nom = nomR;
		this.forsa = forsaR;
		this.vida = vidaR;
	}
	
	// GETTERS
	public String getNom() {
		return this.nom;
	}
	
	public int getForsa() {
		return this.forsa;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	// SETTERS
	public void setNom(String nomR) {
		this.nom = nomR;
	}
	
	public void setForsa(int forsaR) {
		this.forsa = forsaR;
	}
	
	public void setVida(int vidaR) {
		this.vida = vidaR;
	}
	
	// METODE toString PER TREURE PER PANTALLA
	public String toString() {
		return "Nom: " + this.nom + "\n"
				+ "Força: " + this.forsa + "\n"
				+ "Punts de vida: " + this.vida + "\n";
		}
}
