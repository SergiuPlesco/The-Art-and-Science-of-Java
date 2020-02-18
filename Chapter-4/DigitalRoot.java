/*
 * This program calulates digital root of an integer
 */
import acm.program.*;
public class DigitalRoot extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a positive integer: ");
		int digital = 0;
		
			while(n > 0 || digital > 9) {
				if(n == 0) {
					n = digital; 
					digital = 0; 
				}              
				digital += n % 10; 
				n /= 10;
			}
			println(digital);
	}
}
