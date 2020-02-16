/*
 * Draw house using stepwise refinement or top down decomposition to decompose into useful pieces
 */
import acm.graphics.*;
import acm.program.*;
public class DrawHouse extends GraphicsProgram {
	public void run(){
		double x = getWidth() / 2 - HOUSE_WIDTH / 2;
		double y = getHeight() - (HOUSE_HEIGHT + HOUSE_BASELINE);
		drawHouse(x, y);
		drawRoof(x, y);
		drawWindows(x, y);
		drawDoor(x, y);
	}
	
	private void drawHouse(double x, double y){
		double houseX = x;
		double houseY = y;
		GRect house = new GRect(houseX , houseY, HOUSE_WIDTH, HOUSE_HEIGHT);
		add(house);
	}
	private void drawRoof(double x, double y){
		double roofTopX = getWidth() / 2;
		double roofTopY = y - ROOF_HEIGHT;
		double roofBaseLeftX = x;
		double roofBaseY = y;
		double roofBaseRightX = x + HOUSE_WIDTH;
		add(new GLine(roofTopX, roofTopY, roofBaseLeftX, roofBaseY));
		add(new GLine(roofTopX, roofTopY, roofBaseRightX, roofBaseY));
	}
	private void drawWindows(double x, double y){
		drawTopWindows(x, y);
		drawBottomWindows(x, y);
	}
	private void drawTopWindows(double x, double y){
		drawTopLeftWindow(x, y);
		drawTopRightWindow(x, y);
	}
	private void drawTopLeftWindow(double x, double y){
		double insetX = 50;
		double insetY = 25;
		drawWindowPart(x + insetX, y + insetY);
		drawWindowPart(x + insetX + WINDOW_PART_WIDTH, y + insetY);
		drawWindowPart(x + insetX, y + insetY + WINDOW_PART_HEIGHT);
		drawWindowPart(x + insetX + WINDOW_PART_WIDTH, y + insetY + WINDOW_PART_HEIGHT);
	}
	
	private void drawTopRightWindow(double x, double y){
		double insetX = 50;
		double insetY = 25;
		drawWindowPart(x + HOUSE_WIDTH - insetX - WINDOW_PART_WIDTH * 2, y + insetY);
		drawWindowPart(x + HOUSE_WIDTH - insetX - WINDOW_PART_WIDTH, y + insetY);
		drawWindowPart(x + HOUSE_WIDTH - insetX - WINDOW_PART_WIDTH * 2, y + insetY + WINDOW_PART_HEIGHT);
		drawWindowPart(x + HOUSE_WIDTH - insetX - WINDOW_PART_WIDTH, y + insetY + WINDOW_PART_HEIGHT);
	}
	
	private void drawBottomWindows(double x, double y){
		drawBottomLeftWindow(x, y);
		drawBottomRightWindow(x, y);
	}
	
	private void drawBottomLeftWindow(double x, double y){
		double insetX = 40;
		double insetY = 15;
		drawWindowPart(x + insetX, y + HOUSE_HEIGHT - (insetY + HOUSE_BASELINE + WINDOW_PART_HEIGHT * 2));
		drawWindowPart(x + insetX + WINDOW_PART_WIDTH, y + HOUSE_HEIGHT - (insetY + HOUSE_BASELINE + WINDOW_PART_HEIGHT * 2));
		drawWindowPart(x + insetX + WINDOW_PART_WIDTH * 2, y + HOUSE_HEIGHT - (insetY + HOUSE_BASELINE + WINDOW_PART_HEIGHT * 2));
		drawWindowPart(x + insetX, y + HOUSE_HEIGHT - (insetY + HOUSE_BASELINE + WINDOW_PART_HEIGHT));
		drawWindowPart(x + insetX + WINDOW_PART_WIDTH, y + HOUSE_HEIGHT - (insetY + HOUSE_BASELINE + WINDOW_PART_HEIGHT));
		drawWindowPart(x + insetX + WINDOW_PART_WIDTH * 2, y + HOUSE_HEIGHT - (insetY + HOUSE_BASELINE + WINDOW_PART_HEIGHT));
	}
	
	private void drawBottomRightWindow(double x, double y){
		//fereastra are y deja la inaltimea ferestrei din stanga
		//este nevoie doar de x, de mutat in dreapta
		double insetX = 40;
		double brx = x + HOUSE_WIDTH - (insetX * 2 + WINDOW_PART_WIDTH * 3);
		double bry = y;// acest y este de la drawBottomLeftWindow care pune fereastra stanga la y potrivit din stanga
		drawBottomLeftWindow(brx, bry);
	}
	
	private void drawWindowPart(double x, double y){
		GRect windowPart = new GRect(x, y, WINDOW_PART_WIDTH, WINDOW_PART_HEIGHT);
		add(windowPart);
	}
	
	private void drawDoor(double x, double y){
		double doorX = x + HOUSE_WIDTH / 2 - DOOR_WIDTH / 2;
		double doorY = y + HOUSE_HEIGHT - DOOR_HEIGHT;
		GRect door = new GRect(doorX, doorY, DOOR_WIDTH, DOOR_HEIGHT);
		add(door);
		drawHandle(doorX + (DOOR_WIDTH - DOOR_WIDTH / 5), doorY + DOOR_HEIGHT / 2);
	}
	
	private void drawHandle(double x, double y) {
		double r = HANDLE_RADIUS;
		GOval handle = new GOval(x - r, y - r, 2 * r, 2 * r);
		add(handle);
	}
	
	/* Dimension of the house */
	private static final double HOUSE_WIDTH = 300;
	private static final double HOUSE_HEIGHT = 200;
	
	/*The height of the roof */
	private static final double ROOF_HEIGHT = 50;
	
	/* Dimension of a part of the window */
	private static final double WINDOW_PART_WIDTH = 20;
	private static final double WINDOW_PART_HEIGHT = 30;
	
	/* Dimensions of the door */
	private static final double DOOR_WIDTH = 50;
	private static final double DOOR_HEIGHT = 100;
	
	/* Door handle radius */
	private static final double HANDLE_RADIUS = 2;
	
	/* House distance from window's bottom */
	private static final double HOUSE_BASELINE = 10;
}
