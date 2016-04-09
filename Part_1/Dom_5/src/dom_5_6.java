import java.util.Scanner;

public class dom_5_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String text1 = text.trim();
		String[] names = text1.split(" ");
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() == 0) {
				continue;
			}
			System.out.print(
					names[i].toUpperCase().charAt(0) + names[i].toLowerCase().substring(1, names[i].length()) + " ");

		}
	}

}
