import java.math.BigInteger;

/*
 * Big Rational Implementation
 */
public class BigRationalN {
	
	public BigRationalN(){
		this(0);
	}
	
	public BigRationalN(int n){
		this(n, 1);
	}
	public BigRationalN(int x, int y) {
        this(BigInteger.valueOf(x), BigInteger.valueOf(y));
    }
	public BigRationalN(BigInteger x, BigInteger y){
		
		if (y.equals(BigInteger.ZERO)) {
	           throw new ArithmeticException("Denominator is zero");
	        }
		BigInteger g = x.gcd(y);
		num = x.divide(g);
		den = y.divide(g);
		if(den.compareTo(BigInteger.ZERO) < 0){
			num = num.negate();
			den = den.negate();
		}
	}
	
	public BigRationalN add(BigRationalN r){
		return new BigRationalN(this.num.multiply(r.den).add(r.num.multiply(this.den)), 
								this.den.multiply(r.den));
	}
	public BigRationalN subtract(BigRationalN r){
		return new BigRationalN(this.num.multiply(r.den).subtract(r.num.multiply(this.den)),
								this.den.multiply(r.den));
	}
	public BigRationalN multiply(BigRationalN r){
		return new BigRationalN(this.num.multiply(r.num), this.den.multiply(r.den));
	}
	public BigRationalN divide(BigRationalN r){
		return new BigRationalN(this.num.multiply(r.den), this.den.multiply(r.num));
	}
	
	public String toString(){
		if(den.equals(BigInteger.ONE)){
			return "" + num;
		} else {
			return num + "/" + den;
		}
	}
	private int gcd(int x, int y){
		int r = x % y;
		while(r != 0){
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}
	
	private BigInteger num;
	private BigInteger den;
}
