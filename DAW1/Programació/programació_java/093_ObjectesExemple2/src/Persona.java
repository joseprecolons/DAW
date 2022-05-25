	
public class Persona {
	//Definició atributs
	private String dni, nom;
	private int edat;
	
	//SETTERS Info que envíes
	public void setDni(String d) {
		dni = d;
	}
	public void setNom(String n) {
		nom = n;
	}
	public void setEdat(int e) {
		edat = e;
	}
	
	//GETTERS Info que rebs
	public String getDni() {
		return dni;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getEdat() {
		return edat;
	}
	
	public void visualitzar() {
		System.out.println("Nom..: " + nom);
		System.out.println("DNI..: " + dni);
		System.out.println("Edat.: " + edat);
	}
	
}
