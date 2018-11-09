import java.util.Scanner;
import java.util.Random;
public class Hangman {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        String[] phrases1 = {"Awkward", "Zombie", "Twelfth", "Jazz", "Linguistic", "Oxygen", "Pajama", "Gazebo", "Hazard" +
                "Ivory", "Bagpipes", "Kayak", "Unzip", "Rhythmic", "Pixel", "Buzz", "Quiz", "Fox", "Bark"};
        String[] phrases2 = {"Bored to death", "This is easy", "Coding is easy", "I love food", "Dogs are nice", "Birds rock", "Just do it"};
        int length;
        length = phrases1.length;
        int randomOne = (int) (Math.random() * length);
        int answer;

        /*System.out.println("Welcome to the hangman game");
        System.out.println("Please pick your difficulty level. Easy/Difficult?");
        String difficulty = keyboard.nextLine();
        difficulty = keyboard.nextLine();
        System.out.println("Your phrase has been chosen");
        System.out.println("Here are the rules:");
        System.out.println("You have 15 chances to guess the letters");
        System.out.println("If you guess a letter more than once points won't be taken away");
        System.out.println("For each letter that's guessed wrong a body part will be added to the gallows");
        System.out.println("If you can guess all the letters within 15 tries you win!");
        System.out.println("Please pick a letter");*/
        System.out.println("        _______________________");
        System.out.println("        |  /                  |");
        System.out.println("        | /                   |        Letters:");
        System.out.println("        |/                    O)");
        System.out.println("        |                  \\ | /        Tries:");
        System.out.println("        |                   \\|/");
        System.out.println("        |                     |");
        System.out.println("        |                     |");
        System.out.println("        |                    / \\");
        System.out.println("        |                  _/   \\_");
        System.out.println("        |                         ");
        System.out.println("        |                         ");
        System.out.println("________|_________                ");
        answer = keyboard.nextInt();
        System.out.println(randomOne);
    }


    }

}


