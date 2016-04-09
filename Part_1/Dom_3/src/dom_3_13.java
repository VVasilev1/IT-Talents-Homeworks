import java.util.Arrays;
import java.util.Scanner;

public class dom_3_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int temp = Integer.toBinaryString(num).length();
		int [] array = new int [temp];
		int i = temp-1;
		while (num >0) {
			array [i] = num % 2;
			num = num /2;
			i--;
		}
		System.out.println(Arrays.toString(array));
	}

}
