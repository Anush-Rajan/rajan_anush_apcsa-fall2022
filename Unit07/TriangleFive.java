//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		
		for (int row = amount; row > 0; row--) {
			for (int lGroup = 0; lGroup < row; lGroup++) {
				for (int lett = (amount - lGroup); lett > 0; lett--) {
					if ((letter + lGroup) > 90) {
						output += (char) (65 + ((letter + lGroup) % 90));
					}
					else {
						output += (char) (((letter + lGroup)));
					}
				}
				output += " ";
			}
			output += "\n";
		}
		return output;
	}
}