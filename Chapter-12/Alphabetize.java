/*
 * Chapter 12, exercise 4
 */
import acm.program.*;
public class Alphabetize extends ConsoleProgram {
	public void run(){
		String[] array = {
				"Exception",
				"processing",
				"usually",
				"involves",
				"two",
				"different",
				"methods",
		};
		
		alphabetize(array);
		
	}
	
	public void alphabetize(String[] array){
		for(int lh = 0; lh < array.length; lh++){
			int rh = findSmallest(array, lh, array.length);
			swapElements(array, lh, rh);
			println(array[lh]);
		}
	}
	
	public int findSmallest(String[] array, int p1, int p2){
		int smallestIndex = p1;
		for(int i = p1 + 1; i < p2; i++){
			if(array[i].compareToIgnoreCase(array[smallestIndex]) < 0){
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}
	
	
	private void swapElements(String[] array, int p1, int p2){
		String temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
	}
}
