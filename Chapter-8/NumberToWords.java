/*
 * Chapter 8, exercese 14, transform numbers to words
 * plus if number is negative
 * the logic is copied from internet
 */
import acm.program.*;
public class NumberToWords extends ConsoleProgram {
	public void run(){
		
		while(true){
			int n = readInt("Enter a number: ");
				println(numberToWords(n));
		}
	}
	
	private static String numberToWords(int n){
		String num = "";
			if(n == 0) return "zero";
			if (n < 0) { 
                // convert the number to a string
                String numberStr = "" + n;
                // remove minus before the number 
                numberStr = numberStr.substring(1);
                // add minus before the number and convert the rest of number
                return "minus " + numberToWords(Integer.parseInt(numberStr));
			} 
			
			if((n / BILLION) > 0){
				num += numberToWords(n / BILLION) + " billions ";
				n %= BILLION;
			}
			if((n / MILLION) > 0){
				num += numberToWords(n / MILLION) + " millions ";
				n %= MILLION;
			}
			
			if ((n / THOUSAND) > 0) {
				num += numberToWords(n / THOUSAND) + " thousand ";
				n %= THOUSAND;
			}
			
			if((n / HUNDRED) > 0){
				num += numberToWords(n / HUNDRED) + " hundred ";
				n %= HUNDRED;
			}
			
			if(n > 0){
				// check if number is within teens
				if(n < 20){
					// fetch the appropriate value from numNames
					num += numNames.values()[n];
				} else {
					// fetch the appropriate value from tensNames
					num += tensNames.values()[(n / 10)];
					if((n % 10) > 0){
						num += "-" + numNames.values()[(n % 10)];
					}
				}
			}
		return num;
	}
	private enum tensNames  {
		zero,// because it counts indexes from 0 to ...
	    ten,
	    twenty,
	    thirty,
	    forty,
	    fifty,
	    sixty,
	    seventy,
	    eighty,
	    ninety,
	  };
	  private enum numNames {
		  zero,// because it counts indexes from 0 to ...
		  one,
		  two,
		  three,
		  four,
		  five,
		  six,
		  seven,
		  eight,
		  nine,
		  ten,
		  eleven,
		  twelve,
		  thirteen,
		  fourteen,
		  fifteen,
		  sixteen,
		  seventeen,
		  eighteen,
		  nineteen
	  }
	  private static final int BILLION = 1000000000;
	  private static final int MILLION = 1000000;
	  private static final int THOUSAND = 1000;
	  private static final int HUNDRED = 100;
}
