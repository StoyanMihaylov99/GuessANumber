import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        System.out.printf("Hello there! %nLet's play a game! %n");


        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Guess a number ( 1 - 100): ");
            String playerInput = scanner.nextLine();
            int playerNumber;

            boolean isValid = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValid = false;
                    break;
                }
            }
                if (isValid) {
                    playerNumber = Integer.parseInt(playerInput);
                    if (playerNumber == computerNumber) {
                        System.out.println("Congrats! You guessed it!");
                        return;
                    } else if (playerNumber > computerNumber) {
                        System.out.println("Too High");
                    } else {
                        System.out.println("Too Low");
                    }
                } else {
                    System.out.println("Invalid input.");
                }
            }
        }
    }

