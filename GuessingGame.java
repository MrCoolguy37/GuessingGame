/**
* Kevin is The Biggest Gay! He Thinks
* He's hot shit now that he's a master
* coder. I'm not jealous or anything tho
*/

//Imports

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        //Variables
        Random randomNumber = new Random();
        Scanner kbd = new Scanner(System.in);
        int computerValue = randomNumber.nextInt(100);
        int numberOfTries = 0;
        int guess = 0;

        //Logic and While loops.

        /**
        * Make sure a new random number
        * is generated and numberOfTries
        * is reset to 0 on each new game
        */
        while (true) {
            computerValue = randomNumber.nextInt(100);
            numberOfTries = 0;
            while (true) {
                System.out.println("Please enter a number between 1 and 100: ");
                guess = kbd.nextInt();
                numberOfTries++;

                if (guess < 1 || guess > 100) System.out.println("Invalid input");
                else if (guess == computerValue) {
                    System.out.println("Congratulations! It took you " + numberOfTries + " Attempts to guess the correct number: " + computerValue);
                    //Exit first loop
                    break;
                }
                else if (guess < computerValue) System.out.println("Guess is too low!");
                //This should really just be an else, but I never refactored :(
                else if (guess > computerValue) System.out.println("Guess is too high!");
            }

            System.out.println("Play again? (1:Yes/2:No)");
            if (kbd.nextInt() != 1) break;
        }

    }
}
