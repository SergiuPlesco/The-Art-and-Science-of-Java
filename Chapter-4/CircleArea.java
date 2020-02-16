/*
 * This program computes the circle area with radius from user.
 */
import acm.program.*;
public class CircleArea extends ConsoleProgram {
	public void run(){
		println("This program calculates area of a circle with given radius.");
		double radius = readDouble("Enter circle radius: ");
		
		/*
		 * Formula to calculate circle area.
		 * 
		 */
		double circleArea = PI * (radius * radius);
		
		println("The circle area with " + radius + " is " + circleArea);
	}
	private static final double PI = 3.1415926535;
}
