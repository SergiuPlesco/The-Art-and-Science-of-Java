/*
 * Find largest value from a list of integers
 */
import acm.program.*;
public class LargestValue extends ConsoleProgram {
	public void run() {
		int N = readInt("Enter first no: ");
		int largestV = N;
		
		while(true){
			int nextN = readInt("Enter next no: ");
			if(nextN > largestV){
				if(nextN != SENTINEL){
					largestV  = nextN;
				}
			}
			
			if(nextN == SENTINEL)break;
		}
		
		println("Largest value " + largestV);
	}
	
	private static final int SENTINEL = 0;
}
