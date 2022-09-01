//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   a = a.toLowerCase();
	   char firstletter = a.charAt(0);
	   char lastletter = a.charAt(a.length()-1);
	   
	   if (firstletter == 'a' || firstletter == 'e' || firstletter == 'i' || firstletter == 'o' || firstletter == 'u') {
		   return "yes";
	   }
	   if (lastletter == 'a' || lastletter == 'e' || lastletter == 'i' || lastletter == 'o' || lastletter == 'u') {
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}