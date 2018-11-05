import java.util.Scanner;
import java.util.Random;
public class Hangman {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        Random rand_new = new Random();
        String[] phrases1 = {"Awkward", "Zombie", "Twelfth", "Jazz", "Linguistic", "Oxygen", "Pajama", "Gazebo", "Hazard" +
                "Ivory", "Bagpipes", "Kayak", "Unzip", "Rhythmic", "Pixel", "Buzz", "Quiz", "Fox", "Bark"};
        String[] phrases2 = {"Bored to death", "This is easy", ""};

        System.out.println("Welcome to the hangman game");
        System.out.println("Your phrase has been chosen");
        System.out.println("You have 15 chances to guess the letters");
        System.out.println("If you guess a letter more than once points won't be taken away");
        System.out.println("For each letter that's guessed wrong a body part will be added to the gallows");
        System.out.println("If you can guess all the letters within 15 tries you will win!");
        String answer = keyboard.nextLine();
        System.out.println("Please pick a letter");



    }
}
