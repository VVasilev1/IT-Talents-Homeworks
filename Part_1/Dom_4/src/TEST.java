import java.util.Arrays;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[][] array = new int[length][length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				System.out.println("array[" + i + "][" + j + "]=");
				array[i][j] = scan.nextInt();
			}

		}

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				array[i][j] = array[length - j - 1][i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
		System.out.println(Arrays.deepToString(array));
	}

}