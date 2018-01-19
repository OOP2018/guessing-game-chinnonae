import java.util.Random;

/**
 * A game of guessing secret number.
 * 
 * @author Chinthiti Wisetsombat
 *
 */
public class NonaeGame extends NumberGame {

	/** Maximum of possible secret. */
	private int upperBound;
	/** The secret of this game. */
	private int secret;
	
	/**
	 * Initialize a new game.
	 * @param upperBound is max value of possible secret (>1).
	 */
	public NonaeGame(int upperBound) {
		this.upperBound = upperBound;
		
		long seed = System.nanoTime();
		Random random = new Random(seed);
		int secret = random.nextInt(upperBound) + 1;
		this.secret = secret;
		
		super.setMessage("Welcome to the game, shall we start?");
	}

	/**
	 * Evaluate answer of the user on this game.
	 * @param answer is user's answer.
	 * @return true if the answer is correct, otherwise it is false.
	 */
	@Override
	public boolean guess(int answer) {
		if (answer == secret) {
			return true;
		}
		
		if (answer > secret) {
			super.setMessage("Your guess is too large.");
		} else {
			super.setMessage("Your guess is too small.");
		}
		
		return false;
	}

	/**
	 * Get largest possible value for the secret number.
	 * @return possible largest secret number.
	 */
	@Override
	public int getUpperBound() {
		return this.upperBound;
	}

	/**
	 * Get description of this game.
	 * @return description of this game.
	 */
	@Override
	public String toString() {
		return String.format("A game of guessing number between 1 to %d.", this.upperBound);
	}
	
	
}
