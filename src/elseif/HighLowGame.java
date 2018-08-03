//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(99)+1;
		System.out.println(random);
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		for(int i=0; i<10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String guess=JOptionPane.showInputDialog("Give me a number from 0-100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guess2=Integer.parseInt(guess);
			// 5. if the guess is correct
			if (guess2==random){
				// 6. Win
				JOptionPane.showMessageDialog(null, "YOU WIN!");
			
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			System.exit(0);
			}
			// 7. if the guess is high
			if(guess2>random) {
				JOptionPane.showMessageDialog(null, "Your guess is too high. Try again.");
			}
			
				// 8. Tell them it's too high
			// 9. if the guess is low
			if(guess2<random) {
				JOptionPane.showMessageDialog(null, "Your guess is too low. Try again.");
				// 10. Tell them it's too low
		}
		// 13. Tell them they lose
		
	}

	}
}


