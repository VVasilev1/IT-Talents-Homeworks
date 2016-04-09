import java.util.Arrays;

public class dom_3_4 {

	static void test(int[] a) {
		int[] b = new int[a.length / 2];
		int[] c = new int[a.length / 2];
		boolean check = true;
		int temp = 1;
		if (a.length % 2 == 0) {
			temp--;
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = a[(a.length / 2) + i + temp];
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] != c[c.length - i - 1]) {
				check = false;
			}
		}
		if (check == true) {
			System.out.println(Arrays.toString(a) + "  - ogledalen");
		} else {
			System.out.println(Arrays.toString(a) + "  - ne e ogledalen");
		}

	}

	public static void main(String[] args) {
		int[] array1 = new int[] { 5, 2, 3, 6, 8 };
		int[] array2 = new int[] { 5, 2, 3, 2, 5 };
		int[] array3 = new int[] { 0, 0, 0, 0, 0 };
		int[] array4 = new int[] { 5, 7, 3, 6, 8 };
		int[] array5 = new int[] { 5, 2, 8, 6, 8 };
		int[] array6 = new int[] { 1, 2, 3, 3, 2, 1 };
		int[] array7 = new int[] { 3, 7, 7, 3};
		int[] array8 = new int[] {8};
		int[] array9 = new int[] {1, 55, 1};
		int[] array10 = new int[] {6, 27, -1, 5, 7, 7, 5, -1, 27, 6};

		test(array1);
		test(array2);
		test(array3);
		test(array4);
		test(array5);
		test(array6);
		test(array7);
		test(array8);
		test(array9);
		test(array10);

	}

}
