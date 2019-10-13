package baseball;

public class GuessResult {

	public boolean solved;
	public int Strikes;
	public int balls;

	public GuessResult(boolean solved, int strikes, int balls) {
		this.solved = solved;
		this.Strikes = strikes;
		this.balls = balls;
	}
}
