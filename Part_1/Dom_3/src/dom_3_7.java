import java.util.Arrays;

public class dom_3_7 {
		static void fill (int a [], int b[]) {
			b[0] = a[1];
			b[b.length-1]= a[a.length-2];
			for (int i = 1; i < a.length -1; i ++) {
				b[i] = a[i-1] + a[i+1];
			}
		}
	
	
	
	
	public static void main(String[] args) {
		int [] array1 = new int [] {2,32,65,8,30,6,12,56};
		int [] array2 = new int [array1.length];
		fill(array1, array2);
		System.out.println(Arrays.toString(array2));
		

	}

}
