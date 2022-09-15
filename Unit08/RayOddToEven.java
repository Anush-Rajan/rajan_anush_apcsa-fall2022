//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int evenindex = -1;
		int oddindex = -1;
		
		for (int i = 0; i < ray.length; i++) {
			
			if (oddindex >= 0 && evenindex >= 0) {
				return evenindex - oddindex;
			}
			
			if ((oddindex < 0) && (ray[i] % 2 == 1)) {
				oddindex = i;
				continue;
			}
			
			if (((evenindex < 0) && (oddindex >= 0))  && (ray[i] % 2 == 0)) {
				evenindex = i;
				continue;
			}
			
			
		}
		
		return -1;

	}
	
}