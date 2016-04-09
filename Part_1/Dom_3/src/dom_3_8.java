

public class dom_3_8 {

	public static void main(String[] args) {
		int[] array1 = new int[] { 5, 5, 3, 3, 3, 2, 3, 5, 8, 8, 9 };

		int index = 0;
		int count = 0;
		int broi = 1;
		int element = 0;

		for (int i = 0; i < array1.length - 1; i++) {

			if (array1[i] == array1[i + 1]) {
				index = array1[i];
				count++;
				if (count > broi) {
					broi++;
					element = index;
				}
			} else {
				index = 0;
				count = 1;
			}
		}
		for (int i = 0; i < broi; i++) {
			System.out.print(element + ", ");
		}
	}
}
