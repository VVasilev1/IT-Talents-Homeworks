import java.util.Arrays;

public class dom_3_16 {

	public static void main(String[] args) {
		double [] array = new double [] { -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
		double [] clone = array.clone();
		System.out.println(Arrays.toString(array));
		for (int i = 0; i< array.length; i++) {
			if (array[i] < -0.231) {
				array[i] = ((i + 1) * (i + 1)) + 41.25;
			} else {
				array[i] = array[i] * (i + 1);
			}
		}
		System.out.println();
		System.out.println("New: " + Arrays.toString(array));
		System.out.println("Old: " + Arrays.toString(clone));

	}

}
