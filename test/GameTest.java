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
		String attendu = "1";
	    String obtenu = game.next() ;
		assertEquals(attendu,obtenu);
				
	}
	

}
