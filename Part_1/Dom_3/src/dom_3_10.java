import java.util.Scanner;

public class dom_3_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] array = new int [7];
		int sum= 0;
		for (int i = 0; i< array.length;i++) {
			System.out.println("array[" + i + "] = ");
			array[i] = scan.nextInt();
			sum = sum + array[i];
		}
		scan.close();
		int sred = sum / 7;
		int razl= Math.abs(array[0] - sred);
		int chisl = 0;
		for (int i = 1; i< array.length; i++) {
			if (Math.abs(array[i]-sred) < razl) {
				razl = Math.abs(array[i]-sred);
				chisl = i;
			}
		}
		System.out.println(array[chisl]);

	}

}
