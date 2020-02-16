/*
 * Chapter 9, ex 6, Pumpkin Pie
 */
import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
public class PumpkinPie extends GraphicsProgram{
	public void run(){
		double x = getWidth() / 2;
		double y = getHeight() / 2;

		double r = PIE_RADIUS;
		double startAngle = 0;
		double sweepAngle = 360 / N_SLICES;

		for(int i = 0; i < N_SLICES; i++){
			GArc arc = new GArc(2 * r, 2 * r, startAngle, sweepAngle);
			arc.setFilled(true);
			arc.setFillColor(PUMPKIN_COLOR);
			startAngle += 360 / N_SLICES;
			add(arc, x - r, y - r);
		}
	}
	
	private static final double PIE_RADIUS = 100;
	private static final double N_SLICES = 7;
	private static final Color PUMPKIN_COLOR = new Color(255, 117, 24);
}
