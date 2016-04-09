import java.util.Scanner;

public class dom_2_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.close();
		
		if (n< 10 || n > 5555 || m < 10 || m > 5555 ) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		int max = 0 , min = 0;
		if (n > m) {
			max = n;
			min = m;
		} else {
			max = m;
			min = n;
		}
		
		for (int i = max; i >= min; i--) {
			if (i%50 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
