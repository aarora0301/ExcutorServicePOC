
/**
 * @author aarshi
 *
 */
public class Task implements Runnable {
   
	int noOfTasks;
	Task(int tasks) {
		run();
	}

	public void run() {
		System.out.println("Excecuting task inside :" + Thread.currentThread().getName());
	}
}
