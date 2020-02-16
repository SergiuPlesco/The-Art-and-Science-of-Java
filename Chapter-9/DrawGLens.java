/*
 * Draw GLens
 */
import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
public class DrawGLens extends GraphicsProgram {
	public void run(){
		double width = 50;
		double height = 150;
		
			
		GLens lens = new GLens(width, height);
		lens.setFilled(true);
		lens.setFillColor(Color.GRAY);
		add(lens, getWidth() / 2 - width / 2, getHeight() / 2 - height / 2);

		/* Draws a grect with same size as GLens to test dimensions and position of GLens*/
		GRect rect = new GRect(width, height);
		add(rect, getWidth() / 2 - width / 2, getHeight() / 2 - height / 2);
	}
}
