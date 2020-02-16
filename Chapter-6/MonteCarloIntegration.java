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
		
//		println("x: " + X);
//		println("y: " + Y);
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
//	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	
	/*
	 * int i;                                                               
   	 int nThrows = 0;                                             
   	 int nSuccess = 0;                                            
   									
   	 double x, y;                                                 
   									
   	 for (i = 0; i < 1000000 ; i++)                         
   	 {                                                            
   	    x = Math.random();      // Throw a dart                   
   	    y = Math.random();                                                
   									
   	    nThrows++;                                                        
   									
   	    if ( x*x + y*y <= 1 )             
   	       nSuccess++;                                               
   	 }                                                            
   									
   	 System.out.println("Pi/4 = " + (double)nSuccess/(double)nThrows );
   	 System.out.println("Pi = " + 4*(double)nSuccess/(double)nThrows );
      
	 */
}
