import java.util.Scanner;

public class dom_5_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text1 = scan.next();
		String text2 = scan.next();
		scan.close();
		
		text1 = text1.trim();
		text2 = text2.trim();

		int max = 0;
		if (text1.length() > text2.length()) {
			max = text2.length();
			System.out.println("Parviqt niz e po-golqm");
		}
		if (text2.length() > text1.length()) {
			max = text1.length();
			System.out.println("Vtoriqt niz e po-golqm");
		}
		if (text1.length() == text2.length()) {
			System.out.println("Dvata niza sa ravni");
			max = text1.length();
		}
		System.out.println("Razlika po pozicii:");
		for (int index = 0; index < max; index++) {
			if (text1.charAt(index) != text2.charAt(index)) {
				System.out.println(index+1 + " " + text1.charAt(index) + "-" + text2.charAt(index));
			}
		}

	}

}
