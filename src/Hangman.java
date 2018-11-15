import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
<<<<<<< HEAD
       /* Scanner keyboard;
        keyboard = new Scanner(System.in);

        String[] phrases1 = {"Awkward", "Zombie", "Twelfth", "Jazz", "Linguistic", "Oxygen", "Pajama", "Gazebo", "Hazard" +
                "Ivory", "Bagpipes", "Kayak", "Unzip", "Rhythmic", "Pixel", "Buzz", "Quiz", "Fox", "Bark"};
        String[] phrases2 = {"Bored to death", "This is easy", "Coding is easy", "I love food", "Dogs are nice", "Birds rock", "Just do it"};
        int length;
        length = phrases1.length;
        int randomOne = (int) (Math.random() * length);
        int answer = keyboard.nextInt();
*/

        /*System.out.println("Welcome to the hangman game");
        System.out.println("Please pick your difficulty level. Easy/Difficult?");
        String difficulty = keyboard.nextLine();
        difficulty = keyboard.nextLine();
=======

        System.out.println("Welcome to the hangman game");
>>>>>>> master
        System.out.println("Your phrase has been chosen");
        System.out.println("Here are the rules:");
        System.out.println("You have 10 chances to guess the letters");
        System.out.println("If you guess a letter more than once points won't be taken away");
        System.out.println("For each letter that's guessed wrong a body part will be added to the gallows");
<<<<<<< HEAD
        System.out.println("If you can guess all the letters within 15 tries you win!");
        System.out.println("Please pick a letter");*/
        /*int numberofIncorrectGuesses = keyboard.nextInt();
        switch(numberofIncorrectGuesses) {
            case 1 :
                System.out.println("");
                break;
            case 2:
            System.out.println("        |  /                  |");
            break;
            case 3:
            System.out.println("        | /                   |        Letters:");
            break;
            case 4:
            System.out.println("        |/                    O)");
            break;
            case 5:
            System.out.println("        |                  \\ | //        Tries:");
            break;
            case 6:
            System.out.println("        |                   \\|/");
            break;
            case 7:
            System.out.println("        |                     |");
            break;
            case 8:
            System.out.println("        |                     |");
            break;
            case 9:
            System.out.println("        |                    / \");
            break;
            case 10:
            System.out.println("        |                  _/   \_");
            break;
            case 11:
            System.out.println("        |                         ");
            break;
            case 12:
            System.out.println("        |                         ");
            break;
            case 13:
            System.out.println("________|_________                ");
            break;
            System.out.println(randomOne);
    }
*/
            System.out.println("\n"+"\n|"+"\n|"+"\n|"+"\n|"+"\n|"+"\n|"+"\n|"+"\n|"+"\n|"+"\n|"+"\n|");
=======
        System.out.println("If you can guess all the letters within 10 tries you win!");

>>>>>>> master

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        String[] phrases1 = {"Awkward", "Zombie", "Twelfth", "Jazz", "Linguistic", "Oxygen", "Pajama", "Gazebo", "Hazard" ,"Capture"};
        String word = phrases1[(int) (Math.random() * phrases1.length)];
        String hyphen = new String(new char[word.length()]).replace("\0", "-");
        int count = 0;

        while (count < 10 && hyphen.contains("-")) {
            System.out.println();
            System.out.println("Please pick a letter");
            System.out.println();
            System.out.println(hyphen);
            String guess = keyboard.next();
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
                    System.out.println("GAME FINISHED!");
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
                    System.out.println("GAME FINISHED! The word was " + word);
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
