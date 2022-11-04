//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*; 

public class NumberSorterRunner
{
	public static void main(String args[])
	{
		int[] cases = {567891, 901912468, 864213507, 898777, 234422};
		for( int run : cases )
		{
			int[] one = NumberSorter.getSortedDigitArray( run );
			for(int item : one)
			{
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}
}