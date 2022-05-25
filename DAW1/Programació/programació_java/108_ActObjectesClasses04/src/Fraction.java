
public class Fraction {
	private int denominator, numerator;
	
	public Fraction(int numeratorR, int denominatorR) {
		this.denominator = denominatorR;
		this.numerator = numeratorR;
		reduceToLowestTerms(this.numerator, this.denominator);
	}
	
	public Fraction() {
		
	}

	public int getDenominator() {
		return this.denominator;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public void setDenominator(int denominatorR) {
		this.denominator = denominatorR;
	}
	
	public void setNumerator(int numeratorR) {
		this.numerator = numeratorR;
	}
	
	public Fraction add(Fraction f) {
		Fraction newF = new Fraction();
		if (this.denominator == f.getDenominator()) {
			newF.setDenominator(this.denominator);
			newF.setNumerator(this.numerator + f.getNumerator());
		} else {
			newF.setDenominator(mcm(this.denominator, f.getDenominator()));			
			newF.setNumerator((this.numerator * (mcm(this.denominator, f.getDenominator()) / this.denominator)) + 
					(f.getNumerator() * (mcm(this.denominator, f.getDenominator()) / f.getDenominator())));
		}
		
		return newF;
	}
	
	public Fraction substract(Fraction f) {
		Fraction newF = new Fraction();
		if (this.denominator == f.getDenominator()) {
			newF.setDenominator(this.denominator);
			newF.setNumerator(this.numerator - f.getNumerator());
		} else {
			newF.setDenominator(this.denominator * f.getDenominator());
			newF.setNumerator((this.numerator * f.getDenominator()) - (this.denominator * f.getNumerator()));
		}
		
		return newF;
	}
	
	public Fraction multiply(Fraction f) {
		Fraction newF = new Fraction();
		newF.setDenominator(this.denominator * f.getDenominator());
		newF.setNumerator(this.numerator * f.getNumerator());
		return newF;
	}
	
	public Fraction divide(Fraction f) {
		Fraction newF = new Fraction();
		newF.setDenominator(this.denominator * f.getNumerator());
		newF.setNumerator(this.numerator * f.getDenominator());
		return newF;
	}
	
	public Fraction inverse(Fraction f) {
		Fraction newF = new Fraction();
		newF.setDenominator(this.numerator);
		newF.setNumerator(this.denominator);
		return newF;
	}
	
	private int mcd(int a, int b) {
		
		int t;
		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	
	private int mcm(int a, int b) {
		System.out.println((a * b / mcd(a,b)));
		return (a * b / mcd(a,b));
	}
	
	public void reduceToLowestTerms(int a, int b) {
		
		for (int i = 2; a % i == 0 && b % i == 0; i++) {
			a /= i;
			b /= i;
			if (a % i == 0) {
				i--;
			}
		}
		
		if (b < 0) {
			a *= -1;
			b *= -1;
		}
		this.numerator = a;
		this.denominator = b;
		
	}
	
	public String toString() {
		reduceToLowestTerms(this.numerator, this.denominator);
		return this.numerator + "/" + this.denominator;
	}
}
