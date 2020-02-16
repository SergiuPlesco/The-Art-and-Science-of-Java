/*
 * Chapter 9, exercise 2
 * Animate a black square so the color is changing randomly every second
 */
import java.awt.Color;
import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;


public class SquareRandomColor extends GraphicsProgram {
	public void run(){
		GRect rect = new GRect(RECT_SIZE, RECT_SIZE);
		double xRect = (getWidth() - rect.getWidth()) / 2;
		double yRect = (getHeight() - rect.getHeight()) / 2;
		rect.setFilled(true);
		rect.setColor(Color.BLACK);
		add(rect, xRect, yRect);
		
		while(true){
			 int RED = rgen.nextInt(0, 255);
			 int GREEN = rgen.nextInt(0, 255);
			 int BLUE = rgen.nextInt(0, 255);
			 Color RGB_COLOR = new Color(RED, GREEN, BLUE);
			rect.setColor(RGB_COLOR);
			pause(500);
		}
	}
	
	private static final double RECT_SIZE = 150;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	
	
}
