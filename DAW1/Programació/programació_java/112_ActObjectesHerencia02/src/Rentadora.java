
public class Rentadora extends Electrodomestic{
	private static final int CARREGA_DEFECTE = 5;
	
	private int carrega;
	
	Rentadora() {
		super();
		this.carrega = CARREGA_DEFECTE;
	}
	
	Rentadora(int preuBaseR, int pesR, int carregaR) {
		super(preuBaseR, pesR);
		this.carrega = carregaR;
	}
	
	Rentadora(int preuBaseR, int pesR, String colorR, char consumR, int  carregaR) {
		super(preuBaseR, pesR, colorR, consumR);
		this.carrega = carregaR;
	}
	
	public int preuFinal() {
		int preuFinalRentadora = super.preuFinal();
		
		if (this.carrega > 30) {
			preuFinalRentadora += 50;
		}
		return preuFinalRentadora;
	}
	
	public String toString() {
		return "RENTADORA------"
				+ super.toString() + 
				"Carrega = " + this.carrega + "\n";
	}
}
