
public class Punt {
	private int x, y;
	
	public Punt(int xRebuda, int yRebuda) {
		this.x = xRebuda;
		this.y = yRebuda;
	}
	
	public Punt() {
		
	}
	
	public void setX(int xR) {
		this.x = xR;
	}
	
	public void setY(int yR) {
		this.y = yR;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	
	public String imprimirPunt() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public void setXY(int xR, int yR) {
		this.x = xR;
		this.y = yR;
	}
	
	public void desplaza(int dX, int dY) {
		this.x += dX;
		this.y += dY;
	}
	
	public double distancia(Punt p) {
		return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
	}
}
