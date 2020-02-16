/*
 * This program is modificaction of ex 3 from chapter 9
 * When the user press the mouse button on top of the GLabels temporaruly resets its color
 * to the one that matches the name. Releasing the mouse button should choose a new random
 *  color for the label.
 */
import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RandomColorLabel extends GraphicsProgram {
	public void init(){
		text = "Label";
		label = new GLabel(text);
		label.setFont("Arial-bold-48");
		xLabel = (getWidth() - label.getWidth()) / 2;
		yLabel = (getHeight() - label.getHeight()) / 2;
		add(label, xLabel, yLabel);
	
//		while(true){
			
			labelText = rgen.nextInt(1, 7);
			colorNum = rgen.nextInt(1, 7);
			
			if(labelText == colorNum){
				colorNum = rgen.nextInt(1, 7);
			}
			randomColor = chooseColor(colorNum);
			switch(labelText){
			case 1: text = "RED"; break;
			case 2: text = "ORANGE"; break;
			case 3: text = "YELLOW"; break;
			case 4: text = "GREEN"; break;
			case 5: text = "CYAN"; break;
			case 6: text = "BLUE"; break;
			case 7: text = "MAGENTA"; break;
			default: break;
			}
			label.setLabel(text);
			label.setLocation(xLabel, yLabel);
			label.setColor(randomColor);
//			pause(1000);
//		}
		
		addMouseListeners();
	
	}
	/* Called when user is pressing the mouse button */
	public void mousePressed(MouseEvent e){
		/*
		 * Set color for label matching label text
		 */
		labelXY = new GPoint(e.getPoint());
		gobj = getElementAt(labelXY);
		
		
		if(gobj != null){
			if(!(label.getLabel().equals(label.getColor()))){
				
				if(labelText != colorNum){
					colorNum = labelText;
				}
				randomColor = chooseColor(colorNum);
				switch(labelText){
				case 1: text = "RED"; break;
				case 2: text = "ORANGE"; break;
				case 3: text = "YELLOW"; break;
				case 4: text = "GREEN"; break;
				case 5: text = "CYAN"; break;
				case 6: text = "BLUE"; break;
				case 7: text = "MAGENTA"; break;
				default: break;
				}
				label.setLabel(text);
				label.setLocation((getWidth() - label.getWidth()) / 2, yLabel);
				label.setColor(randomColor);
			}
		}
	}
	
	public void mouseReleased(MouseEvent e){
		/*
		 * Set new random color for the label
		 */
		labelText = rgen.nextInt(1, 7);
		colorNum = rgen.nextInt(1, 7);
		
		if(labelText == colorNum){
			colorNum = rgen.nextInt(1, 7);
		}
		randomColor = chooseColor(colorNum);
		switch(labelText){
		case 1: text = "RED"; break;
		case 2: text = "ORANGE"; break;
		case 3: text = "YELLOW"; break;
		case 4: text = "GREEN"; break;
		case 5: text = "CYAN"; break;
		case 6: text = "BLUE"; break;
		case 7: text = "MAGENTA"; break;
		default: break;
		}
		label.setLabel(text);
		label.setLocation((getWidth() - label.getWidth()) / 2, yLabel);
		label.setColor(randomColor);
		
		
	}
	
	/* return different color */
	private int notThisColor(int num){
		int colorNum = num;
		while(colorNum == num){
			colorNum = rgen.nextInt(1, 7);
		}
		return colorNum;
	}
	/* return color depending on parameter */
	private Color chooseColor(int rNum){
		
		switch(rNum){
		case 1: return Color.RED;
		case 2: return Color.ORANGE;
		case 3: return Color.YELLOW;
		case 4: return Color.GREEN;
		case 5: return Color.CYAN;
		case 6: return Color.BLUE;
		case 7: return Color.MAGENTA;
		default: return Color.BLACK;
		}
	}

	
	
	int labelText;
	int colorNum;
	double xLabel;
	double yLabel;
	
	private String text;
	private Color randomColor;
	private GLabel label;
	private GObject gobj;
	private GPoint labelXY;
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
