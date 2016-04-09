
public class exam_test1 {
	static void cube(int num) {
		int solution = 0;
		if (num == 0) {
			System.out.println(num + " is a cube of " + solution);
			System.exit(1);
		}
		for (int index = 0; index <= num; index++) {
			if ((index * index * index) == num) {
				solution = index;
			}
			
		}
		if (solution>0) {
			System.out.println(num + " is a cube of " + solution);
		} else {
			System.out.println(num + " is a cube of nothing" );
		}
		
	}

	public static void main(String[] args) {
		int num = 27;
		cube(num);
	
	}

}
