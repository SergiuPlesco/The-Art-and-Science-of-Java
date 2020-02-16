/*
 * File GLens.java
 *---------------
 * This class draws a lens on GCanvas with width and height as parameters
 */
import acm.graphics.*;
public class GLens extends GPolygon {
	public GLens(double width, double height){
		double r = (Math.pow(width, 2) + Math.pow(height, 2)) / (4 * width);
		
		/* x, y coordinates */
		double angle = GMath.angle(r - (width /2), height / 2);
		

		addVertex(width / 2, 0);// x, y in the left top corner 
//		addVertex(0, -height /2);// x, y in the center of lens
		addArc(r * 2, r * 2, -angle, angle * 2);
		addArc(r * 2, r * 2, 180 - angle, angle * 2);
		
	}
}
