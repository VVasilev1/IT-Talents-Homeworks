import java.util.Scanner;

public class dom_3_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[7];
		int num = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("a[" + i + "]= ");
			array[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 5 && array[i] % 5 == 0) {
				System.out.print(array[i] + ", ");
				num = num + 1;
			}
		}
		System.out.print(" - " + num + "chisla.");

	}

}
