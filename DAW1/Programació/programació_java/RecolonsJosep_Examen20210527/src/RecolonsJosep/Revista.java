package RecolonsJosep;

public class Revista extends Fitxa{
	private short any;
	private short nro;
	
	Revista(String referenciaR, String titolR, short anyR, short nroR) {
		super(referenciaR, titolR);
		
		if (anyR > Short.MAX_VALUE) {
			this.any = 0;
		} else {
			this.any = nroR;
		}
		
		if (nroR > Short.MAX_VALUE) {
			this.nro = 0;
		} else {
			this.nro = nroR;
		}
	}

	public short getAny() {
		return any;
	}

	public void setAny(short anyR) {
		if (anyR > Short.MAX_VALUE) {
			this.any = 0;
		} else {
			this.any = anyR;
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
		System.out.println("Any..............: " + this.any + "\n"
			 + "Número de revista: " + this.nro);
	}
}
