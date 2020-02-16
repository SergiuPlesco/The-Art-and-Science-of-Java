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
		
//		int years = 0;
//		
//		//display the value of private int atomsRemained at the top
//		println("Atoms from private int atomsRemained: " + atomsRemained);
//		//prints number of atoms at the beginning of the decay
//		println("There are " + ATOMS_START + " atoms initially.");
//		
//		//prints remained atoms at the end of every year
//		while(atomsRemained > 0){	
		/*
		 * this atomsRemained is working because the variable with its value is 
		 * outside of run. And when its coming from halfLife method the while
		 * loop doesn't start again and again with same value
		 * and it needs a assignment with current value
		 */
//			years++;//counts years that takes to decay
//			
//			//prints how many atoms remained at the end of the years
//			println("There are: " + halfLife(atomsRemained) + " atoms at the end of year: " + years);
//		}
	}
	
	
	/*
	 * this is the method that decays the atoms
	 * in the beginning int atoms = atomsRemained = 10000
	 * after the loop int atoms = atomsRemained returned from halfLife
	 */
//	private int halfLife(int atoms){
////		int atomsRemained = atoms;
//		for(int i = 0; i < atoms ; i++){
//			boolean halfLife = rgen.nextBoolean();
//			if(halfLife){
//				atomsRemained--;
//			}
//		}
//		println("Atoms from halfLife method: " + atomsRemained);
//		return atomsRemained;
//		
//	}
	
	
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
