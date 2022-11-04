//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number>0) {
			number = number/10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sort = new int[getNumDigits(number)];
		int n = number;
		for(int i = 0; i<getNumDigits(number); i++) {
			sort[i] = n %10;
			n = n/10;
		}
		for(int i=0; i< sort.length-1; i++){
		      int min = i;
		      for(int j = i+1; j<sort.length; j++)
		      {
		         if( sort[j] < sort[min] )
		            min = j;    		//find location of smallest
		      }
		      if(min != i) {
		         int temp = sort[min];
		         sort[min] = sort[i];
		         sort[i] = temp;   	//put smallest in spot i
		      }
		   }

		return sort;
	}
}