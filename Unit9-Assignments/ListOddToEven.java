//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int evenindex = -1;
		int oddindex = -1;
		
		for (int i = 0; i < ray.size(); i++) {
			
			if (oddindex >= 0 && evenindex >= 0) {
				return evenindex - oddindex;
			}
			
			if ((oddindex < 0) && (ray.get(i) % 2 == 1)) {
				oddindex = i;
				continue;
			}
			
			if (((evenindex < 0) && (oddindex >= 0))  && (ray.get(i) % 2 == 0)) {
				evenindex = i;
				continue;
			}
			
			
		}
		
		return -1;
	}
}