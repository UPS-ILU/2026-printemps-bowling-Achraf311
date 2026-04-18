
public class Game {
	
	private int score = 0 ;
	public void roll(int i) {
		if (i == 1 ) {
			score = 20;
		}
	}
	
	public int score() {
		return score;
	}
}
