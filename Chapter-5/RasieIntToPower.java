/*
 * 1. Raise integer to power
 * 2. Raise integer to the power of 0 to 10
 */
import acm.program.*;
public class RasieIntToPower extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter base integer: ");
		int k = readInt("Enter power integer: ");
//		println(n + " to the power " + k + " is: " + (int)raiseIntToPower(n, k));
		println("The table of " + n + " to the power from 0 to " + k +" is: ");
		raiseIntToPowerTable(n, k);
	}
//	private double raiseIntToPower(int n, int k){
//		double power = Math.pow(n, k);
//		return power;
//	}
	private void raiseIntToPowerTable(int n, int k){
		for(int i = 0; i <= k; i++){
			double power = Math.pow(n, i);
			println(n + " to the power of " + i + " is: " + (int)power);
		}
		
	}
}
