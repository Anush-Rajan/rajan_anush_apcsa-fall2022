//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	//private double bill;
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double amt)
	{
		//bill = amt;
		if (amt <= 2000) {
			return amt;
			//System.out.println("Bill after discount:: " + amt);
		}
		else {
			return 0.85*amt;
			//System.out.println("Bill after discount:: " + (amt*0.85));
		}
	}
}