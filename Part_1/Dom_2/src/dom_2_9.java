import java.util.Scanner;

public class dom_2_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int sum = 0;
		for (int i = a; i<=b; i++) {
			if ((i*i) % 3 == 0) {
				System.out.print("skip 3" + " , ");
				continue;
			}
			System.out.print((i*i) + " , ");
			sum = sum + (i*i);
			if (sum > 200) {
				break;
			}
		}

	}

}
