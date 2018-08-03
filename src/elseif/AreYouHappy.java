package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String question=JOptionPane.showInputDialog("Are you happy? Say yes or no.");
		if(question.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		if(question.equals("no")) {
			String question2=JOptionPane.showInputDialog("Do you want to be happy? Say yes or no.");
			if(question2.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			if(question2.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
	}
}
