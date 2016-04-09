import java.util.Scanner;

public class dom_5_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		String text1 = text.trim();
		for (int i = 0 ; i < text1.length(); i++) {
			System.out.print((char)(text1.charAt(i) + 5));
		}

	}

}
