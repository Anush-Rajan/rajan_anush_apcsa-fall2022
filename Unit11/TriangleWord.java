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
		for (int i = 1; i <= word.length(); ++i) {
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < i; k++) {
					System.out.print(word.charAt(k));
				}
			}
			System.out.println();
		}
	}
}