import java.util.Scanner;

public class dom_2_25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			scan.close();
			int sum = 1;
			for (int i = 1; i<=num; i++) {
				sum = sum * i;
			}
			System.out.println(sum);
	}

}
