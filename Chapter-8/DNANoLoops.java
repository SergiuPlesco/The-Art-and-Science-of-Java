/*
 * Find first match DNA strand
 */
import acm.program.*;
public class DNANoLoops extends ConsoleProgram {
	public void run(){
		String shortDNA = "TTGCC";
		String longDNA = "ATCTAACGGTACGTC";
		println("Binds at position: " + findFirstMatchingPosition(shortDNA, longDNA));
	}
	
	private int findFirstMatchingPosition(String shortDNA, String longDna){
		String pattern = shortDNA;
		pattern = pattern.replace('C', 'g');
		pattern = pattern.replace('G', 'c');
		pattern = pattern.replace('A', 't');
		pattern = pattern.replace('T', 'a');
		return longDna.indexOf(pattern.toUpperCase());
	}
}
