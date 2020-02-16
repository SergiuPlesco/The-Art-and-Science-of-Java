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
//		println("List of prime numbers up to " + n);
//		listOfPrimes(n);	
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
	

	/* Void method */
//	private void isPrime(int n){
//		boolean rem = false;;
//		for(int i = 2; i <= n/2; i++){
//			rem = n % i == 0;
//			if(rem){
//				rem = true;
//				break;
//			} 
//		}
//		if(!rem){
//			println(n + " is prime number.");
//		} else {
//			println(n + " is not prime number.");
//		}
//		
//		
//	}
//	private void listOfPrimes(int n){
//		boolean rem = false;
//		for(int i = 2; i <= n; i++){
//			for(int j = 2; j < i; j++){
//				rem = i % j == 0;
//				if(rem){
//					rem = true;
//					break;
//				}
//			}
//			if(!rem){
//				println(i);
//			} else {
////				println("composite " + i);
//			}
//		}
//	
//	}
}