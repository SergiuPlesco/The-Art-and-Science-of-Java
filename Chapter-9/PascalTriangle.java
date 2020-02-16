/*
 * Chapter 9, ex. 10, Pascal Triangle
 */
import acm.program.*;
import acm.graphics.*;
public class PascalTriangle extends GraphicsProgram {
	public void run(){
		int n = 0;
		double r = 20;//circle radius
		String combinations = "";//integer to string the result of combinations
		GLabel label = new GLabel("");//result of combinations();
		double y = 50;//y of label and circle
		double x = getWidth() / 2 - label.getWidth() / 2;//x of label and circle

		for(int k = 0; k <= n; k++){
			combinations = Integer.toString(combinations(n, k));//integer to string the result of combinations
			label = new GLabel(combinations);
			add(label, x, y);
			
			GOval circle = new GOval(2 * r, 2 * r);
			add(circle, x - r + label.getWidth() / 2, y - r - label.getAscent() / 2);
			pause(500);
			x+=60;//move x with 60
			
			if(k == n){
				//update variables
				n++;
				y+=50;
				k = -1;
				x = getWidth() / 2 - (((label.getWidth() * n) / 2 + 60 * (n)) / 2 );
			}
			//if circle goes outside the window - break
			if(circle.getY() > getHeight() || circle.getX() > getWidth()) break;
		}
		
	}
	private int combinations(int n, int k){
		return factorial(n) / (factorial(k) * factorial(n - k));
	}
	private int factorial(int n){
		int result = 1;
		for(int i = 1; i <= n; i++){
			result *= i;
		}
		return result;
	}
}
