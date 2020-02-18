/*
 * Chapter 12, exercise 10
 */
import acm.program.*;
import java.util.*;

public class RadixSort extends ConsoleProgram {
	public void run(){
		int[] array = {45, 15, 888, 2, 36, 54, 12560};
		println(Arrays.toString(array));
		radixSort(array);
		println(Arrays.toString(array));
	}
	
	private void radixSort(int[] array){
	
		int max = getMax(array);

		for(int position = 1; max / position > 0; position *= 10){
			countSort(array, position);
		}
	}
	
	private int getMax(int[] array){
		int max = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		return max;
	}
	
	private void countSort(int[] array, int position){
		int[] buckets = new int[array.length];
		int[] count = new int[10];
		//count how many same digit 
		for(int i = 0; i < array.length; i++){
			count[(array[i] / position) % 10]++;
		}
		//arrange the correct position 
		for(int i = 1; i < count.length; i++){
			count[i] = count[i] + count[i - 1];
		}
		//build sorted array
		for(int i = array.length - 1; i >= 0; i--){
			buckets[--count[(array[i] / position) % 10]]= array[i];
		}
		//update initial array 
		for(int i = 0; i < array.length; i++){
			array[i] = buckets[i];
		}
		println(Arrays.toString(array));
	}
}
