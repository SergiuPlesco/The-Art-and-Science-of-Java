/*
 * This program counts down with a while loop instead of for loop
 */
import acm.program.*;
public class CountDownWhile extends ConsoleProgram {
	public void run() {
		int t = START;
		while(t >= 0){
			println(t);
			t--;
		}
		println("Liftoff!");
	}
	private static final int START = 10;
}
