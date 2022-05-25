
public class Producte {
	private String nom;
	private int quantitat;
	
	Producte (String nomR, int quantitatR) 
	{
		this.nom = nomR;
		this.quantitat = quantitatR;
	}
	
	public String getNom() 
	{
		return this.nom;
	}
	
	public int getQuantitat() 
	{
		return this.quantitat;
	}
	
	public void setNom(String nomR) 
	{
		this.nom = nomR;
	}
	
	public void setQuantitat(String quantitatR) 
	{
		this.nom = quantitatR;
	}
	
	public String toString() {
		return "Nom: " + this.nom + "\n"
				+ "Quantitat: " + this.quantitat + "\n";
	}
}
