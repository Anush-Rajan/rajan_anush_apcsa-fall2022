
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("3", "Spades", 3);
		Card two = new Card("2", "Hearts", 2);
		Card three = new Card("3", "Spades", 3);
		
		System.out.println("Card 1: " + one.toString());
		System.out.println("Card 2: " + two.toString());
		System.out.println("Card 3: " + three.toString());
		System.out.println("Do cards 1 and 2 match? " + one.matches(two));
		System.out.println("Do cards 1 and 3 match? " + one.matches(three));
		
				
	}
}

