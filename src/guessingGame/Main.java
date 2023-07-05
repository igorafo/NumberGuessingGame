package guessingGame;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int correctNumber = (int) (Math.random() * 100 + 1);
		int userAnswer = 0;
		System.out.println("The correct guess would be " + correctNumber);
		int count = 1;
		JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game! \nLet's start!", "Number Guessing Game", 3);
		while(userAnswer != correctNumber) {
			String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", 3);
			userAnswer = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, correctNumber, count));
			count++;
		}

	}
	
	public static String determineGuess(int userAnswer, int correctNumber, int count) {
		if(userAnswer <= 0 && userAnswer > 100) {
			return "Your guess must be between 0 to 100";
		}
		else if(userAnswer == correctNumber) {
			return "Correct! \nTotal Guesses: " + count;
		}
		else if(Math.abs(userAnswer - correctNumber) <=5) {
			return "Now you are really close! \nTry number: " + count;
		}
		else if(Math.abs(userAnswer - correctNumber) <=10) {
			return "You are getting close my friend! \nTry number: " + count;
		}
		else if(userAnswer > correctNumber) {
			return "Your guess is too high, try again. \nTry number: " + count;
		}
		else if(userAnswer < correctNumber) {
			return "Your guess is too low, try again. \nTry number: " + count;
		}
		return "your guess is incorrect \nTry number: " + count;
	}

}
