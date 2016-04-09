import java.util.Arrays;
import java.util.Scanner;

public class dom_3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete razmernosta na masiva");
		int num = scan.nextInt();
		int temp = 0;
		if(num % 2 != 0) {
			temp= temp -1;
		}
		int [] array1 = new int [num];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("a[" + i + "] = ");
			array1[i] = scan.nextInt();
		}
		scan.close();
		int [] array2 = new int [array1.length];
		for (int i = 0; i < array2.length/2; i++) {
			array2[i] = array1[i];
		}
		for (int i = array2.length/2; i< array2.length; i++) {
			array2[i] = (array2.length/2) - temp;
			temp ++;
		}
		
		System.out.println(Arrays.toString(array2));

	}

}
