/*
 * Largest, second largest and smallest.
 * Avem nevoie de 3 variabile - max, seconadmax si min toate sunt egale cu primul numar introdus.
 * Se compara numerele. NextN se compara cu max, daca este mai mare ca max, atunci secondmax este max dar
 * max este nextN(pentru ca nextN este mai mare decat max).
 * 
 * Daca max este egal cu secondmax sau nextN este mai mare ca secondmax si in acelasi timp Nextn nu este egal cu max
 * atunci secondmax este egal cu nextN.
 * 
 * min este nextN daca nextN este mai mic decat min de la inceput.
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
