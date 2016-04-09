import java.util.Scanner;

public class dom_1_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l_1 = scan.nextInt();
		int l_2 = scan.nextInt();
		int l_3 = scan.nextInt();
		int l_4 = scan.nextInt();
		scan.close();
		
		if ((l_1 <1 || l_1 >8) || (l_2<1 || l_2>8) || (l_3<1 || l_3>8) || (l_4<1 || l_2>4)) {
			System.out.println("greshni danni");
			System.exit(1);
		}
		
		if ((l_1 % 2) == (l_3 % 2)) {
			if (l_2 % 2 == l_2 % 2) {
				System.out.println("Poziciite sa s ednakav cvqt");
				System.exit(1);
			}
		}
		if ((l_1 % 2) != (l_3 % 2)) {
			if (l_2 % 2 != l_4 % 2) {
				System.out.println("Poziciite sa s ednakav cvqt");
				System.exit(1);
			}
		}
		System.out.println("Poziciite sa s razlichen cvqt");

	}

}
