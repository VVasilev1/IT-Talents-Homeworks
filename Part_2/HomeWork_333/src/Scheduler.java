import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {
private Queue<ITask> tail;
	
	public Scheduler() {
		this.tail=new LinkedList<ITask>();
		
	}

	void push(ITask task) {
		this.tail.offer(task);
		
	}

	void passTask() throws Exception{
		ITask task=this.tail.poll();
		if(task==null){
			throw new Exception("no work left");
		}
		task.doWork();
		
	}

}
