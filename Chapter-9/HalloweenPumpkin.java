/*
 * Chapter 9, ex. 5, draw a Halloween Pumpkin
 */
import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
public class HalloweenPumpkin extends GraphicsProgram {
	public void run(){
		double x = getWidth() / 2;
		double y = getHeight() / 2;
		double r = PUMPKIN_RADIUS;
		
		GOval pumpkin = new GOval( x - r, y - r, 2 * r, 2 * r);
		pumpkin.setFilled(true);
		pumpkin.setColor(PUMPKIN_COLOR);
		
		GRect stem = new GRect(x - STEM_WIDTH / 2, y - (PUMPKIN_RADIUS + STEM_HEIGHT), STEM_WIDTH, STEM_HEIGHT);
		stem.setFilled(true);
		stem.setColor(Color.BLACK);
		
		GPolygon nose = createTriangle(NOSE_EYE_WIDTH, NOSE_EYE_HEIGHT);
		nose.setFilled(true);
		nose.setColor(Color.BLACK);
		
		GPolygon leftEye = createTriangle(NOSE_EYE_WIDTH, NOSE_EYE_HEIGHT);
		leftEye.setFilled(true);
		leftEye.setColor(Color.BLACK);
		leftEye.rotate(180);
		
		GPolygon rightEye = createTriangle(NOSE_EYE_WIDTH, NOSE_EYE_HEIGHT);
		rightEye.setFilled(true);
		rightEye.setColor(Color.BLACK);
		rightEye.rotate(180);
		
		GPolygon mouth = createMouth(150, 50);
		mouth.setFilled(true);
		mouth.setColor(Color.BLACK);
		
		add(pumpkin);
		add(stem);
		add(nose, x, y);
		add(leftEye, x - (PUMPKIN_RADIUS / 3), y - (PUMPKIN_RADIUS / 3));
		add(rightEye, x + (PUMPKIN_RADIUS / 3), y - (PUMPKIN_RADIUS / 3));
		add(mouth, x, y);
	}
	
	private GPolygon createTriangle(double width, double height){
		GPolygon poly = new GPolygon();
		poly.addVertex(0, -NOSE_EYE_HEIGHT / 2);
		poly.addVertex(NOSE_EYE_WIDTH / 2, NOSE_EYE_HEIGHT / 2);
		poly.addVertex(-NOSE_EYE_WIDTH / 2, NOSE_EYE_HEIGHT / 2);
		return poly;
	}
	private GPolygon createMouth(double width, double height){
		GPolygon mouth = new GPolygon();
		mouth.addVertex(0, MOUTH_HEIGHT);
		mouth.addEdge(MOUTH_WIDTH / 10, MOUTH_HEIGHT / 3);
		mouth.addEdge((MOUTH_WIDTH / 10), -(MOUTH_HEIGHT / 3));
		mouth.addEdge((MOUTH_WIDTH / 10), (MOUTH_HEIGHT / 3));
		mouth.addEdge((MOUTH_WIDTH / 10), -(MOUTH_HEIGHT / 3));
		mouth.addEdge((MOUTH_WIDTH / 10), (MOUTH_HEIGHT / 3));
		
		mouth.addEdge(-(MOUTH_WIDTH / 10) * 2, (MOUTH_HEIGHT / 3) * 2);
		
		mouth.addEdge(-(MOUTH_WIDTH / 10), -(MOUTH_HEIGHT / 3));
		mouth.addEdge(-(MOUTH_WIDTH / 10), (MOUTH_HEIGHT / 3));
		mouth.addEdge(-(MOUTH_WIDTH / 10), -(MOUTH_HEIGHT / 3));
		mouth.addEdge(-(MOUTH_WIDTH / 10), (MOUTH_HEIGHT / 3));
		mouth.addEdge(-(MOUTH_WIDTH / 10), -(MOUTH_HEIGHT / 3));
		mouth.addEdge(-(MOUTH_WIDTH / 10), (MOUTH_HEIGHT / 3));
		
		mouth.addEdge(-(MOUTH_WIDTH / 10) * 2, -(MOUTH_HEIGHT / 3) * 2);
		
		mouth.addEdge((MOUTH_WIDTH / 10), -(MOUTH_HEIGHT / 3));
		mouth.addEdge((MOUTH_WIDTH / 10), (MOUTH_HEIGHT / 3));
		mouth.addEdge((MOUTH_WIDTH / 10), -(MOUTH_HEIGHT / 3));
		mouth.addEdge((MOUTH_WIDTH / 10), (MOUTH_HEIGHT / 3));
		mouth.addEdge((MOUTH_WIDTH / 10), -(MOUTH_HEIGHT / 3));
		
		return mouth;
	}
	
	private static final double PUMPKIN_RADIUS = 100;
	private static final Color PUMPKIN_COLOR = new Color(255, 117, 24);
	private static final double STEM_WIDTH = 5;
	private static final double STEM_HEIGHT = 10;
	private static final double NOSE_EYE_WIDTH = 20;
	private static final double NOSE_EYE_HEIGHT = 20;
	private static final double MOUTH_WIDTH = 100;
	private static final double MOUTH_HEIGHT = 30;
	

}
