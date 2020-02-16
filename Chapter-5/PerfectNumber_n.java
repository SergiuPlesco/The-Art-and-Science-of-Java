/*
 * Check if n is perfect number 
 * 
 * Display perfect numbers between 1 and 9999
 */
import acm.program.*;
public class PerfectNumber_n extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter number to check if is perfect: ");


		isPerfect(n);

		println("List of perfect numbers: ");
		listOfPerfectNumbers();
	}
	
	
	private boolean isPerfect(int n){
		int divisor;
		int sum = 0;

		for(int i = 1; i < n; i++){
			if(n % i == 0){
				divisor = i;
				sum += divisor;
//				println(divisor);
			}
		}
		
		if(sum == n){
//			println(sum + " is perfect");
//			succes = true;
			return true;
		}
		else {
//			println(sum + " is not perfect");
//			succes = false;
			return false;
		}
		
		
		
	}
	
	private void listOfPerfectNumbers(){
			
		
		for(int i = 1; i < 10000; i++){
			if(isPerfect(i)){
				println(i);
			}
		}
		
	}
}
