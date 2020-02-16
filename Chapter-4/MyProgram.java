/* MyProgram.java
 * --------------
 * Modify this file any way you like (or create additional files in
 * the ACMStarterProject) in order to experiment with the capabilities
 * of the ACM libraries.
 * 
 * NOTE: While you are free to do whatever you like with this project,
 * it is still best to use the assignment-specific starter files
 * for actual assignments.
 */
import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

//public class MyProgram extends ConsoleProgram {
//    
//    public void run() {
//        while (true) {
//            println("You said: " + readLine());
//        }
//    }
//    
//}
public class MyProgram extends GraphicsProgram {
	public void run() {
//		add(new GLabel("Hello, World!", 100,75));
//		println("Hello");
//		add(new GRect(300, 100));
		GRect rect = new GRect(10,10,300,100);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
		
		GOval oval = new GOval(10,10,300,100);
		oval.setFilled(true);
		oval.setFillColor(Color.CYAN);
		add(oval);
	}
}
