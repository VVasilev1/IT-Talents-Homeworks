
public class AllWork {
		private static final int CHECK_FOR_FREE_PLACES_NUMBER = 10;
		private static final int NUMBER_OF_TASKS = 10;
		private Task [] tasks;
		private int freePlacesForTasks;
		private int currentUnassignedTask;
		private int temp = 0;
		
		
		public int getCurrentUnassignedTask() {
			return currentUnassignedTask;
		}
		AllWork () {
			this.tasks = new Task[NUMBER_OF_TASKS];
			freePlacesForTasks = CHECK_FOR_FREE_PLACES_NUMBER;
			currentUnassignedTask = 0;
		}
		public void addTask (Task t) {
			if (t != null && freePlacesForTasks >0) {
				tasks[temp] = t;
				temp++;
			}		
		}
		public Task getNextTask () {
			
			currentUnassignedTask++;
			return tasks[currentUnassignedTask-1];
			
		}
		
		public boolean isAllWorkDone () {
			boolean check = true;
			for (Task t: tasks) {
				if (t.getWorkingHours() != 0) {
					check= false;
					break;
				}
			}
			return check;
		}
		}

