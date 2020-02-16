/*
 * House of usher using stepwise refinement
 */
import acm.graphics.*;
import acm.program.*;
public class DrawHouseOfUsher extends GraphicsProgram {
	public void run(){
		double x = getWidth();
		double y = getHeight();
		houseOfUsher(x, y);
	}
	
	private void houseOfUsher(double x, double y){
		drawLeftPillar(x, y);
		drawRightPillar(x, y);
		drawHouse(x, y);
		drawTrees(x, y);
	}
	private void drawLeftPillar(double x, double y){
		double leftPillarX = x - x + LEFT_INSET;
		double leftPillarY = y - (PILLAR_BODY_HEIGHT + BASELINE);
		drawPillar(leftPillarX, leftPillarY);
		
		double leftLineX1 = leftPillarX + PILLAR_BODY_WIDTH / 2;
		double leftLineY1 = leftPillarY - PILLAR_ROOF_HEIGHT;
		double leftLineX2 = leftPillarX;
		double leftLineY2 = leftPillarY;
		GLine leftLine = new GLine(leftLineX1, leftLineY1, leftLineX2, leftLineY2);
		
		double rightLineX1 = leftLineX1;
		double rightLineY1 = leftLineY1;
		double rightLineX2 = leftPillarX + PILLAR_BODY_WIDTH;
		double rightLineY2 = leftLineY2;
		GLine rightLine = new GLine(rightLineX1, rightLineY1, rightLineX2, rightLineY2);
		add(leftLine);
		add(rightLine);
		
	}
	
	private void drawRightPillar(double x, double y){
		double rightPillarX = x - x + LEFT_INSET + HOUSE_WIDTH + PILLAR_BODY_WIDTH;
		double rightPillarY = y - (PILLAR_BODY_HEIGHT + BASELINE);
		drawPillar(rightPillarX, rightPillarY);
		
		double leftLineX1 = rightPillarX + PILLAR_BODY_WIDTH / 2;
		double leftLineY1 = rightPillarY - PILLAR_ROOF_HEIGHT;
		double leftLineX2 = rightPillarX;
		double leftLineY2 = rightPillarY;
		GLine leftLine = new GLine(leftLineX1, leftLineY1, leftLineX2, leftLineY2);
		
		double rightLineX1 = leftLineX1;
		double rightLineY1 = leftLineY1;
		double rightLineX2 = rightPillarX + PILLAR_BODY_WIDTH;
		double rightLineY2 = leftLineY2;
		GLine rightLine = new GLine(rightLineX1, rightLineY1, rightLineX2, rightLineY2);
		add(leftLine);
		add(rightLine);
	}
	
	private void drawPillar(double x, double y){
		GRect pillarBody = new GRect(x, y, PILLAR_BODY_WIDTH, PILLAR_BODY_HEIGHT);
		add(pillarBody);
	}
	private void drawHouse(double x, double y){
		drawHouseBody(x, y);
		drawHouseRoof(x, y);
		drawHouseDoor(x, y);
	}
	private void drawHouseBody(double x, double y){
		double houseX = x - x + LEFT_INSET + PILLAR_BODY_WIDTH;
		double houseY = y - BASELINE - HOUSE_HEIGHT;
		GRect houseBody = new GRect(houseX, houseY, HOUSE_WIDTH, HOUSE_HEIGHT);
		add(houseBody);
		
		drawHouseWindows(x, y);
	}
	private void drawHouseWindows(double x, double y){
		leftWindow(x, y);
		rightWindow(x, y);
	}
	private void leftWindow(double x, double y){
		double windowX = x - x + LEFT_INSET + PILLAR_BODY_WIDTH + HOUSE_WIDTH / 4;
		double windowY = y - BASELINE - HOUSE_HEIGHT + HOUSE_HEIGHT / 4;
		drawWindow(windowX, windowY);
	}
	
	private void rightWindow(double x, double y){
		double windowX = x - x + LEFT_INSET + PILLAR_BODY_WIDTH + ((HOUSE_WIDTH / 4) * 3);
		double windowY = y - BASELINE - HOUSE_HEIGHT + HOUSE_HEIGHT / 4;
		drawWindow(windowX, windowY);
	}
	
	private void drawWindow(double x, double y){
		double r = HOUSE_WINDOW_RADIUS;
		GOval window = new GOval(x - r, y - r, 2 * r, 2 * r);
		add(window);
	}
	private void drawHouseDoor(double x, double y){
		double doorX = x - x + LEFT_INSET + PILLAR_BODY_WIDTH + HOUSE_WIDTH / 2 - HOUSE_DOOR_WIDTH / 2;
		double doorY = y - BASELINE - HOUSE_DOOR_HEIGHT;
		GRect houseDoor = new GRect(doorX, doorY, HOUSE_DOOR_WIDTH, HOUSE_DOOR_HEIGHT);
		add(houseDoor);
		
		/*House door angle roof */
		double leftLineX1 = doorX + HOUSE_DOOR_WIDTH / 2;
		double leftLineY1 = doorY - HOUSE_DOOR_ROOF_HEIGHT;
		double leftLineX2 = doorX;
		double leftLineY2 = doorY;
		add(new GLine(leftLineX1, leftLineY1, leftLineX2, leftLineY2));
		
		double rightLineX1 = leftLineX1;
		double rightLineY1 = leftLineY1;
		double rightLineX2 = leftLineX2 + HOUSE_DOOR_WIDTH;
		double rightLineY2 = leftLineY2;
		add(new GLine(rightLineX1, rightLineY1, rightLineX2, rightLineY2));
	}
	
	private void drawHouseRoof(double x, double y){
		double leftLineX1 = x - x + LEFT_INSET + PILLAR_BODY_WIDTH + HOUSE_WIDTH / 2;
		double leftLineY1 = y - BASELINE - HOUSE_HEIGHT - HOUSE_ROOF_HEIGHT;
		double leftLineX2 = x - x + LEFT_INSET + PILLAR_BODY_WIDTH;
		double leftLineY2 = y - BASELINE - HOUSE_HEIGHT;
		add(new GLine(leftLineX1, leftLineY1, leftLineX2, leftLineY2));
		
		double rightLineX1 = leftLineX1;
		double rightLineY1 = leftLineY1;
		double rightLineX2 = leftLineX2 + HOUSE_WIDTH;
		double rightLineY2 = leftLineY2;
		add(new GLine(rightLineX1, rightLineY1, rightLineX2, rightLineY2));
	}
	
	private void drawTrees(double x, double y){
		firstTree(x, y);
		secondTree(x, y);
		thirdTree(x, y);
	}
	private void firstTree(double x, double y){
		double firstTreeX = x / 2 + (x / 8 - TREE_BODY_WIDTH / 2);
		double firstTreeY = y - BASELINE - TREE_BODY_HEIGHT;
		treeBody(firstTreeX, firstTreeY);
		
		double leftLineX1 = firstTreeX + TREE_BODY_WIDTH / 2;
		double leftLineY1 = firstTreeY - TREE_ANGLE_HEIGHT;
		double leftLineX2 = firstTreeX;
		double leftLineY2 = firstTreeY;
		add(new GLine(leftLineX1, leftLineY1, leftLineX2, leftLineY2));
		
		double rightLineX1 = leftLineX1;
		double rightLineY1 = leftLineY1;
		double rightLineX2 = leftLineX2 + TREE_BODY_WIDTH;
		double rightLineY2 = leftLineY2;
		add(new GLine(rightLineX1, rightLineY1, rightLineX2, rightLineY2));
	}
	
	private void secondTree(double x, double y){
		double secondTreeX = x / 2 + ((x / 8 - TREE_BODY_WIDTH / 2) * 2);
		double secondTreeY = y - BASELINE - TREE_BODY_HEIGHT;
		treeBody(secondTreeX, secondTreeY);
		
		double leftLineX1 = secondTreeX + TREE_BODY_WIDTH / 2;
		double leftLineY1 = secondTreeY - TREE_ANGLE_HEIGHT;
		double leftLineX2 = secondTreeX;
		double leftLineY2 = secondTreeY;
		add(new GLine(leftLineX1, leftLineY1, leftLineX2, leftLineY2));
		
		double rightLineX1 = leftLineX1;
		double rightLineY1 = leftLineY1;
		double rightLineX2 = leftLineX2 + TREE_BODY_WIDTH;
		double rightLineY2 = leftLineY2;
		add(new GLine(rightLineX1, rightLineY1, rightLineX2, rightLineY2));
	}
	
	private void thirdTree(double x, double y){
		double thirdTreeX = x / 2 + ((x / 8 - TREE_BODY_WIDTH / 2) * 3);
		double thirdTreeY = y - BASELINE - TREE_BODY_HEIGHT;
		treeBody(thirdTreeX, thirdTreeY);
		
		double leftLineX1 = thirdTreeX + TREE_BODY_WIDTH / 2;
		double leftLineY1 = thirdTreeY - TREE_ANGLE_HEIGHT;
		double leftLineX2 = thirdTreeX;
		double leftLineY2 = thirdTreeY;
		add(new GLine(leftLineX1, leftLineY1, leftLineX2, leftLineY2));
		
		double rightLineX1 = leftLineX1;
		double rightLineY1 = leftLineY1;
		double rightLineX2 = leftLineX2 + TREE_BODY_WIDTH;
		double rightLineY2 = leftLineY2;
		add(new GLine(rightLineX1, rightLineY1, rightLineX2, rightLineY2));
		
	}
	
	private void treeBody(double x, double y){
		GRect treeBody = new GRect(x, y, TREE_BODY_WIDTH, TREE_BODY_HEIGHT);
		add(treeBody);
	}
	
	/* Dimensions of the pillars */
	private static final double PILLAR_BODY_WIDTH = 40;
	private static final double PILLAR_BODY_HEIGHT = 350;
	private static final double PILLAR_ROOF_HEIGHT = 90;
	
	/* Dimensions of the house between pillars */
	private static final double HOUSE_WIDTH = 250;
	private static final double HOUSE_HEIGHT = 250;
	private static final double HOUSE_ROOF_HEIGHT = 150;
	private static final double HOUSE_WINDOW_RADIUS = 15;
	private static final double HOUSE_DOOR_WIDTH = 40;
	private static final double HOUSE_DOOR_HEIGHT = 100;
	private static final double HOUSE_DOOR_ROOF_HEIGHT = 30;
	
	/* Dimensions of the decayed trees */
	private static final double TREE_BODY_WIDTH = 30;
	private static final double TREE_BODY_HEIGHT = 200;
	private static final double TREE_ANGLE_HEIGHT = 110;
	
	/* Baseline of the house of usher */
	private static final double BASELINE = 10;
	private static final double LEFT_INSET = 20;
	
	/* House and pillar total width */
	private static final double HOUSE_PILLAR_WIDTH = PILLAR_BODY_WIDTH * 2 + HOUSE_WIDTH;
}
