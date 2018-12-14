package Multithreading;

public class AnonyMousThreads {

  public static void main(String[] h) {

    Thread thread = new Thread(new Runnable() {

      public void run() {
        for (int i = 0; i < 5; i++) {
          System.out.println("Thread Name :" + i);

          try {
            Thread.sleep(1);
          } catch (InterruptedException ex) {
          }


        }
      }
    });

    Thread thread1 = new Thread(new Runnable() {

      public void run() {
        for (int i = 0; i < 5; i++) {
          System.out.println("Thread Name :" + i);

//          try{
//            Thread.sleep(1);
//          }
//          catch(InterruptedException ex){}

        }
      }
    });

    thread.start();
    thread1.start();
  }

}
