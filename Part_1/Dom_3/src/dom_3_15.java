import java.util.Scanner;

public class dom_3_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete razmernostan na masiva: ");
		int num = scan.nextInt();
		double[] array = new double[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("A[" + i + "]= ");
			array[i] = scan.nextDouble();
		}
		scan.close();
		double max1 = 0, max2 = 0, max3 = 0;
		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i]) > max1) {
				max1 = array[i];
				if (Math.abs(array[i]) > max2) {
					if (Math.abs(array[i]) > max3) {
						max1 = max2;
						max2 = max3;
						max3 = array[i];
					} else {
						max1 = max2;
						max2 = array[i];
					}
				}
			}
		}
		System.out.println(max1 + " " + max2 + " " + max3);

	}

}
