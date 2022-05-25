
public class PersonaHerencia {

	private static final int MAJORIA_EDAT = 18;
	
	private String nom;
	private int edat;
	
	PersonaHerencia(String nomR, int edatR) {
		this.nom = nomR;
		this.edat = edatR;
	}
	
	PersonaHerencia() {
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getEdat() {
		return this.edat;
	}
	
	public void setNom(String nomR) {
		this.nom = nomR;
	}
	
	public void setEdat(int edatR) {
		this.edat = edatR;
	}
	
	public void aniversari() {
		this.edat++;
	}
	
	public boolean esMajorEdat() {
		if (this.edat >= MAJORIA_EDAT) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Nom: " + this.nom + "\n"
				+ "Edat: " + this.edat + "\n";
	}
	
}
