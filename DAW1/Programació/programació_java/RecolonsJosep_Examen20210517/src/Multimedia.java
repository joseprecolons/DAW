
public class Multimedia {
	private String titol, autor, format;
	private int duracio;
	
	Multimedia(String titolR, String autorR, String formatR, int duracioR) {
		this.titol = titolR;
		this.autor = autorR;
		this.format = formatR;
		this.duracio = duracioR;
	}
	
	public String getTitol() {
		return this.titol;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public String getFormat() {
		return this.format;
	}
	
	public int getDuracio() {
		return this.duracio;
	}
	
	public boolean comparacio(Multimedia objM) {
		if (objM.getTitol().equals(this.titol) && objM.getAutor().equals(this.autor)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Titol: " + this.titol + "\n"
				+ "Autor: " + this.autor + "\n"
				+ "Format: " + this.format + "\n"
				+ "Duració " + this.duracio + "mintus \n";
	}
}
