import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        Scanner keyboard;


        System.out.println("Welcome to the hangman game");
        System.out.println();
        System.out.println();
        System.out.println("Here are the rules:");
        System.out.println("You have 10 chances to guess the letters");
        System.out.println("If you can guess all the letters within 10 tries you win!");
        System.out.println("If you guess a letter more than once points won't be taken away");
        System.out.println("For each letter that's guessed wrong a body part will be added to the gallows");
        System.out.println();
        System.out.println("Your phrase has been chosen");




        keyboard = new Scanner(System.in);

        String[] phrases1 = {"Awkward", "Zombie", "Twelfth", "Jazz", "Linguistic", "Oxygen", "Pajama", "Gazebo", "Hazard" ,"Capture" +
                "Ivory", "Bagpipes", "Kayak", "Unzip", "Rhythmic", "Pixel", "Buzz", "Quiz", "Fox", "Bark"};
        String word = phrases1[(int) (Math.random() * phrases1.length)].toLowerCase();
        String hyphen = new String(new char[word.length()]).replace("\0", "-");
        int count = 0;

        while (count < 12 && hyphen.contains("-")) {
            System.out.println();
            System.out.println("Please pick a letter");
            System.out.println();
            System.out.println(hyphen);
            String guess = keyboard.next().toLowerCase();
            String newhyphen = "";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(0)) {
                    newhyphen += guess.charAt(0);
                } else if (hyphen.charAt(i) != '-') {
                    newhyphen += word.charAt(i);
                } else {
                    newhyphen += "-";
                }
            }

            if(word.contains(guess)){

            };

            if (hyphen.equals(newhyphen)) {
                count++;
                if (count == 1) {
                    System.out.println("Wrong guess, try again");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("________|");
                }
                if (count == 2) {
                    System.out.println("Wrong guess, try again");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("________|_________ ");
                }
                if (count == 3) {
                    System.out.println("Wrong guess, try again");
                    System.out.println();
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("________|_________");
                }
                if (count == 4) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("        _______________________");
                    System.out.println("        |  /");
                    System.out.println("        | /");
                    System.out.println("        |/");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("________|_________");
                }
                if (count == 5) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("        _______________________");
                    System.out.println("        |  /                  |");
                    System.out.println("        | /                   |       ");
                    System.out.println("        |/                    O");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("________|_________");
                }
                if (count == 6) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("        _______________________");
                    System.out.println("        |  /                  |");
                    System.out.println("        | /                   |       ");
                    System.out.println("        |/                    O");
                    System.out.println("        |                     | ");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("________|_________");
                }
                if (count == 7) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("        _______________________");
                    System.out.println("        |  /                  |");
                    System.out.println("        | /                   |");
                    System.out.println("        |/                    O");
                    System.out.println("        |                   \\ | /");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("________|_________");
                }
                if (count == 8) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("        _______________________");
                    System.out.println("        |  /                  |");
                    System.out.println("        | /                   |       ");
                    System.out.println("        |/                    O");
                    System.out.println("        |                   \\ | /        ");
                    System.out.println("        |                    \\|/");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |                         ");
                    System.out.println("        |                         ");
                    System.out.println("________|_________                ");
                }
                if (count == 9) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("        _______________________");
                    System.out.println("        |  /                  |");
                    System.out.println("        | /                   |       ");
                    System.out.println("        |/                    O");
                    System.out.println("        |                   \\ | /        ");
                    System.out.println("        |                    \\|/");
                    System.out.println("        |                     |");
                    System.out.println("        |                     |");
                    System.out.println("        |                    /");
                    System.out.println("        |                  _/");
                    System.out.println("        |                         ");
                    System.out.println("        |                         ");
                    System.out.println("________|_________                ");
                }
                if (count == 10) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("        _______________________");
                    System.out.println("        |  /                  |");
                    System.out.println("        | /                   |       ");
                    System.out.println("        |/                    O");
                    System.out.println("        |                   \\ | /        ");
                    System.out.println("        |                    \\|/");
                    System.out.println("        |                     |");
                    System.out.println("        |                     |");
                    System.out.println("        |                    / \\");
                    System.out.println("        |                  _/   \\_");
                    System.out.println("        |                         ");
                    System.out.println("        |                         ");
                    System.out.println("________|_________                ");
                    System.out.println("Game finished! The word was " + word);
                }
                if (count == 11) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("        _______________________");
                    System.out.println("        |  /                  |");
                    System.out.println("        | /                   |       ");
                    System.out.println("        |/                    O");
                    System.out.println("        |                  -\\ | /-        ");
                    System.out.println("        |                    \\|/");
                    System.out.println("        |                     |");
                    System.out.println("        |                     |");
                    System.out.println("        |                    / \\");
                    System.out.println("        |                  _/   \\_");
                    System.out.println("        |                         ");
                    System.out.println("        |                         ");
                    System.out.println("________|_________                ");

                }
                if (count == 12) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("        _______________________");
                    System.out.println("        |  /                  |");
                    System.out.println("        | /                   |       ");
                    System.out.println("        |/                    O");
                    System.out.println("        |                  -\\ | /-        ");
                    System.out.println("        |                    \\|/");
                    System.out.println("        |                     |");
                    System.out.println("        |                     |");
                    System.out.println("        |                    / \\");
                    System.out.println("        |                  _/   \\_");
                    System.out.println("        |                         ");
                    System.out.println("        |                         ");
                    System.out.println("________|_________                ");

                }
            } else {
                hyphen = newhyphen;
            }
            if (hyphen.equals(word)) {
                System.out.println("Correct! You win! The word was " + word);
            }
        }
    }
}
