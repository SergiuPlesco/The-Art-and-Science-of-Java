/*
 * This program displays the integers between 1 and 100 that are divisible
 * by either 6 or 7 but not both
 */
import acm.program.*;
public class SixesAndSevens extends ConsoleProgram {
	public void run() {
		println("This program displays the integers between 1 and 100 that are divisible");
		println("by either 6 or 7 but not both");
		for(int i = 1; i <= 100; i++){
		if(i%6 == 0 || i%7 == 0) {
			if (!(i%6 == 0 && i%7 == 0)){//not sure if second if is necesary
				println(i);
			}
		}
		
		}
	}
}
