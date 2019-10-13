package baseball;

public class Game {

	public String question;

	public GuessResult guess(String guess) {
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
		
		if(guess.equalsIgnoreCase(question)) {
			return new GuessResult(true, 3, 0);
		}else {
			int strikes = 0;
			for(int index=0; index < question.length(); index++) {
				char charAt = guess.charAt(index);
				int indexOf = question.indexOf(charAt);
				if(indexOf == index) {
					strikes++;
				}
			}
			return new GuessResult(false, strikes, 0);
		}
	}

}
