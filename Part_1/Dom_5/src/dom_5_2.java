import java.util.Scanner;

public class dom_5_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete parvata duma");
		String word1 = scan.next();
		System.out.println("Vavedete vtorata duma");
		String word2 = scan.next();
		scan.close();
		if (word1.length() > 20 || word1.length() < 10 || word2.length() > 20 || word2.length() < 10) {
			System.out.println("Greshno vavedeni danni");
			System.exit(1);
		}

		String temp = word1.substring(0, 5);
		String temp2 = word2.substring(0, 5);
		StringBuilder build = new StringBuilder(word1);
		build.replace(0, 5, temp2);

		StringBuilder build2 = new StringBuilder(word2);
		build2.replace(0, 5, temp);

		if (build.length() > build2.length()) {
			System.out.println(build.length() + "  " + build);
		}
		if (build2.length() > build.length()) {
			System.out.println(build2.length() + "  " + build2);
		}
		if (build.length() == build2.length()) {
			System.out.println(build.length() + "  " + build + " " + build2);
		}

	}

}
