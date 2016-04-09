import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedete A: ");
		int a = scan.nextInt();
		System.out.println("Vavedete B: ");
		int b = scan.nextInt();
		scan.close();
		int sum , sub , mult, div, ost;
		if (a == b) {
			System.out.println("Vavedohte ednakvi chisla. Molq opitaite otnovo.");
			System.exit(1);
		}
		
		sum = a + b;
		sub = a - b;
		mult = a * b;
		div = a / b;
		ost = a % b;
		
		System.out.println("Sborat na chislata e: " + sum);
		System.out.println("Razlikata na chislata e: " + sub);
		System.out.println("Proizvedenieto na chislata e :" + mult);
		System.out.println("Chastnoto na chislata e :" + div);
		System.out.println("Ostatak pri devenie e :" + ost);
		
			
		

	}

}
