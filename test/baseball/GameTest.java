package baseball;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	private Game game;

	@Before
	public void setup() {
		game = new Game();
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
	
	@Test(expected=IllegalArgumentException.class)
	public void �Է°���_�ߺ���_���ڰ�_�Էµ�_���() {
		game.guess("112");
	}
	
	@Test
	public void ����_������_����_��ġ_��_���_3_strike() {

	}
	
	@Test
	public void ����_������_����_��ġ_����_����_���_0_strike_0_ball() {

	}
	
	@Test
	public void ��Ʈ����ũ��_����_���_1_strike_0_ball() {

	}
	
	@Test
	public void ����_����_���_0_strike_1_ball() {

	}
	
	@Test
	public void ����_��Ʈ����ũ��_�Բ�_����_���_1_strike_1_ball() {

	}
}
