
public class App {

	public static void main(String[] args) {
		AllWork ItTalents = new AllWork();
		
		ItTalents.addTask(new Task("Cleaning", 3));
		ItTalents.addTask(new Task("Study", 5));
		ItTalents.addTask(new Task("Coding", 8));
		ItTalents.addTask(new Task("Checking Tests", 1));
		ItTalents.addTask(new Task("Sleeping", 12));
		ItTalents.addTask(new Task("Making a twitter site", 22));
		ItTalents.addTask(new Task("Flirting", 3));
		ItTalents.addTask(new Task("Having fun", 18));
		ItTalents.addTask(new Task("Not sleeping", 12));
		ItTalents.addTask(new Task("Being Happy", 9));
		
		Employee vladimir = new Employee ("Vladimir");
		Employee antonia = new Employee ("Antonia");
		
		vladimir.setAllwork(ItTalents);
		vladimir.setCurrentTask(ItTalents.getNextTask());
		
		antonia.setAllwork(ItTalents);
		antonia.setCurrentTask(ItTalents.getNextTask());
		while (1 > 0) {
			if (ItTalents.isAllWorkDone() == true) {
				System.out.println();
				System.out.println("All work done");
				break;
			}
			System.out.println();
			System.out.println("Starting a new work day");
			System.out.println();
			vladimir.strartWorkingDay();
			antonia.strartWorkingDay();
			vladimir.work();
			System.out.println();
			antonia.work();
		}

	}

}
