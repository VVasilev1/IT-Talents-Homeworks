import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete A: ");
		int a = scan.nextInt();
		System.out.println("Vavedete B: ");
		int b = scan.nextInt();
		System.out.println("Vavedete C: ");
		int c = scan.nextInt();
		scan.close();
		
		
		if (a >= b && a >= c ) {
			if (b>=c) {
				System.out.println((a) + " " + b + " " + c);
				System.exit(1);
			}
			else {
				System.out.println((a) + " " + c + " " + b);
				System.exit(1);
			}
		}
		if (b >= a && b >= c ) {
			if (a>=c) {
				System.out.println((b) + " " + a + " " + c);
				System.exit(1);
			}
			else {
				System.out.println((b) + " " + c + " " + a);
				System.exit(1);
			}	
		}
		if (c >= b && c >= a ) {
			if (a>=b) {
				System.out.println((c) + " " + a + " " + b);
				System.exit(1);
			}
			else {
				System.out.println((c) + " " + b + " " + a);
				System.exit(1);
			}
		
				
}
}
}
