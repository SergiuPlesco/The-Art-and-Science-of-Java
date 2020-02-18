/*
 * Chapter 12, exercise 7
 */
import acm.program.*;
import acm.util.*;
public class Shuffle extends ConsoleProgram {
	public void run(){
		int[] array = new int[8];
		println("Sorted array: ");
		for(int i = 0; i < array.length; i++){
			array[i] = i + 1;
			println(array[i]);
		}
		println("Shuffled array: ");
		shuflle(array);
		for(int i = 0; i < array.length; i++){
			println(array[i]);
		}
	}
	
	private void shuflle(int[] array){
		for(int p1 = 0; p1 < array.length; p1++){
			int randPos = rgen.nextInt(array.length);
			swapElements(array, p1, randPos);
		}
	}

	
	private void swapElements(int[] array, int p1, int p2){
		int temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
	}
	
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
