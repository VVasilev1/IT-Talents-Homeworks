import java.util.Scanner;

public class dom_1_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if (num <100 || num > 999) {
			System.out.println("Greshno vavedeno chislo");
			System.exit(1);
		}
		int a= num % 10;
		int b = (num % 100)/10;
		int c = num /100;
		
		if (a == b && a == c) {
			System.out.println("Cifrite sa ravni");
			System.exit(1);
		}
		if (a > b && b > c) {
			System.out.println("Cifrite sa vav vazhodiasht red");
			System.exit(1);
		}
		if (a < b && b < c) {
			System.out.println("Cifrite sa v nizhodiasht red");
			System.exit(1);
		}
		System.out.println("Cifrite sa nenaredeni");
	}

}
