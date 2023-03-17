import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int randomNumber, userGuess, numOfGuesses = 0;
        int lowerBound = 1;
        int upperBound = 100;
        int maxNumOfGuesses = 10;
        int score = 0;
        Random random = new Random();
        randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        while (numOfGuesses < maxNumOfGuesses) {
            String userGuessString = JOptionPane.showInputDialog("Guess a number between " + lowerBound + " and " + upperBound + ":" +"\nAttempts left:"+(maxNumOfGuesses - numOfGuesses));
            userGuess = Integer.parseInt(userGuessString);
            numOfGuesses++;

            if (userGuess == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations, you guessed the number!");
                score += (maxNumOfGuesses - numOfGuesses + 1);
                
                break;
            } else if (userGuess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Guess Higher number.");
            } else {
                JOptionPane.showMessageDialog(null, "Guess Smaller number.");
            }
        }

        if (numOfGuesses == maxNumOfGuesses) {
            JOptionPane.showMessageDialog(null, "Sorry, you did not guess the number. The number was " + randomNumber + ".");
        }

        JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
    }
}
