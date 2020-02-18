/*
 * Target program to use createFilledCircle method
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	public void run(){
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		double radius = OUTER_RADIUS;
		for(int i = N_CIRCLES; i > 0 ; i--){
			add(createCircle(cx , cy, radius, (i % 2 != 0) ? Color.RED : Color.BLUE));
			radius -=16.25;
		}
	}
	
	private GOval createCircle(double x, double y, double r, Color color){
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
	
	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;
}
