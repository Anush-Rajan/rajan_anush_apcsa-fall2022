//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int randnum = (int)(Math.random()*3);
		if (randnum == 0) {
			compChoice = "R";
		}
		else if (randnum == 1) {
			compChoice = "P";
		}
		else if (randnum == 2) {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		if (playChoice.equals((compChoice))) {
			return "Draw Game";
		}
		else if (playChoice.equals("R") && compChoice.equals("P")) {
			return "Computer wins <<Paper covers Rock>>";
		}
		else if (compChoice.equals("R") && playChoice.equals("P")) {
			return "Player wins <<Paper covers Rock>>";
		}
		else if (playChoice.equals("P") && compChoice.equals("S")) {
			return "Computer wins <<Scissors cuts Paper>>";
		}
		else if (compChoice.equals("P") && playChoice.equals("S")) {
			return "Player wins <<Scissors cuts Paper>>";
		}
		else if (compChoice.equals("S") && playChoice.equals("R")) {
			return "Player wins <<Rock breaks Scissors>>";
		}
		else {
			return "Computer wins <<Rock breaks Scissors>>";
		}
	}

	public String toString()
	{
		return "player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + "!" + determineWinner() + "!";
	}
}