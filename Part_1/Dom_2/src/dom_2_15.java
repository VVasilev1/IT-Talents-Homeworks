import java.util.Scanner;

public class dom_2_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int sum = 0;
		int i = 1;
	
		do {
			sum = sum + i;
			i++;
		} while(i<=num);
		
		System.out.println("The sum is " + sum);
		
		
	}

}
