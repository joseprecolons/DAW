
public class Password {

	private final static int LONG_DEF = 8;
	
	private String contrasenya = "";
	private int longitud;
	
	public Password() {
		this(LONG_DEF);
		
	}
	
	public Password(int longitudRebuda) {
		this.longitud = longitudRebuda;
		this.contrasenya = generarPassword();
	}
	
	
	//GETTERS
	
	public int getLongitud() {
		return this.longitud;
	}
	
	public String getContrasenya() {
		return this.contrasenya;
	}
	
	//SETTER
    public void setLongitud(int novaLongitud) {
        this.longitud = novaLongitud;
    }
	
	public String generarPassword() {
		String contrasenya = "";
		char lletra;
		int eleccio;
		
		for (int i = 0; i < this.longitud; i++) {
			eleccio = (int) ((Math.random() * 3) + 1);
			if (eleccio == 1) {
				lletra = (char)(int) ((Math.random() * (123-97) + 97));
				contrasenya += lletra;
			} else if (eleccio == 2) {
				lletra = (char)(int) ((Math.random() * (91-65) + 65));
				contrasenya += lletra;
			} else {
				lletra = (char)(int) ((Math.random() * (58-48) + 48));
				contrasenya += lletra;
			}
		}
		return contrasenya;
	}
	
	public boolean esFort() {
		int num = 0, min = 0, maj = 0;
		
		for (int i = 0; i < this.contrasenya.length(); i++) {
			if (this.contrasenya.charAt(i) >= 97 && this.contrasenya.charAt(i) <= 122) {
				min++;
			} else if (this.contrasenya.charAt(i) >= 65 && this.contrasenya.charAt(i) <= 90) {
				maj++;
			} else {
				num++;
			}
		}
		
		if (num >= 5 && min >= 1 && maj >= 2) {
			return true;
		} else {
			return false;
		}
	}
    
}
