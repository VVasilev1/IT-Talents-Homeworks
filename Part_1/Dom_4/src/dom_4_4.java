import java.util.Arrays;

public class dom_4_4 {

	public static void main(String[] args) {
		int [] [] array = new int [] [] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		int [] [ ] array2 = new int [] [] {	//Mnogo kofti zadacha. Zagubih 30 min dokato se usetq
			{1,2,3,4},						//che ne trqbva da kopiram masivite
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		for (int i = 0; i < array.length; i++) {
			int temp = 0;
			for (int t = 0; t< array[i].length; t++) {
				array[i][t] = array2[(array.length-1) - temp] [i];
				temp++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(array));
	}
}
