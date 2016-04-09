import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete A: ");
		double a = scan.nextDouble();
		System.out.println("Vavedete B: ");
		double b = scan.nextDouble();
		System.out.println("Vavedete C: ");
		double c = scan.nextDouble();
		scan.close();

		if (a > b) {
			if (c < a && c > b) {
				System.out.println("Chisloto " + c + " e mejdu " + a + " i " + b);
			} else {
				System.out.println("Chisloto " + c + " ne e mejdu " + a + " i " + b);

			}
		} else if (a < b) {
			if (c > a && c < b) {
				System.out.println("Chisloto " + c + " e mejdu " + a + " i " + b);
			} else {
				System.out.println("Chisloto " + c + " ne e mejdu " + a + " i " + b);
			}
		} else {
			System.out.println("Chisloto " + c + " ne e mejdu " + a + " i " + b);
		}
	}

}
