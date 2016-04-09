
public class App {

	public static void main(String[] args) {
		Task t1 = new Task("Cleaning" , 9);
		Task t2 = new Task("DoingHomework" , 3);
		
		
		Employee e1 = new Employee("Vladimir");
		e1.setHoursLeft(8);
		e1.setCurrentTask(t2);
		Employee e2 = new Employee("Veronika");
		e2.setHoursLeft(8);
		e2.setCurrentTask(t1);
		
		e1.work();
		System.out.println();
		e2.work();

	}

}
