
public class Article {
	private double preu, iva;
	private int quantsQueden;
	private String nom;
	
	public Article(String nomR, double preuR, int ivaR, int quantsQuedenR) {
		this.preu = preuR;
		this.nom = nomR;
		this.quantsQueden = quantsQuedenR;
		this.iva = ivaR;
	}
	
	public void setPreu(int preuR) {
		this.preu = preuR;
	}
	
	public void setQuantsQueden(int quantsQuedenR) {
		this.quantsQueden = quantsQuedenR;
	}
	
	public void setIva(int ivaR) {
		this.iva = ivaR;
	}
	
	public void setNom(String nomR) {
		this.nom = nomR;
	}
	
	public double getPreu() {
		return this.preu;
	}
	public int getQuantsQueden() {
		return this.quantsQueden;
	}
	public double getIva() {
		return this.iva;
	}
	public String getNom() {
		return this.nom;
	}
	
	public String imprimirPrenda() {
		return "Nom: " + this.nom + "\n Preu: " + this.preu + "€ \n IVA: " + this.iva + "% \n Quants Queden:  " + this.quantsQueden;
	}
	
	public double getPVP() {
		return this.preu + (this.preu * (this.iva /100));
	}
	
	public double getPVPDescuento(int desc) {
		return this.getPVP() - (this.getPVP() * (desc / 100));
	}
	
	public boolean vendre(int quantitatVenuda) {
		if (quantitatVenuda < this.quantsQueden) {
			this.quantsQueden -= quantitatVenuda;
			return true;
		} else {
			return false;
		}
	}
	
	public void emmagatzemar(int quantitat) {
		this.quantsQueden += quantitat;
	}
}
