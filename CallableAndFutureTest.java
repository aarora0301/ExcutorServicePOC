package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import sun.jvm.hotspot.runtime.Thread;

public class CallableAndFutureTest {
  public static void main(String [] h){
    ExecutorService es = Executors.newFixedThreadPool(3);
    Future<String> f1 = es.submit(new MyTask("callable"));
    Future<String> f2 = es.submit(new MyTask("future"));
    Future<String> f3 = es.submit(new MyTask("codesjava"));
    Future<String> f4 = es.submit(new MyTask("codesjava executor service"));
    Future<String> f5 = es.submit(new MyTask("executors classes"));

    try {
      System.out.println("1. " + f1.get());
      System.out.println("2. " + f2.get());
      System.out.println("3. " + f3.get());
      if(f4.isDone()){
        System.out.println("4. " + f4.get());
      }else{
        System.out.println("waiting");
      }
      System.out.println("5. " + f5.get());
    } catch (Exception e) {
      e.printStackTrace();
    }
    es.shutdown();
  }

  }



class MyTask implements Callable<String>{

  String mystr;

  MyTask(String str){
    mystr=str;
  }

  public String call() throws Exception {
     return "Executing thread inside callable:" +mystr;
  }
}
