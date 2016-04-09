import java.util.Arrays;

public class dom_5_13 {
	static int [] meth (int array1[], int array2[]) {
		int [] array = new int [array1.length + array2.length];
		int temp = 0;
		for (int i = 0; i< array1.length; i++) {
			array[i] = array1[i];
		}
		for (int i = array1.length; i< array.length; i++) {
			array[i] = array2[temp];
			temp++;
		}
		return array;
	}
	public static void main(String[] args) {
		
		int array1[] = {2,5,7,8};
		int array2 [] = {8,3,5};
		
		System.out.println(Arrays.toString(meth(array1,array2)));
	}

}
