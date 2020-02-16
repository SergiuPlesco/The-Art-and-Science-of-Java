/*
 * DrawTrain method.
 * Adding the methods drawSmokestack, drawCab, drawCowcatcher, drawCaboose
 */
import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
public class DrawTrain extends GraphicsProgram {
	public void run(){
		double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
		double x = (getWidth() - trainWidth) / 2;
		double y = getHeight();
		double dx = CAR_WIDTH + CONNECTOR;
		drawEngine(x, y);
		drawBoxcar(x + dx, y, Color.GREEN);
		drawCaboose(x + 2 * dx, y, Color.RED);
	}
	
	private void drawEngine(double x, double y){
		drawCarFrame(x, y, Color.BLACK);
		drawSmokestack(x, y, Color.BLACK);
		drawCab(x, y, Color.BLACK);
		drawCowcatcher(x, y);
	}
	
	private void drawBoxcar(double x, double y, Color color){
		drawCarFrame(x, y, color );
		double xRight = x + CONNECTOR + CAR_WIDTH / 2;
		double xLeft = xRight - DOOR_WIDTH;
		double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
		add(new GRect(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GRect(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
	}
	
	private void drawCaboose(double x, double y, Color color){
		drawCarFrame(x, y, color);
		drawCupola(x, y, Color.RED);
	}
	
	private void drawCarFrame(double x, double y, Color color){
		double x0 = x + CONNECTOR;
		double y0 = y - CAR_BASELINE;
		double top = y0 - CAR_HEIGHT;
		add(new GLine(x, y0, x + CAR_WIDTH + 2 * CONNECTOR, y0));
		drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
		drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
		GRect r = new GRect(x0, top, CAR_WIDTH, CAR_HEIGHT);
		r.setFilled(true);
		r.setFillColor(color);
		add(r);
	}
	
	private void drawWheel(double x, double y){
		double r = WHEEL_RADIUS;
		GOval wheel = new GOval(x - r, y - r, 2 * r, 2 * r);//x - r si y - r pune x si y in centru
		wheel.setFilled(true);
		wheel.setFillColor(Color.GRAY);
		add(wheel);
	}
	private void drawSmokestack(double x, double y, Color color){
		double stackX = x + SMOKESTACK_INSET + CONNECTOR;
		double stackY = y - (SMOKESTACK_HEIGHT + CAR_HEIGHT + CAR_BASELINE);
		GRect Smokestack = new GRect(stackX, stackY, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
		Smokestack.setFilled(true);
		Smokestack.setFillColor(color);
		add(Smokestack);
	}
	
	private void drawCab(double x, double y, Color color){
		double CabX = x + CAR_WIDTH - CAB_WIDTH + CONNECTOR;
		double CabY = y -(CAB_HEIGHT + CAR_HEIGHT + CAR_BASELINE);
		GRect Cab = new GRect(CabX, CabY, CAB_WIDTH, CAB_HEIGHT);
		Cab.setFilled(true);
		Cab.setFillColor(color);
		add(Cab);
	}
	
	private void drawCowcatcher(double x, double y){
		double cowcatcherX1 = x + CONNECTOR;
		double cowcatcherY1 = y - CAR_HEIGHT / 2 - CAR_BASELINE ;
		double cowcatcherX2 = cowcatcherX1 - CONNECTOR;
		double cowcatcherY2 = y - CAR_BASELINE ;
		add(new GLine(cowcatcherX1, cowcatcherY1, cowcatcherX2, cowcatcherY2));
		add(new GLine(cowcatcherX1, cowcatcherY1, cowcatcherX2 + CONNECTOR / 2, cowcatcherY2));
	}
	
	private void drawCupola(double x, double y, Color color){
		double cupolaX = x + CONNECTOR + CAR_WIDTH/2 - CUPOLA_WIDTH/2;
		double cupolaY = y - (CUPOLA_HEIGHT + CAR_HEIGHT + CAR_BASELINE);
		GRect cupola = new GRect(cupolaX, cupolaY, CUPOLA_WIDTH, CUPOLA_HEIGHT);
		cupola.setFilled(true);
		cupola.setFillColor(color);
		add(cupola);
	}
	
	/* Dimensions of the frame of a train car */
	private static final double CAR_WIDTH = 75 * 3;
	private static final double CAR_HEIGHT = 36 * 3;
	
	/* Distance from the bottom of a train car to the track below it */
	private static final double CAR_BASELINE = 10 * 3;
	
	/* Width of th econnector, which overlaps between successive cars */
	private static final double CONNECTOR = 6 * 3;
	
	/* Radius of the wheels on each car */
	private static final double WHEEL_RADIUS = 6 * 3;
	
	/* Distance from the edge of the frame to the center of the wheel */
	private static final double WHEEL_INSET = 16 * 3;
	
	/* Dimensions of th ecab on the engine */
	private static final double CAB_WIDTH = 35 * 3;
	private static final double CAB_HEIGHT = 8 * 3;
	
	/* Dimensions of the smokestack and its distance from the front */
	private static final double SMOKESTACK_WIDTH = 8 * 3;
	private static final double SMOKESTACK_HEIGHT = 8 * 3;
	private static final double SMOKESTACK_INSET = 8 * 3;
	
	/* Dimensions of the door panels on the boxcar */
	private static final double DOOR_WIDTH = 18 * 3;
	private static final double DOOR_HEIGHT = 32 * 3;
	
	/* Dimensions of the cupola on the caboose */
	private static final double CUPOLA_WIDTH = 35 * 3;
	private static final double CUPOLA_HEIGHT = 8 * 3;
	
}
