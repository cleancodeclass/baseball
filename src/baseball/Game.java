package baseball;

public class Game {

	public void guess(String guess) {
		if(guess==null || guess.isEmpty()) {
			throw new IllegalArgumentException();
		}
		if(guess.length() != 3) {
			throw new IllegalArgumentException();
		}
	}

}
