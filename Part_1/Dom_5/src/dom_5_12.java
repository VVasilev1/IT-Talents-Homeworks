import java.util.Arrays;

public class dom_5_12 {
	static int[] meth(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(meth(5)));
	}

}
