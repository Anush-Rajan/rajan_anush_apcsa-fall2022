//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		do {
			out.print("type in your prompt [R,P,S] :: ");
			String player = keyboard.nextLine();
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(player);
			game.determineWinner();
			System.out.println(game);
			
			out.print("\n Do you want to play again? ");
			response = keyboard.nextLine();
		}
		while (response.equals("y"));
		
		//add in a do while loop after you get the basics up and running
		
			
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();		
	}
}



