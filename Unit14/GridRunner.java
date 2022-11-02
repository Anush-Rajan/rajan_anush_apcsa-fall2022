//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main (String args[]) throws IOException
	{
		String[] vals = {"a", "b", "c", "7", "9", "x", "2"};
		Grid s = new Grid(20, 20, vals);
		System.out.println(s);
		System.out.println("--debugging code to help see if the algorithm is working-- \n--these println statements can be added to the max method--");
		System.out.println(s.Debugging(vals));
		System.out.println(s.findMax(vals) + " occurs the most.");
	}
}