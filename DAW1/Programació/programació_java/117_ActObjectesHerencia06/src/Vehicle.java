
public class Vehicle {
	private String matricula, model;
	
	Vehicle(String matriculaR, String modelR) {
		this.matricula = matriculaR;
		this.model = modelR;
		
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matriculaR) {
		this.matricula = matriculaR;
	}
	
	public String toString() {
		return "Matricula: " + this.matricula + "\n"
				+ "Model: " + this.model+ "\n";
	}
}
