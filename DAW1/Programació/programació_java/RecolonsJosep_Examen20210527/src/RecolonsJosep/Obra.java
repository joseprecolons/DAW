package RecolonsJosep;

public class Obra extends Fitxa{
	private String autor;
	private short nrePags;
	
	Obra(String referenciaR, String titolR, String autorR, short nrePagsR) {
		super(referenciaR, titolR);
		this.autor = autorR;
		if (nrePagsR > Short.MAX_VALUE) {
			this.nrePags = 0;
		} else {
			this.nrePags = nrePagsR;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autorR) {
		this.autor = autorR;
	}

	public short getNrePags() {
		return nrePags;
	}

	public void setNrePags(short nrePagsR) {
		if (nrePagsR > Short.MAX_VALUE) {
			this.nrePags = 0;
		} else {
			this.nrePags = nrePagsR;
		}
	}
	
	public void visualitzar() {
		super.visualitzar();
		System.out.println("Autor..............: " + this.autor + "\n"
				+ "Número de pàgines..: " + this.nrePags);
	}
}
