/*
 * Check if number n is prime
 */
import acm.program.*;
public class PrimeNumber_n extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter number to check if is prime: ");
		if(isPrime(n)){
			println("true");
		} else {
			println("false");
		}
	}
	
	/* Boolean method */
	private boolean isPrime(int n){
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}
