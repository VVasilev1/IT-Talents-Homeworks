
public class dom_3_6 {
		static void check(int a [], int b[]) { 
			boolean temp = true;
			if (a.length == b.length) {
				System.out.print("Razmera im e ednakav. ");
				for (int i = 0; i< a.length; i++) {
					if (a[i] != b[i]) {
						temp = false;
					}
				}
				if (temp == true) {
					System.out.print("Masivite sa ednakvi.");
				} else {
					System.out.print("Masivite ne sa ednakvi.");
				}
			} else {
				System.out.print("Razmera ne im e ednakav. Masivite ne sa ednakvi.");
			}
			System.out.println();
		}

	public static void main(String[] args) {
		int [] array1 = new int [] {2,5,6,2};
		int [] array2 = new int [] {3,5,2};
		int [] array3 = new int [] {2,5,6,2};
		int [] array4 = new int [] {3,5,8};
		System.out.print("array 1 and array 2: ");
		check(array1, array2);
		System.out.print("array 2 and array 3: ");
		check(array2,array3);
		System.out.print("array 1 and array 3: ");
		check(array1,array3);
		System.out.print("array 2 and array 4: ");
		check(array2,array4);

	}

}
