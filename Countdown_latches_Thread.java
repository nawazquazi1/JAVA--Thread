import java.util.concurrent.CountDownLatch;

public class Countdown_latches_Thread {

//    Countdown latches

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(4);
        someThread1 thread1 = new someThread1(latch);
        someThread1 thread2 = new someThread1(latch);
        someThread1 thread3 = new someThread1(latch);
        someThread1 thread4 = new someThread1(latch);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("I am in main thread");

    }
}
class someThread1 extends Thread {
    private CountDownLatch latch;

    public someThread1(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Thread running with thread name " + Thread.currentThread().getName());
        System.out.println("Thread execution completed");
        System.out.println("*************************");
        latch.countDown();
    }

}
