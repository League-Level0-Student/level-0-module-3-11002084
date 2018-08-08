import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot bob = new Robot();

	public static void main(String[] args) {
		bob.setSpeed(500);
		bob.penDown();
		bob.hide();
		String shape = JOptionPane.showInputDialog("What shape do you want?");
		String color = JOptionPane.showInputDialog("What color do you want your shape to be?");
		if (color.equals("red")) {
			bob.setPenColor(255, 0, 0);
		} else if (color.equals("green")) {
			bob.setPenColor(0, 255, 0);
		} else if (color.equals("blue")) {
			bob.setPenColor(0, 0, 255);
		} else {
			JOptionPane.showMessageDialog(null, "Your color does not exist on the database.");
		}
		if (shape.equals("square")) {
			drawSquare();
		} else if (shape.equals("triangle")) {
			drawTriangle();
		} else if (shape.equals("circle")) {
			drawCircle();
		} else {
			JOptionPane.showMessageDialog(null, "Your shape does not exist on the database.");
		}
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			bob.move(100);
			bob.turn(90);
		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			bob.move(100);
			bob.turn(240);
		}
	}

	static void drawCircle() {
		for (int i = 0; i < 90; i++) {
			bob.move(3);
			bob.turn(4);
		}
	}
}
