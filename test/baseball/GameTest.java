package baseball;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	private Game game;

	@Before
	public void setup() {
		game = new Game();
		game.question="123";
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void �Է°���_����_���() {
		game.guess(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void �Է°�_�ڸ�����_���ڸ���_�ƴ�_���() {
		game.guess("12");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void �Է°���_����_����_���ڰ�_�Էµ�_���() {
		game.guess("12d");
	}
	
	@Test
	public void �Է°���_�ߺ���_���ڰ�_�Էµ�_���() {
		try {
			game.guess("112");
			game.guess("111");
			game.guess("122");
			fail();
		}catch(IllegalArgumentException e) {
			
		}
	}
	
	@Test
	public void ����_������_����_��ġ_��_���_3_strike() {
		GuessResult result = game.guess("123");
		
		assertEquals(true, result.solved);
		assertEquals(3, result.Strikes);
		assertEquals(0, result.balls);
	}
	
	@Test
	public void ����_������_����_��ġ_����_����_���_0_strike_0_ball() {
		GuessResult result = game.guess("456");
		
		assertEquals(false, result.solved);
		assertEquals(0, result.Strikes);
		assertEquals(0, result.balls);
	}
	
	@Test
	public void ��Ʈ����ũ��_����_���_1_strike_0_ball() {
		GuessResult result = game.guess("156");
		
		assertEquals(false, result.solved);
		assertEquals(1, result.Strikes);
		assertEquals(0, result.balls);
	}
	
	@Test
	public void ����_����_���_0_strike_1_ball() {
		GuessResult result = game.guess("416");
		
		assertEquals(false, result.solved);
		assertEquals(0, result.Strikes);
		assertEquals(1, result.balls);
	}
	
	@Test
	public void ����_��Ʈ����ũ��_�Բ�_����_���_1_strike_1_ball() {

	}
}
