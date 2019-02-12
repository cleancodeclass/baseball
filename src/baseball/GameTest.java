package baseball;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Game game = new Game();
		game.question = getQuestion();
		GameResult gameResult = new GameResult(false, 0, 0);
		while(!gameResult.solved)	{
			System.out.print("Enter Guessed Number : ");
			String guessNumber = new Scanner(System.in).next();
			gameResult = game.guess(guessNumber);
			if (gameResult.solved)	{
				toStringResult(gameResult);
				return;
			}else	{
				toStringResult(gameResult);
			}
		}
	}

	private static void toStringResult(GameResult gameResult) {
		System.out.print("Solved : " + gameResult.solved);
		System.out.print(", Strike : " + gameResult.strikes);
		System.out.println(", Ball : " + gameResult.balls);
	}

	private static String getQuestion() {
		return "XXX";
	}

}
