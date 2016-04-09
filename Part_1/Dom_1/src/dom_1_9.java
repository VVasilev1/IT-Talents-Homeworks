import java.util.Scanner;

public class dom_1_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		if (a <10 || a > 99) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		
		if (b<10 || b>99) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		System.out.print(a * b + ", ");
		int ost = (a*b) % 2;
		if(ost ==1) {
			System.out.println((a*b) % 10 + " - nechetna");
		}

	}

}
