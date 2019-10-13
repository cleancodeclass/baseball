package baseball;

public class Game {

	public void guess(String guess) {
		if(guess==null || guess.isEmpty()) {
			throw new IllegalArgumentException();
		}
	}

}
