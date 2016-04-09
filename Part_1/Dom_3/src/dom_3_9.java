import java.util.Arrays;
import java.util.Scanner;

public class dom_3_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Vavedete razmernosta na masiva: ");
		int num = scan.nextInt();
		int [] array1 = new int [num];
		int temp = 0;
		for (int i = 0; i< array1.length;i++) {
			System.out.println("array[" + i + "] = ");
			array1[i] = scan.nextInt();
		}
		scan.close();
		for (int i = 0; i< array1.length/2; i++) {
			temp = array1[i];
			array1[i] = array1[array1.length-1-i];
			array1[array1.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(array1));
		for (int i = 0; i< array1.length/2; i++) {
			temp = array1[array1.length-1-i];
			array1[array1.length-1-i] = array1[i];
			array1[i] = temp;
		}
		System.out.println(Arrays.toString(array1));
}
}
