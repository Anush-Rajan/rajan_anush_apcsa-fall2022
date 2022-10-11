//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		
		Toy one = new Toy("sorry");
		one.setCount(1);
		System.out.println(one);
		
		Toy two = new Toy("gi joe");
		two.setCount(5);
		System.out.println(two);
	}
}