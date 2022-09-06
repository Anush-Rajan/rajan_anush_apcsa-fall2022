//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   
   }
   
   public Perfect(int num) {
	   setNumber(num);
   }
   
   public void setNumber(int num) {
	   number = num;
   }

	//add a set method

	public boolean isPerfect()
	{
		int sum = 0;
		for (int i=1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return (number == sum);
	}

	//add a toString	
	public String toString() {
		return number + (isPerfect()? " is perfect" : " is not perfect");
	}
	
}