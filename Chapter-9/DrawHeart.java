/*
 * Draw a heart wit hGArc and GLine
 * Chapter 9, ex. 7
 */
import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
public class DrawHeart extends GraphicsProgram {
	public void run(){
		double x = getWidth() / 2;
		double y = getHeight() / 2;
		double scale = 1;
//		double scale
		/*
		 * Draw Heart with GPolygon and fill with color
		 */
		GPolygon heart = new GPolygon();
		heart.addVertex(-70.72, 0);
		heart.addEdge(70.72, 70.72);
		heart.addEdge(70.72, -70.72);
		heart.addArc(100, 100, -45, 180);
		heart.addArc(100, 100, 45, 180);
		heart.setFilled(true);
		heart.setColor(Color.RED);
		heart.scale(1);
		add(heart, x, y);
		while(true){
			scale = 1.01;
			heart.scale(scale);
			pause(200);
			scale = 0.9;
			heart.scale(scale);
			pause(200);
			scale = 1.1;
			heart.scale(scale);
			pause(200);
			
		}
		
		
		
		
		
		
		
		/*
		 *Draw Heart with GLine and GArc
		 * 
		double d = 70.71; //half of square diagonal with side = 100
		GLine leftSide = new GLine(x, y + d, x - d, y);
		GLine rightSide = new GLine(x, y + d, x + d, y);
		GArc leftArc = new GArc(2 * 50, 2 * 50, 225, -180);
		GArc rightArc = new GArc(2 * 50, 2 * 50, 135, -180);
		add(leftSide);
		add(rightSide);
		//(circle diameter - d(70.71)) / 2 = 14,645 pixels to move outside the square left corner, and right corner
		add(leftArc, x - 85.355, y - 85.355); //85.355 = d + 14.645
		add(rightArc, x - 14.645, y - 85.355);
		 */
	}
	
}
