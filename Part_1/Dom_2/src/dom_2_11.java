import java.util.Scanner;

public class dom_2_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		for (int i = 1; i < num + 1; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) - 1; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
