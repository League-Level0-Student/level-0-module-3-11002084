//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot bob = new Robot();
		for(int i=0; i<3;i++) {
		// 3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color do you want the robot to draw?");
		// 5. Use an if/else statement to set the pen color that the user requested
if(color.equals("red")) { bob.setPenColor(255, 0, 0);}
if(color.equals("green")) { bob.setPenColor(0, 255, 0);}
if(color.equals("blue")) { bob.setPenColor(0, 0, 255);}
		// 6. If the user doesn’t enter anything, choose a random color
if(color.equals("")) {bob.setRandomPenColor();}
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10
bob.setSpeed(100);
bob.penDown();
bob.setPenWidth(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
		}
	}
}
