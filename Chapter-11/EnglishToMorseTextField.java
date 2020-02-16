/*
 * Chapter 11, exercise 9
 * description in the book, page 456
 */
import acm.program.*;
import acm.graphics.*;

import java.awt.event.KeyEvent;
import java.util.*;

import javax.swing.*;

public class EnglishToMorseTextField extends GraphicsProgram {
	/*
	 * Initialize JLabel and JTextField
	 * 
	 */
	public void init(){
		label = new JLabel("Input String");
		add(label, SOUTH);
		
		textField = new JTextField(30);
		textField.addKeyListener(this);
		add(textField, SOUTH);
	}
	private void tokenizeLine(String str){
		 StringTokenizer tokenizer = new StringTokenizer(str, DELIMITERS, true);
		   
		   double x = 10;//x coordinate for label
		   double y = 30;//y coordinate for label
			
		    while(tokenizer.hasMoreTokens()){
		    	
		    	String token = tokenizer.nextToken();
		    	String lab = translateToMorse(token);
		    	text = new GLabel(lab);
			    text.setFont("Serif-32");
			    add(text, x, y);
			    //change the y coordinate to add 
			    //every token at new line
		     	y += 10;
		    	
		    
		    }
	}
	private String translateToMorse(String token){
		//english alphabet
		char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 
			     'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
			     'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		//morse code (alphabet)
	    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
			          ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", 
			          ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
			          "-....", "--...", "---..", "----.", "-----"};
	    
	    String translated = "";
	    //translate to morse code one token
	    for(int i = 0; i < token.length(); i++){
    		for(int j = 0; j < english.length; j++){
				if(english[j] == token.toLowerCase().charAt(i)){
						translated += morse[j] + " ";
		    		} 
			}
    	}
	    //return translated token
     	return translated;
	    
	}
	
	//When enter pressed tokenize the input string
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			String str = textField.getText();
		
			tokenizeLine(str);
		}
	}
	
	/* Private constants and variables */
	private JTextField textField;
	private JLabel label;
	private GLabel text;
	
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\ ";
}
