import java.util.Scanner;

public class dom_2_24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if (num < 10 || num > 30000) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		int count = 0;
		int a= 0, b = 0;
		int temp = num;
		do {
			temp = temp / 10;
			count++;
		} while (temp > 0);

		switch (count) {
		case 2:
			a = num / 10;
			b = num % 10;
			break;
		case 3 :
			a = num / 100;
			b = num%10;
			break;
		case 4 :
			a = ((num/1000) * 10) + ((num /100) %10);
			b = ((num% 10)*10) + (((num%100)/10));
			break;
		case 5 :
			a = ((num/10000)*10) + ((num /1000) %10);
			b = ((num% 10)*10) + (((num%100)/10));
		default:
			break;
		}
		if ( a == b ) {
			System.out.println("Chisloto e polidrom");
		} else {
			System.out.println("Chisloto ne e polidrom");
		}
	}

}
