public class CompteBancari {
	private String numCompte;
	private double saldo, qttInicial;
	
	public CompteBancari(String numCompteR) {
		this.numCompte = numCompteR;
	}
	
	public CompteBancari(String numCompteR, double saldoR) {
		this.numCompte = numCompteR;
		this.saldo = saldoR;
	}
	
	public void setNumCompte(String numCompteR) {
		this.numCompte = numCompteR;
	}
	
	protected void setSaldo(double saldoR) {
		this.saldo = saldoR;
	}
	
	protected double getSaldo() {
		return this.saldo;
	}
	
	private void setQttInicial(double qttInicialR) {
		this.qttInicial = qttInicialR;
	}
	
	private double getQttInicial() {
		return this.qttInicial;
	}
	
	public void imposicio(double quantitat) {
		this.saldo += quantitat;
	}
	
	public void reintegre(double quantitat) {
		this.saldo -= quantitat;
	}
	
	public String toString() {
		String className = this.getClass().getName();
		return "Tipus de compte: " + className + "\n" 
				+ "Número del compte: " + this.numCompte + "\n"
				+ "Saldo actual : " + this.saldo;
	}
}
