import java.util.Scanner;

public class dom_1_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num < 100 || num > 999) {
			System.out.println("Greshno vavedeno chislo");
			System.exit(1);
		}
		if ((num % 10 == 0) || ((num % 100)/10) ==0) {
			System.out.println("Greshno vavedeno chislo");
			System.exit(1);
		}
		scan.close();
		int a= num % 10;
		int b = (num % 100)/10;
		int c = num /100;
		
		if (num % a == 0 && num % b ==0 && num %c==0) {
			System.out.println("Chisloto se deli na vsiaka svoia cifra");
		} else {
			System.out.println("Chisloto ne se deli na vsiaka svoia cifra");
		}
	}

}
