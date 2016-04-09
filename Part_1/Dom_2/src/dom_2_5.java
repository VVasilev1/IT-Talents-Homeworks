import java.util.Scanner;

public class dom_2_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int min, max;
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		while (min <= max) {
			System.out.print(min + " ");
			min++;
		}

	}

}
