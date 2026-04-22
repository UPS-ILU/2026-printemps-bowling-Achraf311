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
	void testCasrepondUn() {
		String attendu = "1";
	    String obtenu = game.next() ;
		assertEquals(attendu,obtenu);
				
	}
	
	@Test
	void testCasrepondDeux() {
		String attendu = "2";
		game.next();
	    String obtenu = game.next();
		assertEquals(attendu,obtenu);
				
	}
	

}
