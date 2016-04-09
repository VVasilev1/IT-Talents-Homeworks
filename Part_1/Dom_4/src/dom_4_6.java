
public class dom_4_6 {

	public static void main(String[] args) {
		int [] [] array = new int [][] {
			{11,12,13,14,15,16},
			{21,22,23,24,25,26},
			{31,32,33,34,35,36},
			{41,42,43,44,45,46},
			{51,52,53,54,55,56},
			{61,62,63,64,65,66}
		};
		int maxSum = 0;
		for (int i = 1; i< array.length; i = i+2) {
			int sum = 0;
			for (int t = 0; t<array[i].length; t ++) {
				System.out.print(array[i][t] + ", ");
				sum = sum + array[i][t];
			}
			System.out.println("suma: " + sum);
			maxSum = maxSum + sum;
		}
		System.out.println("Suma na elementite: " + maxSum);
 
	}

}
