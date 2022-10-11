//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String answer = "";
		int count = 1;
		for (int i=0; i < word.length(); i++) {
			answer += word.substring(0, count);
			count++;
		}
	}
}