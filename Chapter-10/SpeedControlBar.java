/*
 * Chapter 10, ex 8
 */
import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
public class SpeedControlBar extends GraphicsProgram {

	public void run(){
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		ball.setColor(Color.RED);
		add(ball, cx - BALL_RADIUS, cy - BALL_RADIUS);
		int dx = 1;
		int dy = 1;
		
		while(true){
			if(isBouncing == true){//if true move, if false stop
				ball.move(dx, dy);
			}
			
			pause(100 / getCurrentSpeed());
			if (ball.getY() == getHeight() - 2 * BALL_RADIUS || ball.getY() == 0) {
				dy = -dy;

				ball.setColor(random.nextColor());
			}
			
			if (ball.getX() == getWidth() - 2 * BALL_RADIUS || ball.getX() == 0) {
				dx = -dx;

				ball.setColor(random.nextColor());
			}
		}
	}
	
	public void init(){
		setBackground(Color.GRAY);
		startBtn = new JButton("Start");
//		startBtn.addActionListener(new ActionListener(){
//
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				isBouncing = true;
//			}
//		});
		stopBtn = new JButton("Stop");
		slow = new JLabel("Slow");
		fast = new JLabel("Fast");
		speedSlider = new JSlider(SLOW, FAST, INITIAL_SPEED);
		
		add(startBtn, SOUTH);
		add(stopBtn, SOUTH);
		add(slow, SOUTH);
		add(speedSlider, SOUTH);
		add(fast,SOUTH);
	
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Start")){
			isBouncing = true;
	
		} else if(e.getActionCommand().equals("Stop")){
			isBouncing = false;

		}
	}

	/* Return current speed */
	private int getCurrentSpeed(){
		return speedSlider.getValue();
	}
	/* JSlider values */
	private static final int SLOW = 1;
	private static final int FAST = 50;
	private static final int INITIAL_SPEED = 20;
	
	/* Private instance variables */
	private JButton startBtn;
	private JButton stopBtn;
	private JLabel slow, fast;
	private JSlider speedSlider;

	
	private GOval ball;
	private static final int BALL_RADIUS = 25;
	
	private boolean isBouncing;
	private RandomGenerator random = RandomGenerator.getInstance();
}
