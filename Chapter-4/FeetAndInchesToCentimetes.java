/*
 * This program converts feet and inches to centimeters
 */
import acm.program.*;

public class FeetAndInchesToCentimetes extends ConsoleProgram {
	public void run() {
		println("This program converts feet and inches to centimeters");//Waht the program does
		double feet = readDouble("Enter number of feet: ");//Get feet from user
		double inches = readDouble("Enter number of inches: ");//Get inches from user
		
		/*Transform feet and inches to centimeters
		 * 
		 * */
		double totalCentimeters = (feet * CENTIMETERS_PER_FOOT) + (inches * CENTIMETERS_PER_INCH);
		println((int)feet + "ft " + (int)inches + "in " + "= " + totalCentimeters + "cm");//Print the result to screen
	}
	private static final double CENTIMETERS_PER_FOOT = 30.48;  
	private static final double CENTIMETERS_PER_INCH = 2.54;
}
