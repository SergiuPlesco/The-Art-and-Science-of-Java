/*
 * This program counts digits of a given n integer
 */
import acm.program.*;
public class CountDigits_n extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter an integer to count number of digits: ");
		println("There are " + countDigits(n) + " digits in " + n);
	}
	private int countDigits(int n){
		int digits = 0;
		int dsum = 0;
		while(n > 0){
			dsum += n % 10;
			n /= 10;
			digits++;
		}
		return digits;
	}
}
