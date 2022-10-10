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
		int evencount = 0;
		int evenc = 0;
		
		
		for (int i =0; i<ray.size(); i++) {
			if (ray.get(i)%2 == 0) {
				evencount++;
			}
		}
		
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) % 2 == 0) {
				evenc++;
			}
			if (evenc == evencount) {
				evenindex = i;
			}
			if (oddindex >= 0 && evenindex >= 0) {
				return evenindex - oddindex;
			}
			
			if ((oddindex < 0) && (ray.get(i) % 2 == 1)) {
				oddindex = i;
				continue;
			}
			

		}
		
		return -1;
	}
}