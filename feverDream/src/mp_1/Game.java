package mp_1;

import java.util.*;


/**
 * 
 * @author 157675
 *
 */
public class Game {
	
	private Scanner in;
	private CombinationLock[] rooms;
	private int current, score;
	
	/**
	 * Creates a game, loading any defaults I think of later. DELETE IF UNNECESSARY
	 */
	public Game()
	{
		in = new Scanner(System.in);
		current = 0;
		score = MainGame.BEST_SCORE;
		
		//construct an array of rooms
		rooms = new CombinationLock[MainGame.ROOMS];
		for(int i=1; i<=rooms.length; i++)
			rooms[i-1] = new CombinationLock(i);
	}
	
	/**
	 * Runs the actual game.
	 */
	public void play()
	{
		boolean endGame = false;
		Date start = new Date();
		while(endGame != true) {
			
			// print information about location
			System.out.println(rooms[current].getInfo());
			
			rooms[current].tryLock(in.nextLine());
			System.out.println(rooms[current].Returns());
			if(rooms[current].lock()) {
				score += rooms[current].Score();
				current++;
			}
			if(current == rooms.length)
				endGame = true;
		}
		printScore(start);
		System.out.println("\nCongratulations on finishing the game! Thank you for playing.");
	}
	
	
	/**
	 * A method that prints the user's score, complete with time bonus.
	 * @param start the time at which the user began play
	 */
	private void printScore(Date start)
	{
		Date end = new Date();
		System.out.println("Your final score was " + (score + timeBonus(start, end))
				+ " out of " + MainGame.BEST_SCORE + ".");
	}
	
	/**
	 * Calculates the time bonus from start to finish of the user's session
	 * @param start the time at which the user began play
	 * @param end the time at which score is calculated
	 * @return the time bonus
	 */
	private double timeBonus(Date start, Date end)
	{
		double interval = end.getTime() - start.getTime();
		if(interval < MainGame.BONUS_TIME_LIMIT)
			return MainGame.MAX_TIME_BONUS*(interval/MainGame.BONUS_TIME_LIMIT);
		else
			return 0;
	}

}
