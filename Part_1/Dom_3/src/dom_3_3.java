import java.util.Arrays;
import java.util.Scanner;

public class dom_3_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete chislo: ");
		int num = scan.nextInt();
		scan.close();
		int [] array = new int [10];
		array [0] = num;
		array [1] = num;
		for (int i = 2; i< array.length; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		System.out.println(Arrays.toString(array));
		

	}

}
