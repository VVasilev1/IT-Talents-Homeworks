import java.util.Scanner;

public class dom_2_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		for (int i = n-1;i<(n-1) + (2*n); i = i+2) {
			for(int j = 0; j< n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
