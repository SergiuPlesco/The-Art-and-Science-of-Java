/*
 * Find largest value from a list of integers
 * ca sa afli cel mai mare numar dintr-un sir de numere se iau 2 numere care se 
 * compara intre ele. Primul numar este cel mai mare, apoi se compara cu urmatorul numar introdus.
 * daca urmatorul este mai mare decat cel mai mare, atunci cel mai mare este urmatorul.
 * Si se repeta pana este introdus 0 care indica ca loop-ul este finisat si sa arate cel mai mare numar.
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
