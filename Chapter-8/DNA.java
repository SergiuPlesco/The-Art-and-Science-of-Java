/*
 * Chapter 8, exercise 20, DNA
 * fint mathching DNA position
 * rules from the book: The art and science of java 
 * 
 */
import acm.program.*;
public class DNA extends ConsoleProgram {
	public void run(){
		String shortDNA = "TTGCC";
		String longDNA = "ATCTAACGGTACGTC";
		println("Binds at position: " + findFirstMatchingPosition(shortDNA, longDNA));
	}
	
	/*
	 * Returns the first index position at which the short DNA strand
	 * would bind to the long DNA strand, or -1 if not such position exists.
	 */
	private int findFirstMatchingPosition(String shortDNA, String longDNA){
		return longDNA.indexOf(matchingStrand(shortDNA));
	}
	
	/*
	 * Returns a string in which each base has been replaced by the counterpart
	 * base (C <-> G, A <-> T). Any other characters are replaced by an X.
	 */
	private String matchingStrand(String strand){
		String match = "";
		for(int i = 0; i < strand.length(); i++){
			match += matchingBase(strand.charAt(i));
		}
		return match;
	}
	
	/*
	 * Returns the character wich is the DNA match for the specified
	 * (C <-> G, A <-> T) base.
	 * Any other character returns an X.
	 */
	private char matchingBase(char base){
		switch(base){
		case 'C': return 'G';
		case 'G': return 'C';
		case 'A': return 'T';
		case 'T': return 'A';
		default: return 'X';
		}
	}
}
