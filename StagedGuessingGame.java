import java.util.Random;
import java.util.Scanner;

public class StagedGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentStage = 1;
        int maxAttempts = 10;
        int maxRange = 100;

        while (currentStage <= 3) {
            System.out.println("Stage " + currentStage + " - Guess the secret number:");
            int secretNumber = generateSecretNumber(maxRange);
            int attempts = 0;

            while (attempts < maxAttempts) {
                int guess = getGuessFromUser(scanner, maxRange);
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    currentStage++;
                    maxAttempts -= 2;
                    maxRange += 100;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println("Too high, try again.");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've exceeded the maximum number of attempts. The secret number was " + secretNumber + ".");
                System.out.println("Game over. Better luck next time!");
                return;
            }
        }

        System.out.println("Congratulations! You have completed all 3 stages of the Guessing Game.");
    }

    privete steatic int generateSecretNumber(int maxRange){
	Random random = new Random();
	return random.nextInt(maxRange) +1;
    }
    privete steatic int generateSecretNumber(Scanner scanner, int maxRange){
	System.out.print("Enter your guess(1-"maxRange + "):");		return scanner.nextInt();	
 	}
     
