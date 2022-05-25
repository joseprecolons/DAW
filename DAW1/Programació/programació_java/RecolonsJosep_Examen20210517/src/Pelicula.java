
public class Pelicula extends Multimedia {
	private String actorPrincipal, director;
	
	Pelicula(String titolR, String autorR, String formatR, int duracioR, String actorPrincipalR, String directorR) {
		super(titolR, autorR, formatR, duracioR);
		this.actorPrincipal = actorPrincipalR;
		this.director = directorR;
	}
	
	public String getActorPrincipal() {
		return this.actorPrincipal;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	public String toString() {
		return super.toString()
				+ "Actor Principal: " + this.actorPrincipal + "\n"
				+ "Director: " + this.director + "\n";
		
	}
}
