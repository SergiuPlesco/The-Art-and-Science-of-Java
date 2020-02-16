/*
 * This program is singing a song for long bus trips.
 */
import acm.program.*;
public class Bottles extends ConsoleProgram {
	public void run() {
		int i = Bottles; //initialization of index i to number of bottles
		while(i > 0) { 
			println(i + " bottles of beer on the wall.");
			println(i + " bottles of beer.");
			println("You take one down, pass it around.");
			i--;
			println((i) + " bottles of beer on the wall" );
			println(" ");
		}
	}
	private static final int Bottles = 99;//The number of bottles
}
