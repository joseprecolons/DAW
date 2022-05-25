
public class CompteEstalvis 
		extends CompteBancari { 

	private double tipusInteres;
	public CompteEstalvis(String numCompteR, double saldoR, double tipusInteresR) {
		super(numCompteR, saldoR);
		this.tipusInteres = tipusInteresR;
	}
	
	private void setTipusInteres(double tipusInteresR) {
		this.tipusInteres = tipusInteresR;
	}
	
	private double getTipusInteres() {
		return tipusInteres;
	}
	
	public double calculInteres(double saldoR) {
		return saldoR * (this.tipusInteres / 100);
	}
	
	public void capitalitzaInteres() {
		this.setSaldo(calculInteres(this.getSaldo()));
	}
	
	
}
