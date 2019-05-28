package baseball;

public class Game {

	public String question;

	public GuessResult guess(String input) {
		
		if(input == null)	{
			throw new IllegalArgumentException();
		}
		
		if(input.equals(question))	{
			GuessResult result = new GuessResult();
			result.solved = true;
			result.strike = 3;
			result.ball = 0;
			
			return result;
		}
		
		return null;
		
	}

}
