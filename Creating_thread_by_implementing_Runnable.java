import java.util.Random;

public class Creating_thread_by_implementing_Runnable {
   public static void main(String[] args) throws InterruptedException {
//		Thread thread1 = new Thread(new MyCounter(1));
//		Thread thread2 = new Thread(new MyCounter(2));
//
//		thread1.start();
//		thread2.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("one Thread "+i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=10;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("second Thread "+i);
                }
            }
        }).start();

        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main Thread "+i);
        }


    }
}
//  Creating thread by implementing Runnable

class MyCounter1 implements Runnable {
    private int threadNo;

    public MyCounter1(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i <= 9; i++) {
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value if i is: " + i + " and the thread number is: " + threadNo);
        }

    }

}
