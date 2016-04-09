import java.util.Scanner;

public class dom_2_22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num < 1 || num > 999) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		scan.close();
		int count = 1;
		while (count <=10) {
			if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
				System.out.print(count + ": "+ num + ", ");
				count = count + 1;
			}
			num = num + 1;
			
		}
	}
}


