//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if (num < 0) {
			num = Math.abs(num);
			Math.abs(num);
		}
		return (num%2 == 1);
	}
	public static boolean isEven( int num )
	{
		if (num < 0) {
			num = Math.abs(num);
		}
		return (num%2 == 0);

	}	
}