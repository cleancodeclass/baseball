package baseball;

public class Game {

	public String question;

	public GuessResult guess(String guess) {
		assertIllegalArgument(guess);
		
		if(isSolved(guess)) {
			return createSolvedResult();
		}else {
			return createUnSolvedResult(guess);
		}
	}

	private GuessResult createUnSolvedResult(String guess) {
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

	private GuessResult createSolvedResult() {
		return new GuessResult(true, 3, 0);
	}

	private boolean isSolved(String guess) {
		return guess.equalsIgnoreCase(question);
	}

	private void assertIllegalArgument(String guess) {
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
		if(isDuplicatedNumber(guess)) {
			throw new IllegalArgumentException();
		}
	}

	private boolean isDuplicatedNumber(String guess) {
		return guess.charAt(0)==guess.charAt(1)
				|| guess.charAt(0)==guess.charAt(2)
				|| guess.charAt(1)==guess.charAt(2);
	}

}
