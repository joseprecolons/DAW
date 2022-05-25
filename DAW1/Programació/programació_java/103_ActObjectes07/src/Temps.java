public class Temps {

	private double segons;

	public Temps(double getSegon) {
		this.segons = getSegon;
	}
	
	//hores
	public void setH(double horesRebudes) {
		this.segons = horesRebudes * 3600;
	}
	public double getH() {
		return this.segons / 3600;
	}
	
	//minuts
	public void setM(double minutsRebuts) {
		this.segons = minutsRebuts * 60;
	}
	
	public double getM() {
		return this.segons / 60;
	}

	//segons
	public void setS(double segonsRebuts) {
		this.segons = segonsRebuts;
	}
	public double getS() {
		return this.segons;
	}

	//milisegons
	public void setMS(double milliSegonsRebuts) {
		this.segons = milliSegonsRebuts / 1000;
	}
	public double getMS() {
		return this.segons * 1000;
	}	
	
	//format hora
	public void setHMSM(double hora, double min, double seg, double miliSeg) {
		this.segons = hora * 3600 + min * 60 + seg + miliSeg/1000; 
	}
	
}