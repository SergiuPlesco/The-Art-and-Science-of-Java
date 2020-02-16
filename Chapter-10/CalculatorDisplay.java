import java.awt.Font;

import acm.gui.DoubleField;
import acm.gui.IntField;


/*
 * This class defines the display for the calculator.
 */
public class CalculatorDisplay extends DoubleField {
	/* Creates a new calculator display */
	public CalculatorDisplay(){
		setEditable(false);
		setFont(new Font("SansSerif", Font.PLAIN, 24));
		setValue(0);
		setText("");
		startNewValue = false;
		op = null;
	}
	
	/* Adds a digit to the display, clearing the old value if startNewValue is set */
	public void addDigit(String digit){
		value = (startNewValue) ? "" : getText();
		setText(value + digit);
		startNewValue = false;
	}
	
	public void addPoint(String str){
		value = (startNewValue) ? "" : getText();
		if(!value.contains(str)){
			value += str;
		} 
		setText(value);
		startNewValue = false;
	}

	/* Sets a new operator, applying the previous one if one exists */
	public void setOperator(OperatorButton button){
		if(op == null){
			memory = Double.parseDouble(getText());
		} else {
			double fl = Double.parseDouble(getText());
			memory = op.apply(memory, fl);
			
			setValue(memory);
		}
		op = button;
		startNewValue = true;
	}
	
	/* Private instance variables */
	private OperatorButton op;     /* The last operator button pressed */
	private double memory;            /* The value to which the operator is applied */
	private boolean startNewValue; /* Set after an operator to start a new value */
	private String value;
	
	
}
