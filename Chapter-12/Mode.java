/*
 * Chapter 12, exercise 6
 */
import acm.program.*;
public class Mode extends ConsoleProgram {
	public void run(){
		double[] array = {65, 82, 95, 75, 84, 79, 84, 72, 82, 94, 86, 90, 84};
		double modeResult = mode(array);
		println(modeResult);
	}
	
	public double mode(double[] array){
		int temp = 0;
		double mode = 0;
		
		for(int i = 0; i < array.length; i++){
			int count = 0;
			for(int j = 0; j < array.length; j++){
				if(array[i] == array[j]){
					count++;
				}
			}
			if(temp < count){
				temp = count;
				mode = array[i];
			}
		}
		println(temp);
		return mode;
	}
}
