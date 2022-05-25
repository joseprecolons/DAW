package RecolonsJosep;

public class Fitxa {
	private String referencia;
	private String titol;
	
	Fitxa(String referenciaR, String titolR) {
		this.referencia = referenciaR;
		this.titol = titolR;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referenciaR) {
		this.referencia = referenciaR;
	}

	public String getTitol() {
		return titol;
	}

	public void setTitol(String titolR) {
		this.titol = titolR;
	}
	
	public boolean equals(Fitxa obj) {
		if (referencia.equals(obj.referencia)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void visualitzar() {
		System.out.println("Referència........: " + this.referencia + "\n"
				+ "Títol.............: " + this.titol);
	}
	
	public String toString() {
		return this.referencia + " - " + this.titol;
	}
}
