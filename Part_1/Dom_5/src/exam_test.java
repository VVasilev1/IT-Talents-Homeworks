
public class exam_test {
	static void frame(String array[]) {
		int max = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index].length() > max) {
				max = array[index].length();
			}
		}
		for (int index = 0; index < max + 2; index++) {
			System.out.print("*");
		}
		System.out.println();
		for (int index = 0; index < array.length; index++) {
			System.out.print("*" + array[index]);
			for (int t = array[index].length(); t< array.length; t++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int index = 0; index < max + 2; index++) {
			System.out.print("*");
		}

	}

	public static void main(String[] args) {
		String[] array = new String[] { "Hello", "World", "in", "a", "frame" };
		frame(array);
	}

}
