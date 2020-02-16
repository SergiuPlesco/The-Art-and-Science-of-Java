/*
 * This program converts Fahrenheit to Celcius.
 */
import acm.program.*;

public class FahrenheitToCelcius extends ConsoleProgram {
	public void run() {
		println("This program converts Fahrenheit to Celcius: ");
		double Fahrenheit = readDouble("Enter Fahrenheit temperature: ");
		
		/*
		 * Formula to converts Fahrenheit to Celcius
		 */
		double Celcius = (Fahrenheit - 32)*5/9;
		
		/*
		 * formula to convert Celcius to Fahrenheit
		 */
		/*
		 * Fahrenheit = (Celcius*5/9) + 32;
		 */
		println("Celcius equivalent = " + Celcius);
		
		
		int tollbooth = ((((((((((((((4 + 9 - 2) * 16 + 1) / 3) * 6) - 67) + 8) * 2) - 3) + 26) - 1) / 34) + 3) / 7) + 2) - 5;
		// result is 0 with mathemagician way or letf to right way
		int tollbooth2 = 4 + 9 - (2 * 16) + (1 / 3 * 6) - 67 + (8 * 2) - 3 + 26 - (1 / 34) + (3 / 7) + 2 - 5;
		//applying precedence result is -50
		println(tollbooth);
		println(tollbooth2);
	}
}
