//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String onename = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int onesize = keyboard.nextInt();
		//instantiate monster one
		Monster monster1 = new Skeleton(onesize, onename);
		
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		String twoname = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int twosize = keyboard.nextInt();
		//instantiate monster two
		Monster monster2 = new Skeleton(twosize, twoname);
		
		System.out.println("\nMonster 1 - " + monster1);
		System.out.println("Monster 2 - " + monster2);
		
		String sizecompare = "";
		if (monster1.isBigger(monster2)) {
			sizecompare = "bigger";
		}
		else if (monster1.isSmaller(monster2)) {
			sizecompare = "smaller";
		}
		
		String same = "does not have";
		if (monster1.namesTheSame(monster2)) {
			same = "has";
		}
		
		System.out.println("\nMonster one is " + sizecompare + " than Monster two. \nMonster one " + same + " the same name as Monster two.");

		
		
	}
}