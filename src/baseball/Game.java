package baseball;

public class Game {

	public void guess(String guess) {
		if(guess==null || guess.isEmpty()) {
			throw new IllegalArgumentException();
		}
		if(guess.length() != 3) {
			throw new IllegalArgumentException();
		}
		for(char number : guess.toCharArray()) {
			if(number < '0' || number > '9') {
				throw new IllegalArgumentException();
			}
		}
		if(guess.charAt(0)==guess.charAt(1)
				|| guess.charAt(0)==guess.charAt(2)
				|| guess.charAt(1)==guess.charAt(2)) {
			throw new IllegalArgumentException();
		}
	}

}
