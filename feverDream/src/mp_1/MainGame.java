package mp_1;

/**
 * 
 * @author 157675 & (penny put your number here)
 *
 */
public class MainGame {
	
	public static void main(String[] args)
	{
		Game g = new Game();
		g.play();
	}
	
	
	//storage for a bunch of public static final vars
	public static final int ROOMS = 6; //number of puzzles in game
	public static final double BONUS_TIME_LIMIT = 180000; //3 minutes
	public static final int MAX_TIME_BONUS = 5;
	public static final int BEST_SCORE = 20;


}
