/*
 * Length converter program. Chapter 10, ecercise 11
 */
import acm.graphics.*;
import acm.gui.*;
import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class LengthConverter extends Program {
	public void init(){
		setLayout(new TableLayout(3, 2));
		//JComboBox
		leftCombo = leftComboBox();
		rightCombo = rightComboBox();
		//DoubleField
		leftDisplay = new DoubleField();
		leftDisplay.setActionCommand("Convert >>");
		leftDisplay.addActionListener(this);
		rightDisplay = new DoubleField();
		rightDisplay.setActionCommand("<< Convert");
		rightDisplay.addActionListener(this);
		//JButton
		leftBtn = new JButton("Convert >>");
		leftBtn.setActionCommand("Convert >>");
		rightBtn = new JButton("<< Convert");
		
		//add JComboBoxes
		add(leftCombo);
		add(rightCombo);
		//add Displays
		add(leftDisplay);
		add(rightDisplay);
		//add Buttons
		add(leftBtn);
		add(rightBtn);
		
		addActionListeners();
	}
	
	private JComboBox leftComboBox(){
		leftCombo = new JComboBox();
		leftCombo.addItem(new LengthUnit("Inches"));
		leftCombo.addItem(new LengthUnit("Feet"));
		leftCombo.addItem(new LengthUnit("Yards"));
		leftCombo.addItem(new LengthUnit("Fathoms"));
		leftCombo.addItem(new LengthUnit("Rods"));
		leftCombo.addItem(new LengthUnit("Furlongs"));
		leftCombo.addItem(new LengthUnit("Miles"));
		leftCombo.setEditable(false);
		leftCombo.setSelectedItem(new LengthUnit("Inches"));
		return leftCombo;
	}
	private JComboBox rightComboBox(){
		rightCombo = new JComboBox();
		rightCombo.addItem("Inches");
		rightCombo.addItem("Feet");
		rightCombo.addItem("Yards");
		rightCombo.addItem("Fathoms");
		rightCombo.addItem("Rods");
		rightCombo.addItem("Furlongs");
		rightCombo.addItem("Miles");
		rightCombo.setEditable(false);
		rightCombo.setSelectedItem("Inches");
		return rightCombo;
	}
	
	private double getLeftUnit(){
		String leftUnit = (String)leftCombo.getSelectedItem();
		double val = 0;
		if(leftUnit.equals("Inches")){
			val = 1;
		} else if(leftUnit.equals("Feet")){
			val = 12;
		} else if(leftUnit.equals("Yards")){
			val = 36;
		}  else if(leftUnit.equals("Miles")){
			val = 63360;
		}  else if(leftUnit.equals("Fathoms")){
			val = 72;
		}  else if(leftUnit.equals("Rods")){
			val = 198;
		}  else if(leftUnit.equals("Furlongs")){
			val = 7920;
		} 
		return val;
	}
	private double getRightUnit(){
		String rightUnit = (String)rightCombo.getSelectedItem();
		double val = 0;
		if(rightUnit.equals("Inches")){
			val = 1;
		} else if(rightUnit.equals("Feet")){
			val = 12;
		} else if(rightUnit.equals("Yards")){
			val = 36;
		}  else if(rightUnit.equals("Miles")){
			val = 63360;
		}  else if(rightUnit.equals("Fathoms")){
			val = 72;
		}  else if(rightUnit.equals("Rods")){
			val = 198;
		}  else if(rightUnit.equals("Furlongs")){
			val = 7920;
		} 
		return val;
	}
	
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		double result = 0;
		double leftUnitValue = ((LengthUnit) leftCombo.getSelectedItem()).getUnit();
		//if left button is pressed, calculate and show result in right display
		if(cmd.equals("Convert >>")){
			result = (leftDisplay.getValue() * leftUnitValue) / getRightUnit();
			rightDisplay.setValue(result);
//			println();
		//if right button is pressed, calculate and show result in left display
		} else if(cmd.equals("<< Convert")){
			result = (rightDisplay.getValue() * getRightUnit()) / leftUnitValue;
			leftDisplay.setValue(result);
		}
	}
	
	/*
	 *  Private instance variables
	 */
	private JComboBox leftCombo, rightCombo;
	private DoubleField leftDisplay, rightDisplay;
	private JButton leftBtn, rightBtn;
}
