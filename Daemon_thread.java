public class Daemon_thread {
    public static void main(String[] args) {
        System.out.println("starting Main thread");
        Daemon1 de0 = new Daemon1();
        de0.setDaemon(true);//
        de0.start();

    }
}

      //  daemon thread

class  Daemon1 extends Thread {
          public void run() {
              try {
                  System.out.println("In run Method: " + Thread.currentThread());
                  int i = 1;
                  while (true) {
                      try {
                          Thread.sleep(100);
                      } catch (InterruptedException e) {
                      }
                      System.out.println(i + " in run ...Woke up Again ");
                      i++;
                  }
              } finally {
                  System.out.println("Leaving run Method..");
              }
          }
      }