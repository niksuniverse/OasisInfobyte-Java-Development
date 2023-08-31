
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);
    static JFrame frame = new JFrame();
    int randomNumber;
    int scoreAllotted;
    int round;
    Map<Integer, Integer> scoreBoard;

    public NumberGuessingGame() {
        randomNumber = 0;
        scoreAllotted = 0;
        round = 1;
        scoreBoard = new HashMap<>();
    }

    public static void main(String[] args) {
        NumberGuessingGame guessGame = new NumberGuessingGame();
        while (true) {
            try {
                // For First Time Play
                String input = JOptionPane.showInputDialog(frame,
                        "Hey There!!\nWanna Play A Game With Me!!\nPress\n1 . Sure Lets Plays!\n2 . Not Right Now");
                if (input == null) {
                    guessGame.exit();
                }
                int play = Integer.parseInt(input);

                switch (play) {
                    case 1:
                        // Explanation of the Game
                        JOptionPane.showMessageDialog(frame,
                                "Great\nI Will Choose A Number You Will Have To Guess It!!\nYou will have a total of & attempts.\nDon't Worry I will help you along the way haha.\nNow lets Begin.");

                        guessGame.getRandomNumber();
                        guessGame.game();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(frame, "Oh Thats Too Bad. See You Later Then !!\n");
                        guessGame.exit();
                        break;
                    default:
                        throw new InputMismatchException("Invalid Choice!! Please Try Again!");
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(frame, e.getMessage());

            }
        }

    }

    // Main Game
    public void game() {
        scoreAllotted = 10;
        while (scoreAllotted > 3) {
            String input = JOptionPane.showInputDialog(frame, "Enter your guess");
            if (input == null) {
                exit();
            }
            int num = Integer.parseInt(input);
            if (num == randomNumber) {
                JOptionPane.showMessageDialog(frame, "CONGRATS!! You Guessed Right");
                scoreBoard.put(round, scoreAllotted);
                break;
            }
            if (num > randomNumber) {
                JOptionPane.showMessageDialog(frame, "Guess Lower");
            } else {
                JOptionPane.showMessageDialog(frame, "Guess Higher");
            }

            scoreAllotted--; // score is deduced for every wrong attempt
        }
        if (scoreAllotted == 3) {
            JOptionPane.showMessageDialog(frame, "\nSeems Like I Win This Roung Haha.\n");
            scoreBoard.put(round, 0);
        }
        round++;
        menu();
    }

    // Menu for what to do next
    public void menu() {

        try {

            String input = JOptionPane.showInputDialog(frame,
                    "What Would you like to do!!\n1 . Play Again!\n2 . View ScoreBoard\n3 . Exit");
            int option = Integer.parseInt(input);
            switch (option) {
                case 1:
                    getRandomNumber();
                    game();
                    break;
                case 2:
                    getScoreBoard();
                    menu();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(frame, "Thank You For Playing");
                    exit();
                default:
                    throw new InputMismatchException("Invalid Choice!\n");
            }
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(frame, e.getMessage());
            menu();
        }

    }

    // to generate the random number in user input bounds
    public void getRandomNumber() {
        String input = JOptionPane.showInputDialog(frame,
                "Enter The Upper Limit For The Mysterious Number (i.e. form 1-X )");
        if (input == null) {
            exit();
        }
        int range = Integer.parseInt(input);
        Random generator = new Random();
        randomNumber = generator.nextInt(range) + 1;
    }

    // to view ScoreBoard
    public void getScoreBoard() {
        StringBuilder scores = new StringBuilder();
        scoreBoard.forEach((k, v) -> scores.append("\t     " + k + "               " + v + "\n"));
        JOptionPane.showMessageDialog(frame, "\t  ScoreBoard!!\n\tRound      Score\n" + scores.toString());

    }

    // exits the program
    public void exit() {
        sc.close();
        System.exit(0);
    }

}