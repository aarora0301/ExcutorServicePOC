
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 
 */

/**
 * @author aarshi
 *
 */
public class Multithread {

	public static void main(String[] args) throws InterruptedException {

		startEndtask("1", 10000L);
		executeTasks(8);
		startEndtask("10", 100L);
	}

	private static boolean startEndtask(String taskNumber, long time) throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(time);
		System.out.println("Execute Task " + taskNumber);
		boolean checkAllTasks;
		return checkAllTasks = Integer.parseInt(taskNumber) == 10 ? true : false;
	}

	private static void executeTasks(int tasks) {
		Task task=new Task(tasks);
		ExecutorService executorService = Executors.newFixedThreadPool(tasks);
		for (int i = 0; i < tasks; i++)
		executorService.submit(task);
		executorService.shutdown();
		try {
			executorService.awaitTermination(50, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
