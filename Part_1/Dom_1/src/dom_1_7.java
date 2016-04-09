import java.util.Scanner;

public class dom_1_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Hour :");
		int hour = scan.nextInt();
		System.out.println("Money : ");
		double money = scan.nextDouble();
		System.out.println("Am i healthy? : ");
		boolean healthy = scan.nextBoolean();
		scan.close();
		
		if (healthy == false) {
			System.out.println("I wont go out");
		}
		if (money > 0) {
			System.out.println("I'll buy medicine");
		} else  {
			System.out.println("I'll stay home and drink tea");
		}
		if (healthy == true) {
			System.out.println("I'll go to the movies with friends");
		}
		if (money < 10) {
			System.out.println("I'll go grab a coffe");
		}

	}

}
