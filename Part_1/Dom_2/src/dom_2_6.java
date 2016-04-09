import java.util.Scanner;

public class dom_2_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete chislo");
		int a = scan.nextInt();
		scan.close();
		int sum = 0;
		
		for (int i = 1; i<= a; i++) {
			sum = sum + i;
		}
		System.out.println("Rezultata e " + sum);

	}

}
