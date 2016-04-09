
public class App {

	public static void main(String[] args) throws Exception {
		
		Scheduler scheduler = new Scheduler();
		ITask eat = new Eating();
		ITask drink = new Drinking();
		ITask pray = new Praying();
		ITask hi = new SayingHi();
		
		scheduler.push(eat);
		scheduler.push(drink);
		scheduler.push(pray);
		scheduler.push(hi);
		
		scheduler.passTask();
		scheduler.passTask();
		scheduler.passTask();
		scheduler.passTask();
		
		

	}

}
