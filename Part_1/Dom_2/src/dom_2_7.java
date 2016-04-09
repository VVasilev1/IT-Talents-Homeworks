import java.util.Scanner;

public class dom_2_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Vavedete broi chisla");
		int num = scan.nextInt();
		scan.close();
		int a = 3;
		for (int i = 1; i<=num; i++) {
			System.out.print(a + " ");
			a = a+3;
		}
	}

}
