/*
 * chapter 12, exercise 9
 */
import java.util.Arrays;

import acm.program.*;
public class InsertionSort extends ConsoleProgram {
	public void run(){
		int[] arr = {25, 55, 3, 8, 1, 85, 4, 2, 10};
		println(Arrays.toString(arr));
		insertionSort(arr);
		println(Arrays.toString(arr));
	}
	
	private void insertionSort(int[] array){
		for(int i = 1; i < array.length; i++){
			int key = array[i];
			int j = i - 1;
			
			while(j >= 0 && array[j] > key){
				array[j + 1] = array[j];
				j = j - 1;
			}
			
			array[j + 1] = key;
		}
		
		
	}
}
