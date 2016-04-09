import java.util.Scanner;

public class dom_2_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		if (num < 10 || num > 200) {
			System.out.println("Wrong input"); 
			System.exit(1);
		}
		for (int i = num; i >=10; i--) {
			if (i%7 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
