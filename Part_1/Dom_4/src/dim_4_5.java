
public class dim_4_5 {

	public static void main(String[] args) {
		int [] [] array = new int [] [] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		int sumRed = 0;
		int sumCol = 0;
		for (int i = 0; i < array.length; i++) {
			int temp = 0;
			int temp2 = 0;
			for (int j = 0; j < array[0].length; j++) {
				temp = temp + array[i][j];
				temp2 = temp2 + array[j][i];
			}
			if (temp > sumRed) {
				sumRed = temp;
			}
			if (temp2 > sumCol) {
				sumCol = temp2;
			}
		}
		System.out.println("Nai-golqmata suma po redove e: " + sumRed);
		System.out.println("Nai-golqmata suma po koloni e: " + sumCol);
		
		if (sumRed > sumCol) {
			System.out.println("Maksimalnata suma po redove e > ot maksimalnata suma po kolkoni");
		} else if (sumRed < sumCol){
			System.out.println("Maksimalnata suma po redove e < ot maksimalnata suma po kolkoni");
		} else {
			System.out.println("Maksimalnata suma po redove e = na maksimalnata suma po kolkoni");
		}
		
	}

}
