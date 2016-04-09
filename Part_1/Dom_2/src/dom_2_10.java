import java.util.Scanner;

public class dom_2_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Chisloto ne e prosto");
				System.exit(1);
			}
		}
		System.out.println("Chisloto e prosto");

	}

}
