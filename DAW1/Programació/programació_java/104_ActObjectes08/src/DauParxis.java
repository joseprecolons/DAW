
public class DauParxis {
	private Dau dau1, dau2;
	private final int caresParxis = 6;
	
	public DauParxis() {
		dau1 = new Dau(caresParxis);
		dau2 = new Dau(caresParxis);
	}
	
	public int tirar() {
		dau1.llensar();
		dau2.llensar();
		
		return dau1.getTirada() + dau2.getTirada();
	}
	
	public int getTirada() {
		return dau1.getTirada() + dau2.getTirada();
	}
	
	public int getTiradaDau1() {
		return dau1.getTirada();
	}
	
	public int getTiradaDau2() {
		return dau2.getTirada();
	}
	
	public boolean dobles() {
		boolean esDoble = true;
		if (this.getTiradaDau1() != this.getTiradaDau2()) {
			esDoble = false;
		}
		
		return esDoble;
	}
	
	public boolean dobleCinc() {
		boolean cincs = false;
		if (this.dobles() && this.getTirada() == 10) {
			cincs = true;
		}
		return cincs;
	}
	
	public boolean cinc() {
		boolean cinc = false;
		if (this.getTiradaDau1() == 5 || this.getTiradaDau2() == 5) {
			cinc = true;
		}
		return cinc;
	}
	
	public boolean sumaDausCinc() {
		boolean resultatCinc = false;
		if (this.getTiradaDau1() + this.getTiradaDau2() == 5) {
			resultatCinc = true;
		}
		return resultatCinc;
	}
}
