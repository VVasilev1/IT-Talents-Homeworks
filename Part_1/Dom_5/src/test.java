import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		do {
		num = scan.nextInt();
		} while(num > 700000 || num < 0);
		int sum = 0;
		int temp = 0;
		int var = 1;
		int x = 0;
		while (temp < num) {
			System.out.print(temp + ", ");
			sum = sum + temp;
			x = temp;
			temp = temp + var;
			var = x;
		}
		System.out.println(sum);
	}

}
