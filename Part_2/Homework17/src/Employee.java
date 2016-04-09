
public class Employee {
	private static final int MAX_TASKS = 10;
	private static final int DAYLY_WORKING_HOURS = 8;
	private String name;
	private Task currentTask;
	private double hoursLeft;
	private AllWork allwork;
	public void strartWorkingDay () {
		this.setHoursLeft(DAYLY_WORKING_HOURS);
	}
	
	public AllWork getAllwork() {
		return allwork;
	}

	public void setAllwork(AllWork allwork) {
		this.allwork = allwork;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft > 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	Employee(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public void work() {
		if (this.currentTask != null) {
				System.out.println(this.name + " is working on " + this.currentTask.getName());
			if (this.hoursLeft > this.getCurrentTask().getWorkingHours()) {
				this.hoursLeft = this.hoursLeft - this.getCurrentTask().getWorkingHours();
				this.getCurrentTask().setWorkingHours(0);
				System.out.println(this.name + " has completed " + this.getCurrentTask().getName());
				showReport();
				if (this.allwork.getCurrentUnassignedTask() != MAX_TASKS) {
				this.currentTask = this.allwork.getNextTask();
				System.out.println(this.name + " has started working on " + this.getCurrentTask().getName());
				this.work();
				}
				
			}
			if (this.hoursLeft < this.getCurrentTask().getWorkingHours() && this.hoursLeft>0) {
				this.getCurrentTask().setWorkingHours(this.getCurrentTask().getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
				showReport();
				
			}
			if (this.hoursLeft == this.getCurrentTask().getWorkingHours()) {
				this.getCurrentTask().setWorkingHours(0);
				this.hoursLeft = 0;
				System.out.println(this.name + " has completed " + this.getCurrentTask().getName());
				showReport();
				if (this.allwork.getCurrentUnassignedTask() != MAX_TASKS) {
				this.currentTask = this.allwork.getNextTask();
				}
			}
			
			
			
		}
	}

	public void showReport() {
		System.out.println("Name: " + this.name);
		System.out.println("Task: " + this.currentTask.getName());
		System.out.println("Employee working hours left: " + this.hoursLeft);
		System.out.println("Time left to finish task " + this.getCurrentTask().getWorkingHours());
	}
}
