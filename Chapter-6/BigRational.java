import java.math.BigInteger;

import acm.program.*;
public class BigRational extends ConsoleProgram {
	public void run(){
		
		RationalBigNumber e;
		RationalBigNumber f;
		RationalBigNumber g;
		RationalBigNumber k;
		e = new RationalBigNumber(33325895, 4);
        f = new RationalBigNumber(2, 50000000);
        g = e.add(f);
        
        println(g);
//        
        BigRationalN x;
        BigRationalN y;
        BigRationalN z;
        BigRationalN t;
		x = new BigRationalN(33325895, 1000000000);
        y = new BigRationalN(2, 50000000);
        z = x.divide(y);
        
        println(z);
        
        BigRationalT a;
        BigRationalT b;
        BigRationalT c;
        BigRationalT d;
		a = new BigRationalT(33325895, 1000000000);
        b = new BigRationalT(2, 50000000);
        c = a.divides(b);
        
        println(c);
        
	}
}
