import java.util.Scanner;
import java.util.Random;
public class Hangman {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.println("Your phrase has been chosen");
        System.out.println("You have 15 chances to guess the letters");
        System.out.println("For each letter that's guessed
                "wrong a body part will be added to the gallows");
        System.out.println("Please pick a letter");
    }
}
