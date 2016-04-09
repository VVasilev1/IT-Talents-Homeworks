import java.util.Scanner;

public class dom_1_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		int temp;
		
		temp = a;
		a = b;
		b = c;
		c = temp;
		
		System.out.println("A1 = " + a);
		System.out.println("A2 = " + b);
		System.out.println("A3 = " + c);

	}

}
