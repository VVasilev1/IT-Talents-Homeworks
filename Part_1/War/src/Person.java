
public class Person {		
	private String name;
	private int [] deck = new int [25];
	
	Person (String name) {
		this.name = name;
	}

	public int getDeck(int temp) {
		return deck[temp];
	}

	public void setDeck(int[] deck) {
		this.deck = deck;
	}
	
	
	
	
}
