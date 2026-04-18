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
	void test() {
		int attendu = 0;
		int obtenu = game.score() ;
		assertEquals(attendu,obtenu);
				
	}

}
