//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		
		String test = "";
		Word one = new Word(test);
		Word two = new Word(test);
		Word three = new Word(test);
		
		int size = file.nextInt();
		file.nextLine();
		
		String[] answer = new String[size];
		for (int i = 0; i < size; i++) {
			String s = file.nextLine();
			answer[i] = new String(s);
		}
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j<answer.length; j++) {
				one = new Word(answer[j]);
				two = new Word(answer[i]);
				if (one.compareTo(two) >= 1) {
					String z = answer[j];
					answer[j] = answer[i];
					answer[i] = z;
				}
			}
		}
		for (int i = 0; i<answer.length; i++) {
			three = new Word(answer[i]);
			System.out.println(three);
		}
		











	}
}