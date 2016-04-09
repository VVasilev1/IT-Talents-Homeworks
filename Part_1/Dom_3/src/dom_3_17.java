import java.util.Scanner;

public class dom_3_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete razmernost na masiva: ");
		int num = scan.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("A[" + i + "]= ");
			array[i] = scan.nextInt();
		}
		scan.close();
		boolean isZig = true;
		for (int i = 1; i< array.length-1; i = i + 2) {
			if (array[i] < array[i-1] || array[i] < array[i+1]) {
				isZig = false;
			}
		}
		if (isZig == false) {
			System.out.println("Ne izpalniava iziskvaniqta za zigzoobrazna nagore redica");
		} else {
			System.out.println("Izpalniava iziskvaniqta za zigzoobrazna nagore redica");
		}
	}

}
