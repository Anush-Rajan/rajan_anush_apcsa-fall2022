//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
		setString("");
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		return (((word.length())%2) == 0);
	}

 	public String toString()
 	{
 		String output="";
 		if (isEven()) {
 			output = "even";
 		}
 		else {
 			output = "odd";
 		}
 		return output;
	}
}