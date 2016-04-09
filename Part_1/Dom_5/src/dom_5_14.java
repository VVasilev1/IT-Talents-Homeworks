import java.util.Scanner;

public class dom_5_14 {
	static int fak(int n) {
		if (n == 0) {
			return 0;
		}
		int sum = 1;
		while (n != 0) {
			sum = sum * n;
			if (n > 0) {
				n--;
			}
			if (n < 0) {
				n++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(fak(num));
	}

}
