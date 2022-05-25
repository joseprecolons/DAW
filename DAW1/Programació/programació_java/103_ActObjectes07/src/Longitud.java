
public class Longitud {
	
	private double metres;
	
	public Longitud(double mRebuts) {
		this.metres = mRebuts;
	}
	
	//mm--
	public void setMm(double mmRebuts) {
		this.metres = mmRebuts / 1000;
	}
	
	public double getMm() {
		
		return this.metres * 1000;
	}
	
	//cm--
	public void setCm(double cmRebuts) {
		this.metres = cmRebuts / 100;
	}
	
	public double getCm() {
		
		return this.metres * 100;
	}
	
	//m--
	public void setM (double metresRebuts) {
		this.metres = metresRebuts;
	}
	
	public double getM() {
		return this.metres;
	}
	
	//km--
	public void setKm(double kmRebuts) {
		this.metres = kmRebuts * 1000;
	}
	
	public double getKm() {
		
		return this.metres / 1000;
	}
	
	//polzada (in)
	public void setIn(double inRebuts) {
		this.metres = inRebuts / 39.37;
	}
	
	public double getIn() {
		
		return this.metres * 39.37;
	}
	
	//peu (ft)
	public void setFt(double ftRebuts) {
		this.metres = ftRebuts / 3.281;
	}
		
	public double getFt() {
			
		return this.metres * 3.281;
	}
	
	//iarda (yd)
	public void setYd(double ydRebuts) {
			this.metres = ydRebuts * 1.094;
	}
			
	public double getYd() {
				
		return this.metres / 1.094;
	}
	
	//milla (mi)
	public void setMi(double miRebuts) {
			this.metres = miRebuts * 1609;
	}
				
	public double getMi() {
					
		return this.metres / 1609;
	}
	
	//llegua (llegua)
	public void setLlegua(double lleguesRebudes) {
			this.metres = lleguesRebudes * 4828;
	}
					
	public double getLlegua() {
						
		return this.metres / 4828;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
