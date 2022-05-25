
public class Programador extends Treballador{
	
	private static final int LINIES_CODI_HORA = 0;
	
	private int liniesCodiHora;
	
	Programador(String nomR, int edatR, double salariR) {
		super(nomR, edatR, salariR);
		this.liniesCodiHora = LINIES_CODI_HORA;
	}
	
	Programador(String nomR, int edatR, double salariR, int liniesCodiHoraR) {
		super(nomR, edatR, salariR);
		this.liniesCodiHora = liniesCodiHoraR;
	}
	
	public int getLiniesCodiHora() {
		return this.liniesCodiHora;
	}
	
	public void setLiniesCodiHora(int liniesCodiHoraR) {
		this.liniesCodiHora = liniesCodiHoraR;
	}
	
	public String toString() {
		return super.toString() + 
				"Linies de Codi/hora: " + this.liniesCodiHora;
	}
}
