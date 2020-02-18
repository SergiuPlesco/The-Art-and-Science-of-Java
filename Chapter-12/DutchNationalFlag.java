/*
 * Chapter 12, exercise 8
 */
import java.util.Arrays;

import acm.program.*;
public class DutchNationalFlag extends ConsoleProgram {
	public void run(){
		char[] arrayRandom = {'R', 'B', 'W', 'W', 'B', 'B', 'R', 'W', 'W', 'R', 'R', 'W', 'R', 'B', 'W', };
		dutchFlag(arrayRandom);
	}
	
	private void dutchFlag(char[] arrayRandom){
		println("Initial state: ");
		println(Arrays.toString(arrayRandom));
		char[] arrayBase = {'R', 'R', 'R', 'R', 'R', 'W', 'W', 'W', 'W', 'W', 'W', 'B', 'B', 'B', 'B',};
		
		int low = 0;
		int mid = 0;
		int high = arrayRandom.length - 1;
		
		while(mid <= high){
			if(arrayRandom[mid] == 'R'){
				swap(arrayRandom, low, mid);
				low++;
				mid++;
				println("after swapping position " + low + " with " + mid);
				println(Arrays.toString(arrayRandom));
			} else if(arrayRandom[mid] == 'W'){
				mid++;
			} else if(arrayRandom[mid] == 'B'){
				swap(arrayRandom, mid, high);
				high--;
				println("after swapping position " + mid + " with " + high);
				println(Arrays.toString(arrayRandom));
			}
		}
	}
	
	private void swap(char[] array, int p1, int p2){
		char temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
	}
}
