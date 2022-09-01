//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare run = new WordsCompare();
	   
	   run.setWords("abe", "ape");
	   System.out.println(run);
	   
	   run.setWords("giraffe", "gorilla");
	   System.out.println(run);
	   
	   run.setWords("one", "two");
	   System.out.println(run);
	   
	   run.setWords("fun", "funny");
	   System.out.println(run);
	   
	   run.setWords("123", "19");
	   System.out.println(run);
	   
	   run.setWords("193", "1910");
	   System.out.println(run);
	   
	   run.setWords("goofy", "godfather");
	   System.out.println(run);
	   
	   run.setWords("funnel", "fun");
	   System.out.println(run);
		//add test cases

	}
}