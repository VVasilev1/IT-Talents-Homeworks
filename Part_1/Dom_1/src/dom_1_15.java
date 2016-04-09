import java.util.Scanner;

public class dom_1_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int chas = scan.nextInt();
		scan.close();
		if (chas <0 || chas >24) {
			System.out.println("Greshno vaveden chas");
			System.exit(1);
		}
		if (chas >= 18 || chas <=4) {
			System.out.println("Dobar Vecher");
		}
		if(chas >4 && chas <=9) {
			System.out.println("Dobro utro");
		}
		if(chas>9 && chas < 18 ) {
			System.out.println("Dobar den");
		}

	}

}
