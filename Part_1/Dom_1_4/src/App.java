import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete A: ");
		int a = scan.nextInt();
		System.out.println("Vavedete B : ");
		int b = scan.nextInt();
		scan.close();
		
		if (a > b) {
			System.out.println((b) + " " + (a));
		}
		else {
			System.out.println((a) + " " + (b));
		}
		

	}

}
