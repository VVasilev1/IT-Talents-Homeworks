import java.util.Scanner;

public class dom_5_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		String text1 = text.trim();
		int temp = 0;
		int sum = 0;
		boolean check = false;
		for(int i =0; i< text1.length();i++) {
				if (temp<0) {
					check = true;
					temp = 0;
				}
			switch	 (text1.charAt(i)) {
			
			case '0':	temp = temp * 10 + 0; break;
			case '1':	temp = temp * 10 + 1; break;
			case '2':	temp = temp * 10 + 2; break;
			case '3':	temp = temp * 10 + 3; break;
			case '4':	temp = temp * 10 + 4; break;
			case '5':	temp = temp * 10 + 5; break;
			case '6':	temp = temp * 10 + 6; break;
			case '7':	temp = temp * 10 + 7; break;
			case '8':	temp = temp * 10 + 8; break;
			case '9':	temp = temp * 10 + 9; break;
			case '-':	if (check == true) {
					temp = temp*-1;
					}
					if (temp !=0) {
					System.out.println(temp);
					}
					sum = sum + temp;
					temp = 0;
					check = false; 				
					temp = (1 + temp) * -1;	break;
			default: 
				if (check == true) {
					temp = temp*-1;
				}
				if (temp !=0) {
				System.out.println(temp);
				}
				sum = sum + temp;
				temp = 0;
				check = false;
				break;
			}
			
		}
		if (check == true) {
			temp = temp*-1;
		}
		if (temp !=0) {
			System.out.println(temp);
			sum = sum + temp;
		}
		System.out.println("the sum is: " + sum);
	}

}
