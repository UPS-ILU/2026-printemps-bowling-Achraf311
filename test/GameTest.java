import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	
	private Game game;
	@BeforeEach
	void setUp() throws Exception {
		game = new Game();
	}

	@Test
	void testzerorollscorezero() {
		int attendu = 0;
		int obtenu = game.score() ;
		assertEquals(attendu,obtenu);
				
	}
	
	@Test
	void testvingtrollazero() {
		int attendu = 0;
		for (int i = 0 ; i < 20 ; i++) {
			game.roll(0);
		}
		int obtenu = game.score() ;
		assertEquals(attendu,obtenu);
				
	}
	
	@Test
	void testvingtrollaun() {
		int attendu = 20;
		for (int i = 0 ; i < 20 ; i++) {
			game.roll(1);
		}
		int obtenu = game.score() ;
		assertEquals(attendu,obtenu);
				
	}

}
