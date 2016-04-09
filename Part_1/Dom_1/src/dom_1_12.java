import java.util.Scanner;

public class dom_1_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Year: ");
		int year = scan.nextInt();
		boolean vis = false;
		if (year < 0 || year > 2016) {
			System.out.println("Nevalidna godina");
			System.exit(1);
		}
		if (year % 4 == 0) {
			vis = true;
		}
		if (year % 100 == 0) {
			vis = false;
		}
		if (year % 400 == 0) {
			vis = true;
		}
		System.out.println("Mounth");
		int mounth = scan.nextInt();
		if (mounth<1 || mounth > 12) {
			System.out.println("Nevaliden mesec");
			System.exit(1);
		}
		System.out.println("Day: ");
		int day = scan.nextInt();
		if (day < 1 || day > 31) {
			System.out.println("Nevaliden den");
			System.exit(1);
		}
		if (day>30 && ((mounth == 1)||(mounth == 3)||(mounth == 5)||(mounth == 7)||(mounth == 8)||(mounth == 10)||(mounth == 12))) {
			System.out.println("Nevaliden den");
			System.exit(1);
		}
		if (mounth == 2 && day > 29) {
			System.out.println("Nevaliden den");
			System.exit(1);
		}
		if (day > 28 && mounth == 2 && vis == false) {
			System.out.println("Nevaliden den");
		}
	}

}
// WL3X CKNM