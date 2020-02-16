/*
 * Chapter 11, exercise 7
 */
import acm.program.*;
import acm.graphics.*;
import java.util.*;
public class LineGraph extends GraphicsProgram {
	public void run(){
		double[] array = {8.2, 55.5, 28.8, 120.2, 48.0, 12.3, 34.8, 20.0, 45.0, 33.5, 85.2, 15.3, 75.2, 150.0};
	
		
		drawLineGraph(array);
	}
	
	private void drawLineGraph(double[] array){
		
		//get max and min value 
		double max = array[0];
		double min = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			} else if(array[i] < min){
				min = array[i];
			}
		}

		//x and y scales 
		double distance = (getWidth() - 2 * EDGE)/ array.length;
		double yScale = (getHeight() - 2 * EDGE) / max;
		//for loop that draws the points and lines
		for(int i = 0; i <= array.length; i++){
		//create new GOval and add to the canvas 
		point = new GOval(((distance * i) - 2.5) + EDGE, ((max - array[i]) - 2.5) * yScale + EDGE, 5, 5);
		point.setFilled(true);
		add(point);

		//coordinates for line
		x1 = distance * i + EDGE;
		y1 = (max - array[i]) * yScale + EDGE;
		
		x2 = distance * (i + 1) + EDGE;
		//stop if finished array
		if(i + 1 == array.length) break;
		y2 = (max - array[i + 1]) * yScale + EDGE;
		
		line = new GLine(x1, y1, x2, y2);
		add(line);

		
		}
		
	}
	double x1, y1, x2, y2;
	private GOval point;
	private GLine line;
	private static final int EDGE = 10;
}
