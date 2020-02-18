/*
 * Largest, second largest and smallest.
 * 
 */
import acm.program.*;
public class SecondLargestValue extends ConsoleProgram {
	public void run() {
		
		int N = readInt("Enter first no: ");
		int max = N;
		int secondmax = N;
		int min = N;
		
		while(true){
			int nextN = readInt("Enter next no: ");
			if(nextN > max){
				secondmax = max;
				max = nextN;
			} else if(max == secondmax || (nextN > secondmax && nextN != max)){
				secondmax = nextN;
			} 
			if(nextN < min){
				if(nextN != SENTINEL){
					min = nextN;
				}
			}
			
			
			
			if(nextN == SENTINEL)break;
		}
		
		println("Largest value " + max);
		println("Second largest value: " + secondmax);
		println("Smallest: " + min);
		
	}
	private static final int SENTINEL = 0;
}
