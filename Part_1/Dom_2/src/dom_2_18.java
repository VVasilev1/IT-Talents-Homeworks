import java.util.Scanner;


public class dom_2_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		if (num1 <1 || num1 > 9 || num2 <1 || num2 > 9) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		for (int i = 1; i<=num1; i++) {
			for ( int t = 1; t<=num2; t++) {
				System.out.println(i + " * " + t + " = " + (i*t));
			}
		}

	}

}
