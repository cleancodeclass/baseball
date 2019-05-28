package baseball;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test(expected = IllegalArgumentException.class)
	public void 입력값이_없을_경우() {
		// given
		Game game = new Game();
		
		// when
		game.guess(null);
		
		// then
		

	}
	
	@Test
	public void 입력값_자리수가_세자리가_아닐_경우() {

	}
	
	@Test
	public void 입력값에_숫자_외의_문자가_입력될_경우() {

	}
	
	@Test
	public void 입력값에_중복된_숫자가_입력될_경우() {

	}
	
	@Test
	public void 숫자_세개가_전부_일치_할_경우_3_strike() {
		// given
		Game game = new Game();
		
		// when
		game.question = "123";
		GuessResult result = game.guess("123");
		
		// then
		assertThat(result.solved, is(true));
		assertThat(result.strike, is(3));
		assertThat(result.ball, is(0));
	}
	
	@Test
	public void 숫자_세개가_전부_일치_하지_않을_경우_0_strike_0_ball() {

	}
	
	@Test
	public void 스트라이크만_있을_경우_1_strike_0_ball() {

	}
	
	@Test
	public void 볼만_있을_경우_0_strike_1_ball() {

	}
	
	@Test
	public void 볼과_스트라이크가_함께_있을_경우_1_strike_1_ball() {

	}
}
