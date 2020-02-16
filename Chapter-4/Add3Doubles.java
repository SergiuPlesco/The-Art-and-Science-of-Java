/*
 * This program adds three doubles and prints their sum.
 */
import acm.program.*;
public class Add3Doubles extends DialogProgram {
	public void run() {
		println("This program adds three doubles precision numbers.");
		double n1 = readDouble("Enter n1: ");
		double n2 = readDouble("Enter n2: ");
		double n3 = readDouble("Enter n3: ");
		double total = n1 + n2 + n3;
		println("Total is: " + total + ".");
	}
}
