
public class CompteCorrent 
	extends CompteBancari {
	private boolean xecsEmesos;
	public CompteCorrent(String numCompteR, boolean xecsEmesosR) {
		super(numCompteR);
		this.xecsEmesos = xecsEmesosR;
	}
	
	public boolean getXecsEmesos() {
		return this.xecsEmesos;
	}
	
	public void setXecsEmesos(boolean xecsEmesosR) {
		this.xecsEmesos = xecsEmesosR;
	}
	
	public String toString() {
		return (super.toString() + "\n" 
				+ "Xecs emesos: " + this.xecsEmesos);
	}

}
