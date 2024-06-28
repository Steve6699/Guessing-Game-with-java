# Guessing-Game-with-java

the game has 3 stages of increasing difficulty:

Stage 1: The secret number is between 1 and 100, and the player has 10 attempts to guess it.
Stage 2: The secret number is between 1 and 200, and the player has 8 attempts to guess it.
Stage 3: The secret number is between 1 and 300, and the player has 6 attempts to guess it.
The game continues until the player successfully completes all 3 stages or runs out of attempts in any stage.

Here's how the code works:

The main() method controls the overall game flow, managing the current stage, maximum attempts, and maximum range.
The generateSecretNumber() method generates a random secret number within the given range.
The getGuessFromUser() method prompts the user to enter a guess and returns the user's input.
The game loop runs for each stage, allowing the player to guess the secret number within the allotted attempts.
If the player guesses the number correctly, the game moves to the next stage, with fewer attempts and a larger range.
If the player runs out of attempts in any stage, the game ends, and the secret number is revealed.
After completing all 3 stages, the player is congratulated on their success.


mustafa hashim hussein ibrahim.
