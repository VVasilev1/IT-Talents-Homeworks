import java.util.Scanner;

public class dom_1_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int a=0, b=0, c=0;
		if (num<2 || num > 27) {
			System.out.println("Wrong input!");
			System.exit(1);
		}
		for (int i = 100; i<=999; i++) {
			a = i%10;
			b = i / 100;
			c = (i%100)/10;
			if ((a + b + c) == num) {
				System.out.print(i + " ");
			}
		}
		

	}

}
