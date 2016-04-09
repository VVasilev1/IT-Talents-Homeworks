import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Enter Word");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (char word : text.toCharArray()) {
			if (!(map.containsKey(Character.toString(word)))) {
				
				map.put(Character.toString(word), 1);
			} else {
				
			map.put(Character.toString(word), map.get(Character.toString(word))+1);
			}
		}
		
		//find max
		int max = 0;
		
		for (Map.Entry<String, Integer>entry : map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
			}
		}
		System.out.println(max);
		int divider = 20 / max;
		
		for (Map.Entry<String, Integer>entry : map.entrySet()) {
			System.out.print(entry.getKey() + " -> " + entry.getValue() + "  ");
			
			for (int i =0; i< (entry.getValue()*divider); i++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
