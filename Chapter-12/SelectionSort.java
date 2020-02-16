/*
 * Chapter 12, exercise 3
 */
import java.util.ArrayList;

import acm.program.*;
public class SelectionSort extends ConsoleProgram {
	public void run(){
		int[] array = {31, 41, 59, 26, 53, 58, 97, 93};
		ArrayList<Integer> arrayList = new ArrayList<Integer>(){
			{
				add(31);
				add(41);
				add(59);
				add(26);
				add(53);
				add(58);
				add(97);
				add(93);
			}
		};
		sort(arrayList);
		
		
	}
	
	private void sort(ArrayList<Integer> array){
		for(int lh = 0; lh < array.size(); lh++){
			int rh = findSmallest(array, lh, array.size());
			swapElements(array, lh, rh);
			println(array.get(lh));
		}
	}
	
	private int findSmallest(ArrayList<Integer> array, int p1, int p2){
		int smallestIndex = p1;
		for(int i = p1 + 1; i < p2; i++){
			if(array.get(i) < array.get(smallestIndex)) {
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}
	
	private void swapElements(ArrayList<Integer> array, int p1, int p2){
		int temp = array.get(p1);
		array.set(p1, array.get(p2));
		array.set(p2, temp);
	}
	
//	private void sort(int[] array){
//		for(int lh = 0; lh < array.length; lh++){
//			int rh = findSmallest(array, lh, array.length);
//			swapElements(array, lh, rh);
//			println(array[lh]);
//		}
//	}
//	
//	private int findSmallest(int[] array, int p1, int p2){
//		int smallestIndex = p1;
//		for(int i = p1 + 1; i < p2; i++){
//			if(array[i] < array[smallestIndex]) {
//				smallestIndex = i;
//			}
//		}
//		return smallestIndex;
//	}
//	
//	private void swapElements(int[] array, int p1, int p2){
//		int temp = array[p1];
//		array[p1] = array[p2];
//		array[p2] = temp;
//	}
}
