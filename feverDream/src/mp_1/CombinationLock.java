package mp_1;
 
public class CombinationLock {

   	private boolean open;
   	private int Puzzle;
   	private String returns;
   	private int score = 0;
   	private String info;
   	
   	/**
   	 * Creates a combination lock that is determined by the puzzle number. 
   	 * Puzzle 1 is the puzzle with opening the gas container. 
   	 * Puzzle 2 is the puzzle with the riddle: "Name the element that makes up the backbone of organic chemistry."
   	 * Puzzle 3 is the puzzle where you determine what to drink.
   	 * Puzzle 4 is the puzzle where you determine what to throw at the grease fire.
   	 * Puzzle 5 is the puzzle where you have a key that unlocks a specific key.
   	 * Puzzle 6 is the final puzzle that opens the door. 
   	 * @param puzzlenumber determines which puzzle is run.
   	 */
   	public CombinationLock(int puzzlenumber)
   	{
   		Puzzle = puzzlenumber;
        open = false;
   	}
   	
   	/**
   	 * Returns the info that is given before the puzzle.
   	 * @return the info that is given before the puzzle. 
   	 */
   	public String getInfo()
   	{
   		if(Puzzle == 1)
        	info = "You are in a cold dark cellar. \n The air is thin. It's hard to breathe. \n You see three tanks filled with gases. They are labeled as He, Cl2, and O2. \n Which do you choose to open? Please type your input as He, Cl2, or O2.";
        if(Puzzle == 2)
        	info = "Now that you can breathe, you look for a way to exit the cellar, and come across a door with a combination lock on it. \n On the lock, there is a riddle: \n Name the element that makes up the backbone of organic chemistry.";
        if(Puzzle == 3)
        	info = "You find yourself in a dimly lit kitchen. There's a candle near the stove. The door slams behind you. \n \n Come to think of it, you’re… really thirsty. \n You find three jars, each labeled with compounds: NaCl, C6H12O6, and Hg. \n Which do you pick to drink?";
        if(Puzzle == 4)
        	info = "A grease fire starts suddenly from the candle. You frantically look around for things to throw at the fire. \n You see baking soda, water, and wood. \n What do you throw at the fire?";
   		if(Puzzle == 5)
   			info = "The smoke from the fire is suffocating. \n You should probably find your way out of the room before it gets worse. \n \n You look around a find a key that is labeled Be. \n There are eight locked doors, that are labeled with the numbers 1 through 8. \n Which door do you choose to try? (Enter in a number)";
        if(Puzzle == 6)
        	info = "You get to a room that basically looks like a warehouse for chemicals. \n There is a heavy wooden door in the room and a draft coming into the room. \n How do you choose to open the door? \n 1. Kick the door until it opens. \n 2. Run at the door until it opens. \n 3. Throw all the chemicals!! \n 4. Look around at the chemicals, and choose specific ones to throw at the door. \n Please enter in a number from 1 - 4 indicating your choice.";        
        return info;
   	}
   	
   	/**
   	 * Closes the lock, which resets it.
   	 */
   	public void closeLock()
   	{
          	open = false;
   	}
   	
   	/**
   	 * Tries the lock at the specific input.
   	 * @param input to try to open the lock with
   	 */
   	public void tryLock(String input)
   	{
   		switch(Puzzle) {
   		case 1: 
   			if(input.equalsIgnoreCase("He") || input.equalsIgnoreCase("Helium"))
   			{
   				open = false;
   				returns = "Your voice becomes squeaky, but it is still hard to breathe. Try again.";
   				score++;
   			}
   			else if(input.equalsIgnoreCase("Cl2") || input.equalsIgnoreCase("Chlorine"))
   			{
   				open = false;
   				returns = "As you look closer, you see a faint yellow-green tinge to the tank. You don't trust it. Try again.";
   				score++;
   			}
   			else if(input.equalsIgnoreCase("O2") || input.equalsIgnoreCase("Oxygen"))
   			{
   				open = true;
   				returns = "It becomes easier to breathe.";
   			}
   			else
   			{
   				open = false;
   				returns = "You don't see anything like that. Try again.";
   				score++;
   			}
   		break;
   		case 2: 
   			if(input.equalsIgnoreCase("Carbon") || input.equalsIgnoreCase("c"))
   			{
   				open = true;
   				returns = "The door clicks open.";
   			}
   			else
   			{
   				open = false;
   				score++;
   				returns = "Nothing happens. Try again.";
   			}
   		break;
   		case 3: 
   			if(input.equalsIgnoreCase("NaCl") || input.equalsIgnoreCase("Salt"))
   			{
   				open = false;
   				score++;
   				returns = "You take a big gulp. Moments later, you choke- you feel even thirstier now. Try again.";
   			}
   			else if(input.equalsIgnoreCase("Hg") || input.equalsIgnoreCase("Mercury"))
   			{
   				open = false;
   				score++;
   				returns = "Are you sure you want to drink this? Something feels very wrong about this water. Try again.";
   			}
   			else if(input.equalsIgnoreCase("C6H12O6") || input.equalsIgnoreCase("sugar"))
   			{
   				open = true;
   				returns = "Tastes a bit strange, but you feel temporarily quenched.";
   			}
   			else
   			{
   				open = false;
   				score++;
   				returns = "You don't see anything like that here. Try again.";
   			}
   		break;
   		case 4: 
   			if(input.equalsIgnoreCase("Baking Soda"))
   			{
   				open = true;
   				returns = "You completely douse the fire with baking soda.";
   			}
   			else if(input.equalsIgnoreCase("Water"))
   			{
   				open = false;
   				score++;
   				returns = "You remember what your science teacher taught you about grease fires: grease fires can get insanely hot- throwing water on it would throw burning grease into the air from hot steam. Throwing water on the grease fire would probably be a bad idea. Try again.";
   			}
   			else if(input.equalsIgnoreCase("wood"))
   			{
   				open = false;
   				score++;
   				returns = "Do you really want to give that fire more fuel? Try again.";
   			}
   			else
   			{
   				open = false;
   				score++;
   				returns = "You don't see anything like that around here. The fire continues roaring. Try again.";
   			}
   		break;
   		case 5: 
   			if(input.equalsIgnoreCase("4"))
   			{
   				open = true;
   				returns = "The door unlocks";
   			}
   			else if(input.equals("1") || input.equals("2") || input.equals("3") || input.equals("5") || input.equals("6") || input.equals("7") || input.equals("8"))
   			{
   				open = false;
   				score++;
   				returns = "You try the key, but it doesn't fit in the lock. Try again.";
   			}
   			else
   			{
   				open = false;
   				score--;
   				returns = "You don't see a door with that number. Try again.";
   			}
   		break;
   		case 6: 
   			if(input.equals("1") || input.equals("1.") || input.equalsIgnoreCase("one"))
   			{
   				open = true;
   				returns = "You manage to stub your toe in the process, but manage to finally get the door open.";
   			}
   			else if(input.equals("2") || input.equals("2.") || input.equalsIgnoreCase("two"))
   			{
   				open = true;
   				returns = "You bang your head a couple of times, but manage to finally get the door open.";
   			}
   			else if(input.equals("3") || input.equals("3.") || input.equalsIgnoreCase("three"))
   			{
   				open = true;
   				returns = "Eventually the chemicals react. Thankfully, you didn't find any fatal chemicals and eventually the door explodes open.";
   			}
   			else if(input.equals("4") || input.equals("4.") || input.equalsIgnoreCase("four"))
   			{
   				open = true;
   				returns = "You find a container of lithium contained in oil. The label reads 'Keep Away from Water'. You find a bucket of water and douse the door with water, then throw the jar of Lithium at it. The door sets on fire when the lithium jar explodes. When the fire clears, the remains of the door reveal an open frame.";
   			}
   			else
   			{
   				open = false;
   				score--;
   				returns = "Please check the input of your answer. Try again.";
   			}
   					
   		break;
   		}
   	}
   	
   	/**
   	 * Returns whether the puzzle is solved or not.
   	 * @return whether the puzzle is solved or not
   	 */
   	public boolean lock()
   	{
   		return open;
   	}
   	
   	/**
   	 * Returns the strings from solving puzzles.
   	 * @return the strings from solving puzzles
   	 */
   	public String Returns()
   	{
   		return returns;
   	}
   	
   	/**
   	 * Returns the score, which is the number of wrong inputs.
   	 * @return the score
   	 */
   	public int Score()
   	{
   		return score;
   	}
 
}