
public class Temperatura {

	private double kelvin;
	
	public Temperatura(double getKelvin) {
		this.kelvin = getKelvin;
	}
	
	//celsius
	public void setCelsius(double celsiusRebuts) {
		this.kelvin = celsiusRebuts - 273.15;
	}
	
	public double getCelsius() {
		return this.kelvin + 273.15;
	}
	
	//fahrenheits
	public void setFarhenheits(double farhenheitsRebuts) {
		this.kelvin = (farhenheitsRebuts - 32) * 5 / 9 + 273.15;
	}
			
	public double getFarhenheits() {
		return (this.kelvin - 273.15) * 9 / 5 + 32;
	}
	
	//kelvin
	public void setKelvins(double kelvinsRebuts) {
		this.kelvin = kelvinsRebuts;
	}
		
	public double getKelvins() {
		return this.kelvin;
	}
}
