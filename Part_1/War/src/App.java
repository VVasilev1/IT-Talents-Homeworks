import java.util.Random;

public class App {
	static void war(Person p1, Person p2, int[] deck) {
		allocateCards(p1, p2, deck);
		int score1 = deck.length/2;
		int score2 = deck.length/2;
		for (int index = 0; index < deck.length / 2; index++) {
			showCard(p1.getDeck(index));
			showCard(p2.getDeck(index));
			System.out.println();
			if ((p1.getDeck(index)-1) /4 > (p2.getDeck(index)-1) /4 ) {
				score1++;
				score2--;
			}
			if ((p1.getDeck(index)-1) /4 < (p2.getDeck(index)-1) /4 ) {
				score1--;
				score2++;
			}
			if ((p1.getDeck(index)-1) /4 == (p2.getDeck(index)-1) /4 ) {
				System.out.println("            WAR!");
				
				
			}
			
		}
		System.out.println(score1 + "      " + score2);
	}
	static void warr (Person p1, Person p2, int index) {
		for (int temp = 1; temp < 4 ; temp++) {
			showCard(p1.getDeck(index + temp));
			showCard(p2.getDeck(index + temp));
		}
		
	}
	static void showCard(int card) {
		switch ((card - 1) / 4) {
		case 0:
			System.out.print("2 ");
			break;
		case 1:
			System.out.print("3 ");
			break;
		case 2:
			System.out.print("4 ");
			break;
		case 3:
			System.out.print("5 ");
			break;
		case 4:
			System.out.print("6 ");
			break;
		case 5:
			System.out.print("7 ");
			break;
		case 6:
			System.out.print("8 ");
			break;
		case 7:
			System.out.print("9 ");
			break;
		case 8:
			System.out.print("10");
			break;
		case 9:
			System.out.print("J ");
			break;
		case 10:
			System.out.print("Q ");
			break;
		case 11:
			System.out.print("K ");
			break;
		case 12:
			System.out.print("A ");
			break;

		default:
			break;
		}

		switch (card % 4) {
		case 0:
			System.out.print("Spatiq           ");
			break;
		case 1:
			System.out.print("Karo             ");
			break;
		case 2:
			System.out.print("Kupa             ");
			break;
		case 3:
			System.out.print("Pika             ");
			break;

		default:
			break;
		}
	}

	static void allocateCards(Person p1, Person p2, int[] deck) {
		shuffle(deck);
		int[] temp1 = new int[deck.length / 2];
		int[] temp2 = new int[deck.length / 2];

		for (int index = 0; index < temp1.length; index++) {
			temp1[index] = deck[index];
		}
		for (int index = 0; index < temp1.length; index++) {
			temp2[index] = deck[index + temp2.length];
		}
		p1.setDeck(temp1);
		p2.setDeck(temp2);
	}

	static void shuffle(int[] deck) {
		Random r = new Random();
		for (int index = 0; index < 1000; index++) {
			int temp = r.nextInt(51) + 0;
			int temp2 = r.nextInt(51) + 0;
			int var = deck[temp];
			deck[temp] = deck[temp2];
			deck[temp2] = var;
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("Vladimir");
		Person p2 = new Person("Antonia");

		int[] deck = new int[52];

		for (int index = 0; index < deck.length; index++) {
			deck[index] = index + 1;
		}

		war(p1, p2, deck);

	}
}
