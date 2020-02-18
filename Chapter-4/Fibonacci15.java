/*
 * Program to display the values in Fibonacci sequence from F0 to F15.
 */
import acm.program.*;
public class Fibonacci15 extends ConsoleProgram {
	public void run() {
		
		int start = 0;// first value of Fibonacci
		int sequence = 1;//initates second value of Fibonacci
		
		for(int i = 0; i <= Fibb; i++){
			
			println("F" + i + " = " + start);
			
			int addPreceding = start + sequence;
			start = sequence;
			sequence = addPreceding;
		}
	}
	private final static int Fibb = 15;
}
