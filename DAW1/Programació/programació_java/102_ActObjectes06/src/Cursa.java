
public class Cursa {
	
	private final static int VOLTES_DEF = 0;
	private int metres, voltes;
	
	public Cursa() {
		this(VOLTES_DEF);
	}
	
	public Cursa(int metresRebuts) {
		this.metres = metresRebuts;
	}
	
	//SETTERS
	
	public void setMetres(int nMetres) {
        this.metres = nMetres;
    }
	
	public void setVoltes(int nVoltes) {
		this.voltes = nVoltes;
	}
	
	//GETTERS
	
	public int getVoltes() {
		return this.voltes;
	}
		
	public int getMetres() {
		return this.metres;
	}

		
	//FUNCIONS
		
	public int distanciaRecorreguda() {
		int metresRecorreguts = this.voltes * this.metres;
		return metresRecorreguts;
	}
	
	public void incrementarVolta(int n) {
		this.voltes += n;
	}
	
	public void decrementarVolta(int n) {
		this.voltes -= n;
		if (voltes < 0) {
			voltes = 0;
		}
	}
	
	public String toString() {
		String valor;
		valor = "----INFORMACIÓ DE L'OBJECTE----\n"
				+ "Voltes = " + this.voltes + "\n"
				+ "Metres = " + this.metres + "\n"
				+ "Distancia recorreguda = " + distanciaRecorreguda() + "\n"
				+ "---------------------------------";
		return valor;
	}
}
