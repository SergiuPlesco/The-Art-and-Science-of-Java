import java.awt.Color;
import java.awt.event.*;


import javax.swing.*;



public class Drawing {
	private JFrame f;
	private JPanel p;
	private JButton b;
	
	
	public Drawing(){
		
		gui();
	}
	public void gui(){
		f = new JFrame("Paint");
		f.setSize(500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setBackground(Color.WHITE);
		
		b = new JButton("BTN");
		b.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "dfsagfd");
				
			}
			
		});
		p.add(b);
		
		f.add(p);
	}
	public static void Main(String[] args){
		new Drawing();
	}
	
}
