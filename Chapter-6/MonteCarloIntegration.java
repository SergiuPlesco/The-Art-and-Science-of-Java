/*
 * Monte Carlo Integration
 * 
 * Algorithm
 * 
 */
import acm.program.*;
import acm.util.*;
public class MonteCarloIntegration extends ConsoleProgram {
	public void run(){

		println("throwDart: " + throwDart());
		double dartsInCircle = 0;
		double dartsOnlySquare = 0;
		double dartsInSquare = 0;
		double PI = 0;
		for(int i = 0; i < 10000; i++){
			if(throwDart() < 1){
				dartsInCircle++;
			} 
			else {
				dartsOnlySquare++;
			}
		}
		dartsInSquare = dartsInCircle + dartsOnlySquare;
		PI = (dartsInCircle * 4) / dartsInSquare;
		
		println("Ratio: " + dartsInCircle/dartsInSquare);
		println("PI: " + PI);
		
	}
	private double throwDart(){
		double X = rgen.nextDouble(-1, 1);
		double Y = rgen.nextDouble(-1, 1);
		double throwDart = Math.pow(X, 2) + Math.pow(Y, 2);
		return  throwDart;
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
