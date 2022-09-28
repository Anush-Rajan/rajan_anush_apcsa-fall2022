/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = {"10", "Queen", "Ace", "7"};
		String[] suit1 = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int[] value1 = {10, 12, 1, 7};
		
		Deck deck1 = new Deck(rank1, suit1, value1);
		
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println("\n");
		
		String[] rank2 = {"4", "8", "King", "1"};
		String[] suit2 = {"Spades", "Hearts", "Diamonds", "Clubs"};
		int[] value2 = {4, 8, 13, 1};
		
		Deck deck2 = new Deck(rank2, suit2, value2);
		
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck2.deal());
		System.out.println("\n");
		
		String[] rank3 = {"6", "Jack", "4", "2"};
		String[] suit3 = {"Clubs", "Spades" , "Hearts", "Diamonds"};
		int[] value3 = {6, 11, 4, 2};
		
		Deck deck3 = new Deck(rank3, suit3, value3);
		
		System.out.println(deck3.isEmpty());
		System.out.println(deck3.size());
		System.out.println(deck3.deal());
		
		String[] rank4 = {"Ace" , "2", "3" , "4", "5" , "6", "7", "8", "9" , "10", "Jack", "Queen", "King" };
		String[] suit4 = {"Clubs", "Spades", "Hearts", "Diamonds"};
		int[] value4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		Deck deck4 = new Deck(rank4, suit4, value4);
		
		deck4.shuffle();
		System.out.println(deck4);
		
	}
	
}
