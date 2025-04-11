import javax.swing.JOptionPane;
import java.util.Scanner;

public class SimpleQuiz {
    public static void main(String[] args) {
        int score = 0;
        JOptionPane.showMessageDialog(null, "Welcome to the Simple Quiz!");

        JOptionPane.showMessageDialog(null, "This quiz will test your knowledge about the Philippines.");
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Welcome " + name + "! Let's start the quiz.");

        String answer1 = JOptionPane.showInputDialog("Question 1: Who is the first president of the Philippines?");
        if (answer1.equals("Emilio Aguinaldo")) {
            score++;
        }

        String answer2 = JOptionPane.showInputDialog("Question 2: What is the capital of Philippines?");
        if (answer2.equalsIgnoreCase("Manila")) {
            score++;
        }

        String answer3 = JOptionPane.showInputDialog("Question 3: Who is the painter of Spolarium?");
        if (answer3.equals("Juan Luna")) {
            score++;
        }
        String answer4 = JOptionPane.showInputDialog("Question 4: What is the national flower of the Philippines?");
        if (answer4.equalsIgnoreCase("Sampaguita")) {
            score++;
        }
        String answer5 = JOptionPane.showInputDialog("Question 5: What is the national animal of the Philippines?");
        if (answer5.equalsIgnoreCase("Carabao")) {
            score++;
        }
        JOptionPane.showMessageDialog(null, "Thank you for taking the quiz, " + name + "!");
        JOptionPane.showMessageDialog(null, "You answered " + score + " out of 5 questions correctly.");

    }
}
