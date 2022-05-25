
public class Massa {
	
	private double kilograms;
	
	public Massa(double kilogramsRebuts) {
		this.kilograms = kilogramsRebuts;
	}
	

	//mg
	public void setMg(double mgRebuts) {
		this.kilograms = mgRebuts / 1000000;
	}
	
	public double getMg() {
		
		return this.kilograms * 1000000;
	}
	
	//gram
	public void setGr(double grRebuts) {
		this.kilograms = grRebuts / 1000;
	}
		
	public double getGr() {	
		return this.kilograms * 1000;
	}
	
	//kg
	
	public void setKg(double kgRebuts) {
		this.kilograms = kgRebuts;
	}
		
	public double getKg() {	
		return this.kilograms;
	}
	
	//tona (ton)
	public void setTon(double tonRebudes) {
		this.kilograms = tonRebudes * 1000;
	}
			
	public double getTon() {	
		return this.kilograms / 1000;
	}
	
	//lliure (lb)
	public void setLb(double lbRebudes) {
		this.kilograms = lbRebudes * 2.205;
	}
				
	public double getLb() {	
		return this.kilograms / 2.205;
	}
	
	//onza (oz)
	public void setOz(double ozRebudes) {
		this.kilograms = ozRebudes * 35.274;
	}
					
	public double getOz() {	
		return this.kilograms / 35.274;
	}
	
	
}
