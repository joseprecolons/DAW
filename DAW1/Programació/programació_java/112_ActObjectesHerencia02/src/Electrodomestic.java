
public class Electrodomestic {
	private static final int PREUBASE_DEFECTE = 100, PES_DEFECTE = 5;
	private static final String COLOR_DEFECTE = "blanc";
	private static final char CONSUM_DEFECTE = 'F';

	private int preuBase, pes;
	private String color;
	private char consum;
		
	Electrodomestic() {
		this.preuBase = PREUBASE_DEFECTE;
		this.pes = PES_DEFECTE;
		this.color = COLOR_DEFECTE;
		this.consum = CONSUM_DEFECTE;
		}

	Electrodomestic(int preuBaseR, int pesR) {
		this.preuBase = preuBaseR;
		this.pes = pesR;
		this.color = COLOR_DEFECTE;
		this.consum = CONSUM_DEFECTE;
	}
	
	Electrodomestic(int preuBaseR, int pesR, String colorR, char consumR) {
		this.preuBase = preuBaseR;
		this.pes = pesR;
		if (comprovarColor(colorR)) {
			this.color = colorR;
		} else {
			this.color = COLOR_DEFECTE;
		}
		if (comprovarConsumEnergetic(consumR)) {
			this.consum = consumR;
		} else {
			this.consum = CONSUM_DEFECTE;
		}
	}
	
	public int getPresuBase() {
		return this.preuBase;
	}
	
	public int getPes() {
		return this.pes;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public char getConsum() {
		return this.consum;
	}
	
	private boolean comprovarConsumEnergetic(char lletra) {
		int lletraEnAscii = (int) lletra; 
		if (lletraEnAscii > 70 || lletraEnAscii < 65) {
			return false;
		} else {
			return true;
		}
	}
	
	private boolean comprovarColor(String color) {
		String[] colors = {"blanc", "negre", "vermell", "blau", "gris"};
		for (int i = 0; i < colors.length; i++) {
			if (colors[i].equals(color.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
	
	public int preuFinal() {
		
		int preuFinal = this.preuBase;
		
		if (this.pes > 0 && this.pes <= 19) {
			preuFinal += 10;
		} else if (this.pes >= 20 && this.pes <= 49) {
			preuFinal += 50;
		} else if(this.pes >= 50 && this.pes <= 79) {
			preuFinal += 80;
		} else {
			preuFinal += 100;
		}
	
		switch (this.consum) {
			case 'A': 
				return preuFinal += 100;
			case 'B':
				return preuFinal += 80;
			case 'C':
				return preuFinal += 60;
			case 'D':
				return preuFinal += 50;
			case 'E':
				return preuFinal += 30;
			case 'F':
				return preuFinal += 10;
		}
		
		return preuFinal;
		
	}
	
	public String toString() {
		return "ELECTRODOMESTIC---"
				+ "Preu base = " + this.preuBase + "€\n"
				+ "Pes = " + this.pes + "Kg\n"
				+ "Color = " + this.color + "\n"
				+ "Consum = " + this.consum + "\n";
	}
}
