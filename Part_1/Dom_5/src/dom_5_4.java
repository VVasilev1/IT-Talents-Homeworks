import java.util.Scanner;

public class dom_5_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete dve imena razdeleni sas ,");
		String name = scan.nextLine();
		scan.close();
		int sum1=0;
		int sum2=0;
		int temp=0;
		for (int index = 0; index<name.length(); index++) {
			if (name.charAt(index) == ',') {
				temp = index;
				break;
			}
			if (name.charAt(index) == ' ') {
				continue;
			}
			sum1 = sum1 + name.charAt(index);
			
		}
		for (int index = temp+1; index<name.length(); index++) {
			if (name.charAt(index) == ' ') {
				continue;
			}
			sum2 = sum2 + name.charAt(index);
		}
		
		if (sum1 > sum2) {
			System.out.println(name.substring(0, temp));
		}
		if (sum2 > sum1) {
			System.out.println(name.substring(temp+1, name.length()));
		}
		if (sum2 == sum1) {
			System.out.println("Imenata imat ednakava ASCII  suma");
		}

	}

}
