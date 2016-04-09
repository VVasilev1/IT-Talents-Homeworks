import java.util.Arrays;

public class dom_3_5 {
		static void fill(int a []) {
			for (int i = 0; i < a.length; i++) {
				a[i] = i * 3;
			}
		}

	public static void main(String[] args) {
		int array[] = new int [10];
		
		fill(array);
		System.out.println(Arrays.toString(array));

	}

}
