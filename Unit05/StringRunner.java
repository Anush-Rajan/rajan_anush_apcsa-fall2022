//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a word:: ");
		String s = keyboard.nextLine();
		
		StringOddOrEven test = new StringOddOrEven();
		test.setString(s);
		test.isEven();
		test.toString();
		System.out.println(s + " is " + test.toString());
		
	}
}