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
	
	}
}
