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
			int balls = 0;
			for(int index=0; index < question.length(); index++) {
				if(question.indexOf(guess.charAt(index)) == index) {
					strikes++;
				}else if(question.indexOf(guess.charAt(index)) > -1) {
					balls++;
				}
			}
			return new GuessResult(false, strikes, balls);
		}
	}

}
