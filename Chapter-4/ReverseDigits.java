/*
 * This program reverses the digits in an integer.
 */
import acm.program.*;
public class ReverseDigits extends ConsoleProgram {
	public void run() {
		println("This program reverses the digits in an integer.");
		int N = readInt("Enter a positive integer: ");
		int reversedN = 0;
		int digit = 0;
		while(N > 0){
			
			digit = N % 10;
			N /= 10;
			println(digit);//i have every digit here
			
			reversedN = (reversedN * 10) + digit;			
/*
 * this program does not work if the first or last digit is 0
 */
		}
		println(reversedN);
	}
}
