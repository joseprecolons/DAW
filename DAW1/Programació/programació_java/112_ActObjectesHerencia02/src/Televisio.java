
public class Televisio extends Electrodomestic{
	private static final int RESOLUCIO_DEFECTE = 20;
	private static final boolean SINTONITZADORTDT_DEFECTE = false;
	
	private int resolucio;
	private boolean sintonitzadorTdt;
	
	Televisio() {
		super();
		this.resolucio = RESOLUCIO_DEFECTE;
		this.sintonitzadorTdt = SINTONITZADORTDT_DEFECTE;
	}
	
	Televisio(int preuBaseR, int pesR) {
		super(preuBaseR, pesR);
		this.resolucio = RESOLUCIO_DEFECTE;
		this.sintonitzadorTdt = SINTONITZADORTDT_DEFECTE;
	}
	
	Televisio(int preuBaseR, int pesR, String colorR, char consumR, int resolucioR, boolean sintonitzadorTdtR) {
		super(preuBaseR, pesR, colorR, consumR);
		this.resolucio = resolucioR;
		this.sintonitzadorTdt = sintonitzadorTdtR;
	}
	
	public int getResolucio() {
		return this.resolucio;
	}
	
	public boolean getTdt() {
		return this.sintonitzadorTdt;
	}
	
	public int preuFinal() {
		int preuFinalTelevisio = super.preuFinal();
		if (resolucio > 40) {
			preuFinalTelevisio += preuFinalTelevisio * 0.30;
		}
		
		if (this.sintonitzadorTdt) {
			preuFinalTelevisio =+ 50;
		}
		
		return preuFinalTelevisio;
		
	}
	
	public String toString() {
		return "RENTADORA------"
				+ super.toString() 
				+ "Resolució = " + this.resolucio + "polzades\n"
				+ "Sintonitzador TDT = " + this.sintonitzadorTdt + "\n";
	}
}
