import java.util.Scanner;

public class dom_5_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String text1 = text.trim();
		String[] names = text1.split(" ");
		int max = 0;
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > max) {
				max = names[i].length();
			}
			if (names[i].length() != 0 ) {
				count++;
			}
		}
		System.out.println(count + " dumi, nai-golqmata e s " + max + " simvola");
		

	}

}
