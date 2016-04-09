
public class dom_4_3 {

	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 4, 6, 3 }, { 5, 9, 7, 2 }, { 4, 8, 1, 9 }, { 2, 3, 4, 5 },

		};
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[0].length; j++) {
				sum = sum + array[i][j];
			}
	}
		double sred = (double)sum /  (double)(array.length * array[0].length);
		
		System.out.println("The sum is: " + sum);
		System.out.println("Sredno aritmetichnoto chislo e: " + sred);
		
	}

}
