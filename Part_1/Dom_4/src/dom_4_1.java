
public class dom_4_1 {

	public static void main(String[] args) {
		int[][] array = new int[][] { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 }, { 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };
				
		int max = array[0][0];
		int min = array[0][0];
		
		for (int i = 0; i< array.length; i ++) {
			for (int t = 0; t< array[i].length; t++) {
				if (array[i][t] > max) {
					max = array[i][t];
				}
				if (array[i][t] < min) {
					min = array[i][t];
				}
			}
		}
		System.out.println("Min is: " + min);
		System.out.println("Max is: " + max);
		

	}

}
