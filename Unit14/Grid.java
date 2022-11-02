//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
	 private String[][] grid;

	   //load vals into the rows x cols grid randomly
		public Grid(int rows, int cols, String[] vals)
		{
			grid = new String[rows][cols];
			for(int i = 0; i<grid.length; i++) {
				for(int j = 0; j<grid[i].length; j++) {
					grid[i][j] = vals[(int)(Math.random()*vals.length)];
				}
			}
			findMax(vals);
		}
		
		//debugging
		public String Debugging(String[] vals) {
			String output="";
			for(int k = 0; k<vals.length; k++) {
				output+=(vals[k] + " count is " + countVals(vals[k]) + "\n");
			}
			return output;
		}

		//find out which of the vals occurs the most
		public String findMax(String[] vals)
		{
			int count = 0;
			int count1 = 0;
			for(int i = 0; i<vals.length-1; i++) {
				for(int j= 0; j<grid.length; j++) {
					for(int k = 0; k<grid[j].length; k++) {
						if(grid[j][k] == vals[i]) {
							count++;
						}
						if(grid[j][k] == vals[i+1]) {
							count1++;
						}
					}
				}
				if(count > count1) {
					String temp = vals[i];
					vals[i] = vals[i+1];
					vals[i+1] = temp;
				}
			}
			return vals[vals.length-1];
			
		}

		//returns a count of how many times val occurs in the matrix
		private int countVals( String val )
		{
			int count = 0;
			for(int i = 0; i<grid.length; i++) {
				for(int j = 0; j<grid[i].length; j++) {
					if(grid[i][j] == val) count++;
				}
			}
			return count;
		}

		//display the grid
		public String toString()
		{
			String output="";
			for(int i = 0; i<grid.length; i++) {
				for(int j = 0; j<grid[i].length; j++) {
					output += " " + grid[i][j];
					if(j==grid[i].length-1) output += "\n";
				}
			}
			return output;
			
		}
}