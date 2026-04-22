
public class Game {
	
	private int tour = 0;
	
	public Game() {
		
	}
	
	
	public String next() {
		tour++;
		return Integer.toString(tour);
	}
}
