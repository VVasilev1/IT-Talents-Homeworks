import java.util.Scanner;

public class dom_5_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		String text1 = text.trim();
		boolean check = true;
		for (int i = 0; i < text1.length()/2; i++) {
			if (text1.charAt(i) != text1.charAt(text1.length()-i-1)) {
				check = false;
			}
		}
		if (check == true) {
			System.out.println("Dumata e palindrom");
		}
		else {
			System.out.println("Dumata ne e palidrom");
		}
	}

}
