package baseball;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test(expected=IllegalArgumentException.class)
	public void �Է°���_����_���() {
		Game game = new Game();
		game.guess(null);
	}
	
	@Test
	public void �Է°�_�ڸ�����_���ڸ���_�ƴ�_���() {

	}
	
	@Test
	public void �Է°���_����_����_���ڰ�_�Էµ�_���() {

	}
	
	@Test
	public void �Է°���_�ߺ���_���ڰ�_�Էµ�_���() {

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
