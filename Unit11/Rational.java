//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numer;
	private int denom;
	//write two constructors
	public Rational() {
		setRational(1,1);
	}
	
	public Rational(int numerator, int denominator) {
		setRational(numerator, denominator);
	}

	//write a setRational method
	public void setRational(int numerator, int denominator) {
		setNumer(numerator);
		setDenom(denominator);
	}

	//write  a set method for numerator and denominator
	public void setNumer(int numerator) {
		numer = numerator;
	}
	
	public void setDenom (int denominator) {
		denom = denominator;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		numer = (numer * other.denom + other.numer * denom);
		denom = (denom * other.denom);
		reduce();
	}

	private void reduce()
	{
		int divisor = gcd(numer, denom);
		numer = numer/divisor;
		denom = denom/divisor;
	}

	private int gcd(int numOne, int numTwo)
	{
		for (int i = Math.max(numOne, numTwo); i > 0; i--) {
			if (numOne % i == 0 && numTwo % i ==0) {
				return i;
			}
		}


		return 1;
	}

	public Object clone ()
	{
		return new Rational(getNumer(), getDenom());
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumer() {
		return numer;
	}
	
	public int getDenom() {
		return denom;
	}
	
	
	public boolean equals( Object obj)
	{
		return compareTo((Rational) obj) == 0;
	}

	public int compareTo(Rational other)
	{
		reduce();
		other.reduce();
		
		if (denom < other.getDenom()) {
			return -1;
		}
		else if (denom == other.getDenom()) {
			return Integer.compare(numer, other.getNumer());
		}
		else {
			return 1;
		}
	}
	
	//write  toString() method
	public String toString() {
		return numer + "/" + denom;
	}
	
	
}