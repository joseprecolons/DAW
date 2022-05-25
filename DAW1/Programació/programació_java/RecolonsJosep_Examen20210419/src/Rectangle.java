
public class Rectangle {
	private int x1, y1, x2, y2;
	
	public Rectangle(int x1R, int y1R, int x2R, int y2R) {
		if (x2R > x1R && y2R > y1R) {
			this.x1 = x1R;
			this.y1 = y1R;
			this.x2 = x2R;
			this.y2 = y2R;
		} else {
			System.out.println("Error a l'instenciar el rectangle");
		}
	}
	
	public Rectangle() {
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
	}
	
	public void setX1(int x1R) {
		if (x1R < this.x2) {
			this.x1 = x1R;
		} else {
			System.out.println("Error al posar valor a x1");
		}
	}
	
	public void setY1(int y1R) {
		if (y1R < this.y2) {
			this.y1 = y1R;
		} else {
			System.out.println("Error al posar valor a y1");
		}
	}
	
	public void setX2(int x2R) {
		if (x2R > this.x1) {
			this.x2 = x2R;
		} else {
			System.out.println("Error al posar valor a x2");
		}
	}
	
	public void setY2(int y2R) {
		if (y2R > this.y1) {
			this.y2 = y2R;
		} else {
			System.out.println("Error al posar valor a y2");
		}
	}
	
	public int getX1() {
		return this.x1;
	}
	public int getY1() {
		return this.y1;
	}
	public int getX2() {
		return this.x2;
	}
	public int getY2() {
		return this.y2;
	}
	
	public String imprimirPunt() {
		return "(" + this.x1 + ", " + this.y1 + ")" + " i (" + this.x2 + ", " + this.y2 + ")";
	}
	
	public void setX1Y1(int x1R, int y1R) {
		if (x1R < this.x2 && y1R < this.y2) {
			this.x1 = x1R;
			this.y1 = y1R;
		} else {
			System.out.println("Error al posar valors a x1 i y1");
		}
	}
	
	public void setX2Y2(int x2R, int y2R) {
		if (x2R > this.x1 && y2R > this.y1) {
			this.x2 = x2R;
			this.y2 = y2R;
		} else {
			System.out.println("Error al posar valors a x2 i y2");
		}
	}
	
	public void setAll(int x1R, int y1R, int x2R, int y2R) {
		if (x1R < x2R && y1R < y2R) {
			this.x1 = x1R;
			this.y1 = y1R;
			this.x2 = x2R;
			this.y2 = y2R;
		} else {
			System.out.println("Error al posar valors");
		}
	}
	
	public int getPerimetre() {
		int costat1 = this.x2 - this.x1;
		int costat2 = this.y2 - this.y1;
		
		return costat1*2 + costat2*2;
	}
	
	public int getArea() {
		int costat1 = this.x2 - this.x1;
		int costat2 = this.y2 - this.y1;
		
		return costat1 * costat2;
	}
}
