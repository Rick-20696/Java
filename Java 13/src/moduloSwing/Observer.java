package moduloSwing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observer {

	public static void main(String[] args) {
		//JFrame is a window of application
		JFrame window = new JFrame ("Observer");
		
		//By default, if i click to close still go run in Console
		//So i need define to close when to click in "X"
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(800, 600);
		//This command is to define a Layout and reduce size button
		window.setLayout(new FlowLayout());
		
		//By default the JFrame go run on left corner
		//To the JFrame run on center i need define
		window.setLocationRelativeTo(null);
		
		//I'll create a button
		JButton button = new JButton("Click");
		
		//Now i need add this in JFrame
		window.add(button);
		
		
		window.setVisible(true);
	}
}
