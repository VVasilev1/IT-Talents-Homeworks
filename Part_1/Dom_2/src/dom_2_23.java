
public class dom_2_23 {

	public static void main(String[] args) {
		int i = 1;
		int m = 1;
		
		while (i != 10) {
			System.out.println(i + " * " + m + " ; ");
			m++;
			if(m==10) {
				m = i + 1;
				i++;
				System.out.println();
			}
		}
		
	}

}
