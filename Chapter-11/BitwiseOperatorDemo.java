/*
 * Chapter 11, exercise 11, Bitwise Operator
 */
import acm.program.*;
import acm.graphics.*;

import java.lang.reflect.Array;
import java.util.*;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.*;

import acm.gui.*;
public class BitwiseOperatorDemo extends Program {
	public void init(){
		createJComboBox();
		xBtns();
		yBtns();
		resultBtns();
		addActionListeners();
	}
	
	/* Show first row of buttons */
	private void xBtns(){
		setLayout(null);
		int xBitsX = getWidth() / 2 - 225;
		int xBitsY = getHeight() / 2 - 100;
		
		xBits = new ArrayList<JButton>();
		for(int i = 0; i < 8; i++){
			final JButton xBtn = new JButton("0");
			xBtn.setBounds(xBitsX+=50, xBitsY, 50, 50);
			xBtn.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(xBtn.getText() == "0"){
						xBtn.setText("1");
					} else {
						xBtn.setText("0");
					}
					computeResult();
				}
				
			});
			xBits.add(xBtn);
			add(xBits.get(i));
		}
	}
	
	/* Show second row of buttons */
	private void yBtns(){
		setLayout(null);
		int yBitsX = getWidth() / 2 - 225;
		int yBitsY = getHeight() / 2 - 50;
		
		yBits = new ArrayList<JButton>();
		for(int i = 0; i < 8; i++){
			final JButton yBtn = new JButton("0");
			yBtn.setBounds(yBitsX+=50, yBitsY, 50, 50);
			yBtn.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(yBtn.getText() == "0"){
						yBtn.setText("1");
					} else {
						yBtn.setText("0");
					}
					computeResult();
				}
				
			});
			yBits.add(yBtn);
			add(yBits.get(i));
		}
	}
	
	/* Show result buttons */
	private void resultBtns(){
		result = new ArrayList<JButton>();
		int resultBitsX = getWidth() / 2 - 225;
		int resultBitsY = getHeight() / 2;
		
		for(int i = 0; i < 8; i++){
			final JButton resultBtn = new JButton("0");
			resultBtn.setBounds(resultBitsX+=50, resultBitsY, 50, 50);
			result.add(resultBtn);
			add(result.get(i));
		}
	}
	


	/* Show JComboBox */
	private void createJComboBox(){ 
		int operatorX = getWidth() / 2 - 275;
		int operatorY = getHeight() / 2 - 50;
		
		operatorChooser = new JComboBox();
		operatorChooser.addItem("&");
		operatorChooser.addItem("^");
		operatorChooser.addItem("|");
		((JLabel) operatorChooser.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		operatorChooser.setEditable(false);
		operatorChooser.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				computeResult();
			}
			
		});
		setLayout(null);
		operatorChooser.setBounds(operatorX, operatorY, 50, 50);
		add(operatorChooser);
	}
	
	/* Get the current operator from JComboBox */
	private String getCurrentOperator(){
		String operator = (String) operatorChooser.getSelectedItem();
		return operator;
	}
	
	/* Compute the result */
	private void computeResult(){

		int resultBit = 0;
		String resultStr = "";
		String op = getCurrentOperator();
		
			for(int i = 0; i < 8; i++){
				String xValue = xBits.get(i).getText();
				int xVal = Integer.parseInt(xValue);
				String yValue = yBits.get(i).getText();
				int yVal = Integer.parseInt(yValue);
				if(op.equals("&")){
					resultBit = xVal & yVal;
				} else if(op.equals("|")){
					resultBit = xVal | yVal;
				} else if(op.equals("^")){
					resultBit = xVal ^ yVal;
				}
				resultStr = Integer.toString(resultBit);
				result.get(i).setText(resultStr);
			}
	}

	/* Private instance variables */
	private JComboBox operatorChooser;
	private ArrayList<JButton> xBits;
	private ArrayList<JButton> yBits;
	private ArrayList<JButton> result;

}
