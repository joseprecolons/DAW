public class Adrece {
	private String localitat;
	private String codiPostal; 
	private String carrer;
	
	public Adrece (String localitatR, String codiPostalR, String carrerR) {
		this.localitat = localitatR;
		this.codiPostal = codiPostalR;
		this.carrer = carrerR;
	}
	
	public String getLocalitat() {
		return this.localitat;
	}
	public String getCodiPostal() {
		return this.codiPostal;
	}
	public String getCarrer() {
		return this.carrer;
	}
	
	public void setLocalitat(String localitatR) {
		this.localitat = localitatR;
	}
	public void setCodiPostal(String codiPostalR) {
		this.localitat = codiPostalR;
	}
	public void setCarrer(String carrerR) {
		this.localitat = carrerR;
	}
	
	public String toString() {
		return this.carrer + " - " + this.codiPostal + " - " + this.localitat; 
	}
}