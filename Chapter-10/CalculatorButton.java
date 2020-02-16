/*
 * This abstract class is the superclass for every calculator button. Every button must define
 * an action method, which is called whenever the button is clicked.
 */
import java.awt.Font;

import javax.swing.JButton;

abstract class CalculatorButton extends JButton {
	
	/* Create a new CalculatorButton with the specified name */
	public CalculatorButton(String name) {
		super(name);
		setFont(new Font("SansSerif", Font.PLAIN, 16));
	}
	
	/* Called when the button is clicked (every subclass must implement this method */
	public abstract void action(CalculatorDisplay display);
		
}
	
	/*
	 * This class is used for each of the digit buttons. The action consists of
	 * adding the digit used as a label on the button, which is returned by getText.
	 */
class DigitButton extends CalculatorButton {
		 /* Creates a new DigitButton for the digit n */
		public DigitButton(int n){
			super("" + n);
		}
		
		/* Adds this digit to the display */
		public void action(CalculatorDisplay display){
			display.addDigit((getText()));
		}
}

/////////////////////////////////////////
class PointButton extends CalculatorButton {
	 /* Creates a new DigitButton for the digit n */
	public PointButton(){
		super(".");
	}
	
	/* Adds this digit to the display */
	public void action(CalculatorDisplay display){
		display.addPoint(getText());
	}
}


/////////////////////////////////////////


	/*
	 * This abstract class is the superclass of the various operator buttons.
	 * Each concrete subclass must override the apply method.
	 */
abstract class OperatorButton extends CalculatorButton {
		/* Creates a new OperatorButton with specified name */
		public OperatorButton(String name){
			super(name);
		}
		
		/* Informs the display that this operator button has been clicked */
		public void action(CalculatorDisplay display){
			display.setOperator(this);
		}
		/* Applies this operator (every subclass must implement this method */
		public abstract double apply(double lhs, double rhs);
}

/*
 * The classes AddButton, SubtractButton, MultiplyButton, and DivideButton
 * are the same except for their label and the implementation of apply. 
 */
class AddButton extends OperatorButton {
	public AddButton() {
		super("+");
	}
	public double apply(double lhs, double rhs){
		return lhs + rhs;
	}
}

class SubtractButton extends OperatorButton {
	public SubtractButton(){
		super("-");
	}
	public double apply(double lhs, double rhs) {
		return lhs - rhs;
	}
}

class MultiplyButton extends OperatorButton {
	public MultiplyButton(){
		super("x");
	}
	public double apply(double lhs, double rhs){
		return lhs * rhs;
	}
}

class DivideButton extends OperatorButton {
	public DivideButton() {
		super("/");
	}
	public double apply(double lhs, double rhs){
		return lhs / rhs;
	}
}

class ModulButton extends OperatorButton {
	public ModulButton() {
		super("%");
	}
	public double apply(double lhs, double rhs){
		return lhs % rhs;
	}
}

/*
 * The EqualsButton class displays the current value. As it happens, this
 * operation can be implemented simply by setting the operator to null.
 */
class EqualsButton extends CalculatorButton {
	public EqualsButton(){
		super("=");
	}
	public void action(CalculatorDisplay display){
		display.setOperator(null);
	}
}

/*
 *  The ClearButton class resets the calculator by setting the operator to null and the display
 *  value to 0.
 */
class ClearButton extends CalculatorButton {
	public ClearButton(){
		super("C");
	}
	public void action(CalculatorDisplay display){
		display.setOperator(null);
		display.setValue(0);
	}
}

//class PointButton extends CalculatorButton {
//	public PointButton() {
//		super(".");
//	}
//	public void action(CalculatorDisplay display){
//		display.setText(getText());
//		
//	}
//}


























