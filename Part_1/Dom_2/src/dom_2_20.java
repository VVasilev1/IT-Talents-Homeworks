
public class dom_2_20 {

	public static void main(String[] args) {
		int test = 0;
		for (int i = 1; i<=10; i++) {
			test = i;
			for (int t = 1; t<=10; t++) {
				System.out.print(test%10 + " ");
				test = test + 1;
			}
			System.out.println();
		}
		// Mnogo zabavna zadacha. Haresa mi.
	}

}
