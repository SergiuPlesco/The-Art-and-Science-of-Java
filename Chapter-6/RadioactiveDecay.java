/*
 * Radioactive Decay
 * How many years it takes for the 10000 atoms to decay every year 
 * with 50% probability
 */
import acm.program.*;
import acm.util.*;
public class RadioactiveDecay extends ConsoleProgram {
	
	//private static final int ATOMS_START = 10000;//constant at the start
	//private int atomsRemained = ATOMS_START;//variable to track remained atoms after 50% decay
	public void run(){
		int atomsStart = readInt("How many atoms you have? ");
		int percentage = readInt("What is the % of decaying? ");
		double percentageDecay = (double)percentage / 100;
		println(percentageDecay);
		println("There are " + atomsStart + " initially, decaying at " + percentage + "% every year.");
		int atomsRemained = atomsStart;
		int years = 0;
		while(atomsRemained > 0){
			
			for(int i = 0; i < atomsRemained ; i++){
				boolean halfLife = rgen.nextBoolean(percentageDecay);
				if(halfLife){
					atomsRemained--;
				}
			}
			years++;
			println("There are " + atomsRemained + " at the end of year " + years);
			
		}
		
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
