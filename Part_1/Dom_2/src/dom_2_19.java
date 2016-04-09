import java.util.Scanner;

public class dom_2_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if (num <10 || num > 99) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		int test = num - 1;
		while (test != 1) {
			if (num % 2 == 0) {
				num = num /2;
			} else {
				num = 3*num + 1;
			}
			System.out.print(num + " ");
			test = num - 1;
		}
		System.out.print(test);
	}

}
