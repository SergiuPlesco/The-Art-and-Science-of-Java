/*
 * This program calculate quadratic equation from coefficients
 */
import acm.program.*;
public class QuadraticEquation extends ConsoleProgram {
	public void run(){
		int a = readInt("Enter 1st coefficient: ");
		int b = readInt("Enter 2nd coefficient: ");
		int c = readInt("Enter 3rd coefficient: ");
		if(squareRoot(a, b, c) < 0) {
			println("No solutions");
		} else {
			println("1st solution is: " + quadraticEquationPlus(a, b, c));
			println("2nd solution is: " + quadraticEquationMinus(a, b, c));
		}
	}
	private double quadraticEquationPlus(int a, int b, int c){
		double x1 = (-b + squareRoot(a, b, c)) / (2*a);
		return x1;
	}
	
	private double quadraticEquationMinus(int a, int b, int c){
		double x2 = (-b - squareRoot(a, b, c)) / (2*a);
		return x2;
	}
	private double squareRoot(int a, int b, int c){
		double sqrt = b*b - 4*a*c;
		
		return sqrt;
		
	}
}
