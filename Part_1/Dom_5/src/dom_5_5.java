import java.util.Scanner;

public class dom_5_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		
		int poz1 = -1;
		int poz2 = -1;
		for (int index = 0; index < word1.length(); index++) {
			for (int count = 0; count < word2.length(); count++) {
				if (word1.charAt(index) == word2.charAt(count)) {
					poz1 = index;
					poz2 = count;
					break;
				}
			}
			if (poz1 > -1) {
				break;
			}
		}
		for (int i = 0; i < word1.length(); i++) {
			for (int z = 0; z < poz2; z++) {
				if (i != poz1) {
					System.out.print(" ");
				}
			}
			if (i == poz1) {
				System.out.print(word2);
				System.out.println();
				continue;
			}
			System.out.println(word1.charAt(i));

		}

	}

}
