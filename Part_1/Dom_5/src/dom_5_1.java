import java.util.Scanner;

public class dom_5_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete parvata duma");
		String word1 = scan.next();
		System.out.println("Vavedete vtorata duma");
		String word2 = scan.next();
		scan.close();
		if (word1.length() > 40 || word2.length() > 40) {
			System.out.println("Greshno vavedeni danni");
			System.exit(1);
		}
		String word1_To_Upper = word1.toUpperCase();
		String word1_To_Lower = word1.toLowerCase();
		String word2_To_Upper = word2.toUpperCase();
		String word2_To_Lower = word2.toLowerCase();
		
		System.out.print(word1_To_Upper + " " + word1_To_Lower + " " + word2_To_Upper 
				+ " " + word2_To_Lower);
	
	}
	
	

}
