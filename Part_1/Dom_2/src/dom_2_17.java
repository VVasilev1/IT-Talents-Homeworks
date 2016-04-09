import java.util.Scanner;

public class dom_2_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		if (b < 3 || b > 20) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		char c = scan.next().charAt(0);
		scan.close();
		for (int i = 0; i < b; i++) {
			System.out.print("*");
		}
		for (int x = 1; x < b - 1; x++) {
			System.out.print("\n*");
			for (int i = 1; i < b - 1; i++) {
				System.out.print(c);
			}
			System.out.print("*");
		}
		System.out.println("");
		for (int i = 0; i < b; i++) {
			System.out.print("*");
		}
	}

}
