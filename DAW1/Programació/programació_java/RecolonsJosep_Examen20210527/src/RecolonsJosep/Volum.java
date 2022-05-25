package RecolonsJosep;

public class Volum extends Obra{
	private short nro;
	
	Volum(String referenciaR, String titolR, String autorR, short nrePagsR, short nroR) {
		super(referenciaR, titolR, autorR, nrePagsR);
		
		if (nroR > Short.MAX_VALUE) {
			this.nro = 0;
		} else {
			this.nro = nroR;
		}

	}

	public short getNro() {
		return nro;
	}

	public void setNro(short nroR) {
		if (nroR > Short.MAX_VALUE) {
			this.nro = 0;
		} else {
			this.nro = nroR;
		}
	}
	
	public void visualitzar() {
		super.visualitzar();
		System.out.println("Número de Volum...: " + this.nro);
	}
}
