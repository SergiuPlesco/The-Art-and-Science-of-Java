/*
 * displays sequence below 10000;
 */
import acm.program.*;
public class FibonacciBelow10K extends ConsoleProgram {
	public void run() {
		int start = 0;
		int sequence = 1;
		
		int i = 1;
		while(start < SENTINEL) {
			
			println("F" + i + " = " + start);//Fibonacci stsrt with 0
			
			int addPreceding = start + sequence;// adds preceding values
			start = sequence;// equalize with previous value
			sequence = addPreceding;// generates the Fibonacci sequence with the loop
			
			i++;
		}
	}
	private static final int SENTINEL = 10000;
}
