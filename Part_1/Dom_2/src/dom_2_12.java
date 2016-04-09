
public class dom_2_12 {

	public static void main(String[] args) {
		for (int i = 100; i<=999; i++) {
			if (((i % 10) == (i / 100)) || ((i%10) == ((i%100)/10)) || (((i%100)/10) == (i / 100) )) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
