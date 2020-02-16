/*
 * This program calls a method fibonacci(n) to caluclate
 * the n-th Fibonacci number.
 */
import acm.program.*;
public class Fibonacci_n extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter n to calculate Fibonacci sequence: ");
		fibonacci(n);
	}
	
	private void fibonacci(int n){
		int start = 0;
		int sequence = 1;
				
		for(int i = 0; i <= n; i++){
			
			println( "The sequence for " + i + " is: " + start);
			
			int addPrevious = start + sequence;
			start = sequence;
			sequence = addPrevious;
		}
	}
}
