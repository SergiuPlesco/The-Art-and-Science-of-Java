/*
 * This program calulates digital root of an integer
 */
import acm.program.*;
public class DigitalRoot extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a positive integer: ");
//		int dsum = 0;
		int digital = 0;
		
		//digital root este insumarea cifrelor unui numar pana cand ramane doar o cifra sau restul cand se face % la 9
			while(n > 0 || digital > 9) {//atat timp cat n > 0 sau digital > 9
				if(n == 0) {//daca n == 0 
					n = digital; //atunci n = digital adica 0
					digital = 0; // si digital = 0 pentru ca sa se adune rezultatul
				}                //de la operatia de mai jos
				digital += n % 10; // daca n > 0 atunci ajunge aici si de face % 10 si restul se aduna la digital
				n /= 10; //n este n impartit la 10 pentru urmatorul ciclu
			}
		
			println(digital);
			
	
		
	
	}
}
