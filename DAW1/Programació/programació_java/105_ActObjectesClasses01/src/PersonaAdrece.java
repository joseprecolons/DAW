
public class PersonaAdrece {
	private int numDni;
	private String nom;
	private Adrece adrece;
	
	public PersonaAdrece(int dniR) {
		this.numDni = dniR;
	}
	
	public PersonaAdrece(int dniR, String nomR) {
		this.numDni = dniR;
		this.nom = nomR;
	}
	
	/*public PersonaAdrece(int dniR, String nomR, String localitatR, String codiPostalR, String carrerR) {
		this.numDni = dniR;
		this.nom = nomR;
		this.adrece = new Adrece (localitatR, codiPostalR, carrerR);
	}*/
	
	public PersonaAdrece(int dniR, String nomR, Adrece adreceR) {
		this.numDni = dniR;
		this.nom = nomR;
		this.adrece = adreceR;
	}
	
	public int getDni() {
		return this.numDni;
	}
	public String getNom() {
		return this.nom;
	}
	
	public void setDni(int dniR) {
		this.numDni = dniR;
	}
	public void setNom(String nomR) {
		this.nom = nomR;
	}
	
	public String getAdrece() {
		return this.adrece.toString();
	}
	
	public void setAdrece(String localitatR, String codiPostalR, String carrerR) {
		this.adrece.setLocalitat(localitatR);
		this.adrece.setCodiPostal(codiPostalR);
		this.adrece.setCarrer(carrerR);
	}
	
}
