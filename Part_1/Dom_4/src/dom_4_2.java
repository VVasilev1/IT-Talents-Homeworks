import java.util.Scanner;

public class dom_4_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete razmernostta na masiva");
		int length = scan.nextInt();
		int[][] array = new int[length][length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				System.out.println("a[" + i + "][" + j + "]=");
				array[i][j] = scan.nextInt();
			}
		}
		scan.close();
		int temp = 0;
		int temp2 = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][temp] + ", ");
			temp++;
		}
		System.out.println();
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[temp2][i] + ", ");
			temp2++;
		}
	}

}
