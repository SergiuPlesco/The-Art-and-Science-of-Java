import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class BigRationalT implements Comparable<BigRationalT> {

    public final static BigRationalT ZERO = new BigRationalT(0);
    public final static BigRationalT ONE  = new BigRationalT(1);
    public final static BigRationalT TWO  = new BigRationalT(2);

    private BigInteger num;   // the numerator
    private BigInteger den;   // the denominator (always a positive integer)


    // create and initialize a new BigRational object
    public BigRationalT(int numerator, int denominator) {
        this(BigInteger.valueOf(numerator), BigInteger.valueOf(denominator));
    }

    // create and initialize a new BigRational object
    public BigRationalT(int numerator) {
        this(numerator, 1);
    }

    // create and initialize a new BigRational object from a string, e.g., "-343/1273"
    public BigRationalT(String s) {
        String[] tokens = s.split("/");
        if (tokens.length == 2)
            init(new BigInteger(tokens[0]), new BigInteger(tokens[1]));
        else if (tokens.length == 1)
            init(new BigInteger(tokens[0]), BigInteger.ONE);
        else
            throw new IllegalArgumentException("For input string: \"" + s + "\"");
    }

    // create and initialize a new BigRational object
    public BigRationalT(BigInteger numerator, BigInteger denominator) {
        init(numerator, denominator);
    }

    private void init(BigInteger numerator, BigInteger denominator) {

        // deal with x / 0
        if (denominator.equals(BigInteger.ZERO)) {
           throw new ArithmeticException("Denominator is zero");
        }

        // reduce fraction (if num = 0, will always yield den = 0)
        BigInteger g = numerator.gcd(denominator);
        num = numerator.divide(g);
        den = denominator.divide(g);

        // to ensure invariant that denominator is positive
        if (den.compareTo(BigInteger.ZERO) < 0) {
            den = den.negate();
            num = num.negate();
        }
    }

    // return string representation of (this)
    public String toString() { 
        if (den.equals(BigInteger.ONE)) return num + "";
        else                            return num + "/" + den;
    }

    // return { -1, 0, + 1 } if a < b, a = b, or a > b
    public int compareTo(BigRationalT b) {
        BigRationalT a = this;
        return a.num.multiply(b.den).compareTo(a.den.multiply(b.num));
    }

    // is this BigRational negative, zero, or positive?
    public boolean isZero()     { return num.signum() == 0; }
    public boolean isPositive() { return num.signum() >  0; }
    public boolean isNegative() { return num.signum() <  0; }

    // is this Rational object equal to y?
    public boolean equals(Object y) {
        if (y == this) return true;
        if (y == null) return false;  
        if (y.getClass() != this.getClass()) return false;
        BigRationalT b = (BigRationalT) y;
        return compareTo(b) == 0;
    }
        
    // hashCode consistent with equals() and compareTo()
//    public int hashCode() {
//        return Objects.hash(num, den);
//    }
    

    // return a * b
    public BigRationalT times(BigRationalT b) {
        BigRationalT a = this;
        return new BigRationalT(a.num.multiply(b.num), a.den.multiply(b.den));
    }

    // return a + b
    public BigRationalT plus(BigRationalT b) {
        BigRationalT a = this;
        BigInteger numerator   = a.num.multiply(b.den).add(b.num.multiply(a.den));
        BigInteger denominator = a.den.multiply(b.den);
        return new BigRationalT(numerator, denominator);
    }

    // return -a
    public BigRationalT negate() {
        return new BigRationalT(num.negate(), den);
    }

    // return |a|
    public BigRationalT abs() {
        if (isNegative()) return negate();
        else return this;
    }

    // return a - b
    public BigRationalT minus(BigRationalT b) {
        BigRationalT a = this;
        return a.plus(b.negate());
    }

    // return 1 / a
    public BigRationalT reciprocal() {
        return new BigRationalT(den, num);
    }

    // return a / b
    public BigRationalT divides(BigRationalT b) {
        BigRationalT a = this;
        return a.times(b.reciprocal());
    }

    // return double reprentation (within given precision)
    public double doubleValue() {
        int SCALE = 32;        // number of digits after the decimal place
        BigDecimal numerator   = new BigDecimal(num);
        BigDecimal denominator = new BigDecimal(den);
        BigDecimal quotient    = numerator.divide(denominator, SCALE, RoundingMode.HALF_EVEN);
        return quotient.doubleValue();
    }
}