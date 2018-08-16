package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String sign=JOptionPane.showInputDialog("What is your star sign?");
	if(sign.equals("aries")) {
		JOptionPane.showMessageDialog(null, "You get a cat.");
	}
	else if(sign.equals("taurus")) {
		JOptionPane.showMessageDialog(null, "You get a dog.");
	}
	else if(sign.equals("gemini")) {
		JOptionPane.showMessageDialog(null, "You get a car.");
	}
	else if(sign.equals("cancer")) {
		JOptionPane.showMessageDialog(null, "You get a cancer.");
	}
	else if(sign.equals("leo")) {
		JOptionPane.showMessageDialog(null, "You get a house.");
	}
	else if(sign.equals("virgo")) {
		JOptionPane.showMessageDialog(null, "You will be a virgin.");
	}
	else if(sign.equals("libra")) {
		JOptionPane.showMessageDialog(null, "You get a cookie.");
	}
	else if(sign.equals("scorpio")) {
		JOptionPane.showMessageDialog(null, "You get married.");
	}
	else if(sign.equals("sagittarius")) {
		JOptionPane.showMessageDialog(null, "You will get Mcdonalds.");
	}
	else if(sign.equals("capricorn")) {
		JOptionPane.showMessageDialog(null, "You get a cake.");
	}
	else if(sign.equals("aquarius")) {
		JOptionPane.showMessageDialog(null, "You will go to college.");
	}
	else if(sign.equals("pisces")) {
		JOptionPane.showMessageDialog(null, "You will own a multi-million dollar company.");
	}
		else{JOptionPane.showMessageDialog(null, "That's not a star sign!");
	
}
}
}
