import java.util.Scanner;

/** 
 *  Console interface for a number game.
 *  
 *  @author Chinthiti Wisetsombat
 */
public class GameConsole {

	/**
	 * Play a number game.
	 * @param game is a number game.
	 * @return the correct answer of the game.
	 */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		
		// Welcome message
		System.out.println(game.toString());
		
		boolean isCorrect;
		int guess;

		do {
			System.out.println(game.getMessage());
			System.out.println("Your answer? ");
			
			guess = console.nextInt();
			isCorrect = game.guess(guess);
		} while (!isCorrect);
		
		return guess;
	}
	
}