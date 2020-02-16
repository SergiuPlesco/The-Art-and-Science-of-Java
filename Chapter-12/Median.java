/*
 * Chapter 12, exercise 5
 */
import acm.program.*;
public class Median extends ConsoleProgram {
	public void run(){
		double[] array = {2.5, 25.8, 15.3, 18.2};
		double med = median(array);
		println(med);
		
	}
	
	private double median(double[] array){
		int median = array.length / 2;
		if(array.length % 2 != 0){
			return array[median];
		} else {
			return (array[median - 1] + array[median]) / 2;
		}
		
	}
}

