
public class Vaixell extends Aquatic{
	private boolean motor;
	
	Vaixell(String modelR, String matriculaR, int esloraR, boolean motorR) {
		super(modelR, matriculaR, esloraR);
		this.motor = motorR;
	}
	
	public void setMotor(boolean motorR) {
		this.motor = motorR;
	}
	
	public boolean getMotor() {
		return this.motor;
	}
	
	public String toString() {
		return super.toString() + 
				"Motor: " + this.motor + "\n";
	}
}
