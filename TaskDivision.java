package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskDivision {

  public static void main(String[] h) {
    executetasksinParallel(6);
  }

  public static void executetasksinParallel(int tasksCount) {
    ExecutorService es = Executors.newFixedThreadPool(6);
    try {

      Future<String> f4 = es.submit(new Task());
      Future<String> f5 = es.submit(new Task());
      Future<String> f6 = es.submit(new Task());
      Future<String> f7 = es.submit(new Task());
      Future<String> f8 = es.submit(new Task());
      Future<String> f9 = es.submit(new Task());
      Future<String> f11 = es.submit(new Task());
      Future<String> f12 = es.submit(new Task());
      Future<String> f13 = es.submit(new Task());
      Future<String> f14 = es.submit(new Task());
      Future<String> f15 = es.submit(new Task());
      Future<String> f16 = es.submit(new Task());

    } catch (Exception ex) {
    }

    es.shutdown();
    }
}

class Task implements Callable<String> {

  String mystr = Thread.currentThread().getName();

  public String call() throws Exception {
    Thread.sleep(3000000);
    return mystr + " in Execution";
  }
}
