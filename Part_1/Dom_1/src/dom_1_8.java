import java.util.Scanner;

public class dom_1_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		if (num< 1000 && num > 9999){
			System.out.println("Invalid number");
			System.exit(1);
		}
		scan.close();
		int a,b,c,d;
		a = num / 1000;
		d = num % 10;
	
		
		b = num / 100;
		b = b % 10;
		
		c = num / 10;
		c = c % 10;
		
		int sum1;
		int sum2;
		
		sum1 = (a*10) + d;
		sum2 = (b*10) + c;
		
		if (sum1 > sum2) {
			System.out.println(sum1 + " > " + sum2);
			System.exit(1);
		}
		if (sum2 > sum1) {
			System.out.println(sum2 + " > " + sum1);
		} else {
			System.out.println(sum1 + " = " + sum2);
		}
	}

}
