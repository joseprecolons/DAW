
public class PersonatgeIntel_ligencia extends Personatge {
	private int intelligencia;
	
	public PersonatgeIntel_ligencia(String nomR, int forsaR, int vidaR, int intelligenciaR) {
		super(nomR, forsaR, vidaR);
		this.intelligencia = intelligenciaR;
	}
	
	public int getIntelligencia() {
		return this.intelligencia;
	}
	
	public void setIntelligencia(int intelligenciaR) {
		this.intelligencia = intelligenciaR;
	}
	
	public String toString() {
		return super.toString()
				+ "Intel·ligència: " + this.intelligencia + "\n";
	}
}
