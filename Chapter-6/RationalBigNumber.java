import java.math.BigInteger;

import acm.util.ErrorException;

/**
 * The Rational class is used to represent 
 * @author sergi
 *
 */
public class RationalBigNumber {
	public RationalBigNumber(){
		this(0);
	}
	public RationalBigNumber(int n){
		this(n, 1);
	}
	public RationalBigNumber(int x, int y){
		if(y == 0) throw new ArithmeticException("Division by 0");
		int g =gcd(Math.abs(x), Math.abs(y));
		num = BigInteger.valueOf(x).divide(BigInteger.valueOf(g));
		den = BigInteger.valueOf(Math.abs(y)).divide(BigInteger.valueOf(g));
		if(y < 0) num = num.negate();
	}
	public RationalBigNumber add(RationalBigNumber r){
		return new RationalBigNumber(this.num.multiply( r.den) .add(r.num .multiply( this.den)).intValue(),
                this.den .multiply( r.den).intValue());
	}
	public RationalBigNumber subtract(RationalBigNumber r){
		return new RationalBigNumber(this.num.multiply(r.den).subtract(r.num.multiply(this.den)).intValue(),
									 this.den.multiply(r.den).intValue());
	}
	public RationalBigNumber multiply(RationalBigNumber r){
		return new RationalBigNumber(this.num.multiply(r.num).intValue(), this.den.multiply(r.den).intValue());
	}
	public RationalBigNumber divide(RationalBigNumber r){
		return new RationalBigNumber(this.num.multiply(r.num).intValue(), this.den.multiply(r.den).intValue());
	}
	public String toString(){
		if(den == BigInteger.ONE){
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
