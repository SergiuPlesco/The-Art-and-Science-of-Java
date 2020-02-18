/*
 * Chapter 12, exercise 2
 */
import acm.program.*;
public class IsSorted extends ConsoleProgram {
	public void run(){
		int[] array = {3, 8, 14, 25};
		boolean str = isSorted(array);
		println(str);
	}
	
	private boolean isSorted(int[] array){
	
		for(int i = 0; i < array.length - 1; i++){
			if(array[i] > array[i+1]){
				return false;
			}
		}
		return true;
	}
}
