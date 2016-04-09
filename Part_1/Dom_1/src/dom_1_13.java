import java.util.Scanner;

public class dom_1_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		if (t < -100 || t >100) {
			System.out.println("Greshni danni(ili si na druga planeta?)");
			System.exit(1);
		}
		if (t<-20) {
			System.out.println("Ledeno Studeno");
		}
		if (t>= - 20 && t <=0) {
			System.out.println("Studeno");
		}
		if (t >0 && t<15){
			System.out.println("Hladno");
		}
		if (t>=15 && t<=25) {
			System.out.println("Toplo");
		}
		if (t>25) {
			System.out.println("Goreshto");
		}

	}

}
