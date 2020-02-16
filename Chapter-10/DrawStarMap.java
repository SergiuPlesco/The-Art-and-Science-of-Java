import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * This program creates a five-pointed star every time the 
 * user clicks the mouse on the canvas. This version includes a JButton to clear the screen,
 * a JSlider to choose the size, and a JComboBox to choose the color.
 * @author sergi
 *
 */
public class DrawStarMap extends GraphicsProgram {
	
	/* Initializes the graphical user interface*/
	public void init(){
		setBackground(Color.GRAY);
		clearBtn = new JButton("Clear");
		clearBtn.setActionCommand("Clear");
		clearBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				removeAll();
			}
			
		});
		add(clearBtn, SOUTH);
		sizeSlider = new JSlider(MIN_SIZE, MAX_SIZE, INITIAL_SIZE);
		add(new JLabel(" Small"), SOUTH);
		add(sizeSlider, SOUTH);
		add(new JLabel("Large "), SOUTH);
		initColorChooser();
		add(colorChooser, SOUTH);
		
		add(new JLabel(" Star name "), SOUTH);
		textField = new JTextField(15);
		textField.addKeyListener(this);

		add(textField, SOUTH);
		
		addMouseListeners();
		addKeyListeners();
		addActionListeners();
	
	}
	// not working!!!!!!!!
	
	/* Called whenever an action event occurs */
//	public void actionPeformed(ActionEvent e){
//		if(e.getActionCommand().equals("Clear")){
//			removeAll();
//			println("Y");
//			
//		} 
//	}
	
	
	/* Initializes the color chooser */
	private void initColorChooser(){
		colorChooser = new JComboBox();
		colorChooser.addItem(new LabeledColor(Color.WHITE, "WHITE"));
		colorChooser.addItem(new LabeledColor(Color.RED, "RED"));
		colorChooser.addItem(new LabeledColor(Color.YELLOW, "YELLOW"));
		colorChooser.addItem(new LabeledColor(Color.ORANGE, "ORANGE"));
		colorChooser.addItem(new LabeledColor(Color.GREEN, "GREEN"));
		colorChooser.addItem(new LabeledColor(Color.BLUE, "BLUE"));
		colorChooser.addItem(new LabeledColor(Color.BLACK, "BLACK"));
		colorChooser.addItem(new LabeledColor(Color.MAGENTA, "MAGENTA"));
		colorChooser.addItem(new LabeledColor(Color.CYAN, "CYAN"));
		colorChooser.setEditable(false);
		colorChooser.setSelectedItem(new LabeledColor(Color.WHITE, "WHITE"));
	}
	
	/* Returns the current color */
	private Color getCurrentColor(){
		String name = (String) colorChooser.getSelectedItem();
		if(name.equals("Red")) return Color.RED;
		if(name.equals("Yellow")) return Color.YELLOW;
		if(name.equals("Orange")) return Color.ORANGE;
		if(name.equals("Green")) return Color.GREEN;
		if(name.equals("Blue")) return Color.BLUE;
		if(name.equals("Black")) return Color.BLACK;
		return Color.WHITE;
	}
	
	/* Returns the current size */
	private double getCurrentSize(){
		return sizeSlider.getValue();
	}
	
	/* Called whenever the user clicks the mouse */
	public void mouseClicked(MouseEvent e){
		if(gobj != null) {
			gobj.sendToFront();
		} else if(gobj == null){
			star = new GStar(getCurrentSize());
			star.setFilled(true);
			star.setColor((Color)colorChooser.getSelectedItem()); // or use getCurrentColor() method
			add(star, e.getX(), e.getY());
		}
	 
	}
	
	/*Called whenever the user presses the mouse */
	public void mousePressed(MouseEvent e){
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
	}
	
	/* Called when mouse dragged */
	public void mouseDragged(MouseEvent e){
		if(gobj != null){
  			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
  			last = new GPoint(e.getPoint());
  		}
	}
	
	/* Called when arrow keys a pressed */
	public void keyPressed(KeyEvent e){
		if(gobj != null){
			switch(e.getKeyCode()){
			case KeyEvent.VK_UP: gobj.move(0, -1); break;
			case KeyEvent.VK_DOWN: gobj.move(0, +1); break;
			case KeyEvent.VK_LEFT: gobj.move(-1, 0); break;
			case KeyEvent.VK_RIGHT: gobj.move(+1, 0); break;
			case KeyEvent.VK_DELETE: remove(gobj); break;
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			String str = textField.getText();
			label = new GLabel(str);
			label.setColor((Color)colorChooser.getSelectedItem());
			addGLabel(label);
		}
	}
	
	
	
	
	/* Adds a GLabel next to current star */
	public void addGLabel(GLabel label){
		add(label, star.getX() + star.getWidth(), star.getY());
	}
	
	/* Private constants */
	private static final int MIN_SIZE = 1;
	private static final int MAX_SIZE = 50;
	private static final int INITIAL_SIZE = 16;
	
	/* Private instance variables */
	private JSlider sizeSlider;
	private JComboBox colorChooser;
	private JTextField textField;
	private GLabel label;
	private JButton clearBtn;
	
	private GObject gobj;
	private GPoint last;
	private GStar star;
}
