
public class Dau {

	private final int cares;
	private int tirada;
	public Dau(int caresRebudes){
		this.cares = caresRebudes;
		this.tirada = (int) (Math.random() * this.cares + 1);
	}
	
	public int getTirada() {
		return this.tirada;
	}
	
	public int llensar() {
		this.tirada = (int) (Math.random() * this.cares + 1);
		return this.tirada;
		
	}
	
}
