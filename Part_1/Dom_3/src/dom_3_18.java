import java.util.Arrays;

public class dom_3_18 {

	public static void main(String[] args) {
		int [] array1 = new int [] {18,19,32,1,3, 4, 5, 6, 7, 8};
		int [] array2 = new int [] {1, 2, 3,4,5,16,17,18,27,11};
		int [] array3 = new int [array1.length];	
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > array2[i]) {
				array3[i] = array1[i];
			} else {
				array3[i] = array2[i];
			}
		}
		System.out.println(Arrays.toString(array3));

	}

}
