import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete A: ");
		int a = scan.nextInt();
		System.out.println("Vavedete B: ");
		int b = scan.nextInt();
		scan.close();
		if (a == b) {
			System.out.println("Molq vavedete razlichni chisla");
			System.exit(1);
		}
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("Stoinosta na A e :" + a);
		System.out.println("Stoinosta na B e :" + b);

	}

}
