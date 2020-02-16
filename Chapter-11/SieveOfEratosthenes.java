/*
 * Chapter 11, exercise 6
 */
import acm.program.*;
import java.util.*;
public class SieveOfEratosthenes extends ConsoleProgram {
	public void run(){
		int n = 1000;
		sieveOfEratosthenes(n);
	
	}
	private void sieveOfEratosthenes(int n){
		
		boolean[] prime = new boolean[n + 1];
		/*
		 * Initialize the list(array) from 0 to n
		 */
		for(int i = 0; i < n; i++){
			prime[i] = true;
		}
		
		//mark multiples of prime
		for(int p = 2; p*p <=n; p++){
			
			if(prime[p] == true){
				//mark multiple with false
				for(int i = p*p; i <= n; i += p){
					prime[i] = false;
				}
			}
		}
		//print all primes
		for(int i = 2; i < n; i++){
			if(prime[i] == true){
				println(i);
			}
		}
	}
}
