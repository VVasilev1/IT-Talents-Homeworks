import java.util.Scanner;

public class dom_1_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a < 10 || a > 9999) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		scan.close();
		int celi = a / 5;
		int ost = a - (celi*5);
		if (ost == 1) {
			celi = celi-1;
			ost = a - (celi*5);
		}
		System.out.println(celi + " pati po 2 litra,");
		System.out.println(celi + " pati po 3 litra");
		if (ost == 0) {
			System.out.println("Nqma ostatak");
		}
		if (ost == 2) {
			System.out.println("Dopalnitelno 1 pat po 2 litra");
		}
		if (ost == 3) {
			System.out.println("Dopalnitelno 1 pat po 3 litra");
		}
		if (ost == 4) {
			System.out.println("Dopalnitelno 2 pati po 2 litra");
		}
		if (ost == 6) {
			System.out.println("Dopalnitelno 2 pati po 3 litra");
		}
	}

}
